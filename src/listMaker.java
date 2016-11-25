
import java.util.InputMismatchException;
import java.util.Scanner;


public class listMaker {
	private HighscoreList l = new HighscoreList();
	
	public void startList(){	
		int c;
		l.shootBlank();
		// H�ller anv�ndaren i programmet tills case 4 avslutar. o�ndligt while loop sjukt bra anv�nd mer
		while(true){
			System.out.println("----Highscore menu-----");
			System.out.println("1. Insert new Highscore");
			System.out.println("2. Print Highscore list");
			System.out.println("3. Reset the list");
			System.out.println("4. Quit");
			System.out.println("Please make your choice and press enter");
			System.out.println();
			// input int f�r att komma till olika case felhanterar om anv�ndaren skriver in n�t annat �n 1-4
			while(true){
				try{	
					Scanner scan = new Scanner(System.in);
					c = scan.nextInt();
					if(c <= 4 || c >= 1 ){
						break;
					}
					
				}catch (InputMismatchException e){
					System.out.println("----Highscore menu-----");
					System.out.println("1. Insert new Highscore");
					System.out.println("2. Print Highscore list");
					System.out.println("3. Reset the list");
					System.out.println("4. Quit");
					System.out.println("Please make your choice and press enter");
					System.out.println();
				}
			}
			switch(c){
			//adderar ett higscore obj till highscorelisten
			case 1:
				l.addHighScore();
				
				break;
			// sorterar arraylisten(highscorelist), g�r txt fil. sedan skriver ut den.
			case 2:
				l.sortList();
				l.makeList();
				l.readList();
				break;
			// clearar highscorelist , skriver in 5 f�rbest�mdra obj. skriver �ver det gammla text filen. och skriver ut textfilen.
			case 3:
				l.eraseList();
				l.makeList();
				l.readList();
				break;
			// skriver hej d� och st�nger av programmet.
			case 4:
				System.out.println("Now exeting highscore list.");
				System.exit(0);
			}
		}
	}
}
