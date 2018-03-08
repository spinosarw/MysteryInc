/**
 * 
 */
package clueless;

/**
 * @author joshfry
 *
 */
public class Player {
	public String detectiveNotes;
	public String suspectName;
	public String positionOnBoard;
	public String cards;

public Player(String detectiveNotes) {
	this.detectiveNotes = detectiveNotes;
}
public String makeAccusation() {
	return suspectName;
}
public String makeSuggestion() {
	return detectiveNotes;
}
public String displayCard() {
	return cards;
}
public String move() {
	return positionOnBoard;
}
}
