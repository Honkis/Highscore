/*
 * sjävla highscoren ( item) med namn och poäng
 */
public class HighscoreItem implements Comparable<HighscoreItem> {
	private String name;
	private int score;
	
	public HighscoreItem(String name, int score){
		this.name = name;
		this.score = score;
	}
	// skriver över toString till den Stringen jag vill ha
	@Override
	public String toString(){
		return "       " + name + "        " + score;
	}
	// returnar int på score
	public int toInt(){
		return score;
	}
	//ger sort vad den ska jämföra.
	@Override
	public int compareTo(HighscoreItem item) {
		return item.toInt()-score;
	}
}
