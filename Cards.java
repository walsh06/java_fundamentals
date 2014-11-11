public class Cards
{
	public static void main(String[] args)
	{
		//declare arrays to hold the card suit names and card values
		String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
		String[] values = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", 
							"Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		//declare an array to hold the cards dealt out
		int dealtCards[] = new int[5];
		int currentCard, cardCount;
		
		for(int i = 0; i < dealtCards.length; i++)
		{
			//generate a random number between 0 and 52 to represent the cards
			//store the number
			currentCard = (int)(Math.random() * 52) ;
			dealtCards[i] = currentCard;
		}

		System.out.println("Hand:");
		for(int i = 0; i < dealtCards.length; i++)
		{
			int card = dealtCards[i];
			//print out the suit and value of the card using the mod function
			System.out.println("- " + values[card%13] + " of " + suits[card%4]);
		}
	}
}

/*
boolean cardFound = false;
while(cardCount < 5)
		{
			cardFound = false;
			currentCard = (int)(Math.random() * 52) 

			//loop through all numbers
			for(int i =0; i < dealtCards.length; i++)
			{
				//if the random number is already in the array
				if(dealtCards[i] == currentCard)
				{
					numFound = true;
					break;
				}
			}

			//if the number was not already there
			//add it in and increment the count
			if(!numFound)
			{
				dealtCards[cardCount] = currentCard;
				cardCount++;
			}
		}
		*/