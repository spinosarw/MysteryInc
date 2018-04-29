package clueless;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class CardDeck
{
	public static final int WEAPON_CARD = 0;
	public static final int SUSPECT_CARD = 1;
	public static final int ROOM_CARD = 2;
	
	List<Card> cardDeck;

	public CardDeck()
	{
		// Create full deck
		//
		// Create the Weapon cards
		for (int index = 0; index < Constants.WEAPONS.length; index++)
		{
			WeaponCard w = new WeaponCard();
			w.setName(Constants.WEAPONS[index]);
			cardDeck.add(w);
		}
		//
		// Create the Suspect cards
		for (int index = 0; index < Constants.SUSPECTS.length; index++)
		{
			SuspectCard s = new SuspectCard();
			s.setName(Constants.SUSPECTS[index]);
			cardDeck.add(s);
		}
		//
		// Create the Room cards
		for (int index = 0; index < Constants.ROOMS.length; index++)
		{
			RoomCard r = new RoomCard();
			r.setName(Constants.ROOMS[index]);
			cardDeck.add(r);
		}
	}
	
	public Card drawRandomCard(int cardType)
	{
		Card randomCard;
		Iterator cards = cardDeck.iterator();
		while(cards.hasNext())
	    {
			randomCard = (Card) cards.next();

		  	if (cardType == WEAPON_CARD && randomCard instanceof WeaponCard)
	    		{
	    			cards.remove();
	    			return randomCard;
	    		}
	    		if (cardType == SUSPECT_CARD && randomCard instanceof SuspectCard)
	    		{
	    			cards.remove();
	    			return randomCard;
	    		}
	    		if (cardType == ROOM_CARD && randomCard instanceof RoomCard)
	    		{
	    			cards.remove();
	    			return randomCard;
	    		}
	    }
		// If we are unable to draw the specified cardType, return null
		return null;
	}
	
	public Card drawCard()
	{
		Card randomCard = null;
		if (!cardDeck.isEmpty())
		{
			randomCard = cardDeck.remove(0);
			randomizeRemaining();
		}
		return randomCard;
	}
	
	public void randomizeRemaining()
	{
		// Put all the cards into an oldDeck list and save the Size
		List<Card> oldDeck = cardDeck;
		int deckSize = cardDeck.size();
		// now clear the deck 
	    cardDeck.clear();

		Random rg = new Random();
		rg.setSeed(System.currentTimeMillis());
		while (oldDeck.size() > 0)
		{
			int num = rg.nextInt(deckSize--); // subtract one
	
			// take a random card from the old deck
			cardDeck.add((Card) oldDeck.get(num));
			oldDeck.remove(num); // then remove it
		}
	}
}
