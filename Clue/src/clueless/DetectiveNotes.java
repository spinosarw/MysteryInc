package clueless;

/**
 * 
 * @author robjose
 *
 */
public class DetectiveNotes {
	private boolean[] suspects;
	private boolean[] weapons;
	private boolean[] rooms;
	
	public DetectiveNotes() {
		suspects = new boolean[6];
		weapons = new boolean[6];
		rooms = new boolean[9];
	}
	
	public void setSuspect(int suspect, boolean value) {
		this.suspects[suspect] = value;
	}
	
	public void setWeapon(int weapon, boolean value) {
		this.weapons[weapon] = value;
	}
	
	public void setRoom(int room, boolean value) {
		this.rooms[room] = value;
	}
	
	public boolean[] getSuspects() {
		return suspects;
	}
	
	public boolean[] getWeapons() {
		return weapons;
	}
	
	public boolean[] getRooms() {
		return rooms;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		String separator = "-----------------";
		
		sb.append("DETECTIVE NOTES");
		sb.append("\n\n");
		sb.append("Suspects");
		sb.append("\n");
		sb.append(separator);
		sb.append("\n");
		for(int i=0; i<6; i++) {
			sb.append(Constants.SUSPECTS[i]);
			for(int j=14-Constants.SUSPECTS[i].length(); j>0; j--) {
				sb.append(" ");
			}
			sb.append("|");
			sb.append(suspects[i] ? "X" : " ");
			sb.append("|\n");
			sb.append(separator);
			sb.append("\n");
		}
		sb.append("\n");
		sb.append("Weapons");
		sb.append("\n");
		sb.append(separator);
		sb.append("\n");
		for(int i=0; i<6; i++) {
			sb.append(Constants.WEAPONS[i]);
			for(int j=14-Constants.WEAPONS[i].length(); j>0; j--) {
				sb.append(" ");
			}
			sb.append("|");
			sb.append(weapons[i] ? "X" : " ");
			sb.append("|\n");
			sb.append(separator);
			sb.append("\n");
		}
		sb.append("\n");
		sb.append("Rooms");
		sb.append("\n");
		sb.append(separator);
		sb.append("\n");
		for(int i=0; i<9; i++) {
			sb.append(Constants.ROOMS[i]);
			for(int j=14-Constants.ROOMS[i].length(); j>0; j--) {
				sb.append(" ");
			}
			sb.append("|");
			sb.append(rooms[i] ? "X" : " ");
			sb.append("|\n");
			sb.append(separator);
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		DetectiveNotes dn = new DetectiveNotes();
		
		dn.setSuspect(Constants.COL_MUSTARD, true);
		dn.setSuspect(Constants.MR_GREEN, true);
		dn.setSuspect(Constants.MISS_SCARLET, true);
		
		dn.setWeapon(Constants.KNIFE, true);
		dn.setWeapon(Constants.ROPE, true);
		dn.setWeapon(Constants.WRENCH, true);
		dn.setWeapon(Constants.CANDLESTICK, true);
		
		dn.setRoom(Constants.BALL_ROOM, true);
		dn.setRoom(Constants.HALL, true);
		dn.setRoom(Constants.LIBRARY, true);
		dn.setRoom(Constants.STUDY, true);
		dn.setRoom(Constants.LOUNGE, true);
		
		System.out.println(dn);
	}
}
