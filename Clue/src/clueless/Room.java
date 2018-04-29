package clueless;

public class Room extends Location{

	String name;
	
	public Room()
	{
		name = "null";
	}

	public void setName(String string)
	{
		name = string;
	}

	public String getName()
	{
		return name;
	}
}
