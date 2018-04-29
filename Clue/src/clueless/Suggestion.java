package clueless;

public class Suggestion
{
	public RoomCard room;
	public WeaponCard weapon;
	public SuspectCard suspect;

	public Suggestion(RoomCard r, WeaponCard w, SuspectCard s)
	{
		room = r;
		weapon = w;
		suspect = s;
	}
}
