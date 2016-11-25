/*
 * sj�vla highscoren ( item) med namn och po�ng
 */
public class HighscoreItem implements Comparable<HighscoreItem> {
	private String name;
	private int score;
	
	public HighscoreItem(String name, int score){
		this.name = name;
		this.score = score;
	}
	// skriver �ver toString till den Stringen jag vill ha
	@Override
	public String toString(){
		return "       " + name + "        " + score;
	}
	// returnar int p� score
	public int toInt(){
		return score;
	}
	//ger sort vad den ska j�mf�ra.
	@Override
	public int compareTo(HighscoreItem item) {
		return item.toInt()-score;
	}
}
