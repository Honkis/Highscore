import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;


public class HighscoreList {
	private ArrayList<HighscoreItem> HighscoreList = new ArrayList<HighscoreItem>();
	private String name;
	private int score;
	Scanner scan = new Scanner(System.in);
	
	/* Låter användaren göra ett highscore som hamnar i arraylisten. kontrolerar även så att dom bara kan sätta in Int i score*/
	public void addHighScore(){
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your name ");
        name = scan.nextLine();

        while(true){
        	try{	
        		Scanner scan2 = new Scanner(System.in);
        		System.out.println("Enter your highscore");
        		score = scan2.nextInt();
        		break;
        	}
        	catch (InputMismatchException t){
        		System.out.println("You must enter a number!");
        	}
        }
		HighscoreList.add(new HighscoreItem(name , score));
		
		
		System.out.println("You have enterd the name : "+ name + ". With the score of : " + score);
	}
	/*gör ett text doc och skriver in dom 5 första( 0 -4) HIghscoreItem på varsin rad i text doc.
	 Bör inte göra ett nytt doc om det redan finns ett*/
	public void makeList(){
		try {
			
			File file = new File("highList.txt");
			PrintWriter writer;
			writer = new PrintWriter(file);
			writer.println("Nr:     Name:   Highscore");
			for(int i = 0; i < 5; ++i){
				
				writer.println(HighscoreList.get(i)); 
			}						
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	// skriver ut 6 första raderna i highList.txt . hela top 5 i highscorelisten.
	public void readList()
	{
		try {
			File file = new File("highList.txt"); 
			Scanner scanner;
			scanner = new Scanner(file);
			
			String text = scanner.nextLine();
			System.out.println(text);
			String text2 = scanner.nextLine();
			System.out.println("1" + text2);
			String text3 = scanner.nextLine();
			System.out.println("2" + text3);
			String text4 = scanner.nextLine();
			System.out.println("3" + text4);
			String text5 = scanner.nextLine();
			System.out.println("4" + text5);
			String text6 = scanner.nextLine();
			System.out.println("5" + text6);
			System.out.println();
			
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	// tömmer arralisten HighscoreList. och sätter in 5 nya HIghscoreitems med hjälp av shootBlank().
	public void eraseList() {
		HighscoreList.clear();
		shootBlank();
		
	}
	// sorterar HighscoreList 
	public void sortList() {
		Collections.sort(HighscoreList);
		
	}
	// skriver in 5 "blanka" highscoreItem objects. för att fylla ut listan.
	public void shootBlank(){
		for(int i = 0 ; i < 5 ; ++i){
			HighscoreList.add(new HighscoreItem("unknown" , 0));
		}
	}

}
