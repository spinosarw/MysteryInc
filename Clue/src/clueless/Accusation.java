package clueless;

public class Accusation
{
	public RoomCard room;
	public WeaponCard weapon;
	public SuspectCard suspect;

	public Accusation(RoomCard r, WeaponCard w, SuspectCard s)
	{
		room = r;
		weapon = w;
		suspect = s;
	}
}
