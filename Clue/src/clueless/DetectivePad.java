package clueless;

import java.util.List;

public class DetectivePad
{
	List<String> myNotes;
	
	public DetectivePad()
	{
		myNotes.add("Welcome to the Detective Pad! Make notes in here\n\n");
	}

	public void addNotes(String note)
	{
		myNotes.add(note);
	}

	public List<String> getNotes()
	{
		return myNotes;
	}
}
