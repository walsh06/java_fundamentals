import java.util.Scanner;

public class Blackjack
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		//declare an array to hold the cards dealt out
		int[] myHand = new int[5];
		int cardCount = 0;
		boolean gameOver = false, win = false;

		resetHand(myHand);
		dealCard(myHand, cardCount);
		cardCount++;
		dealCard(myHand, cardCount);
		cardCount++;


		//run game loop
		while(!gameOver)
		{
			//display the hand
			printHand(myHand);

			//give choics to player and take input
			System.out.println("1) Hit");
			System.out.println("2) Stick");
			int choice = in.nextInt();

			//check what input they entered
			if(choice == 1)
			{
				dealCard(myHand, cardCount);
				cardCount++;
			}
			else if(choice == 2)
			{
				gameOver = true;
			}

			//check if they are over 21 and end game
			if(getHandValue(myHand) > 21)
			{
				gameOver = true;
			}
		}

		printHand(myHand);
	}

	/**deal a new card to the hand */
	public static void dealCard(int[] hand, int num)
	{
		int card = 0;
		//loop while the card has already been used
		do
		{
			//get a new random card
			card = (int)(Math.random() * 52) ;

		}while(cardPlayed(hand, card));

		//add the card to the hand
		hand[num] = card;
	}

	/**check if a card is in the hand already*/
	public static boolean cardPlayed(int[] cards, int n)
	{
		//loop through the array
		for(int i =0; i < cards.length; i++)
		{
			//if the number is already in the array
			if(cards[i] == n)
			{
				return true;
			}
		}
		return false;
	}

	/**reset a hand to start a new game*/
	public static void resetHand(int[] hand)
	{
		for(int i = 0; i < hand.length; i++)
		{
			//set element i to -1
			hand[i] = -1;
		}
	}

	/**Print out the values of hand*/
	public static void printHand(int[] hand)
	{
		//declare arrays to hold the card suit names and card values
		String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
		String[] values = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", 
							"Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		
		System.out.println("Hand:");
		//for each loop
		//loop through all variables in an array and get out each element
		for(int card: hand)
		{
			if(card != -1)
			{
				//print out the suit and value of the card using the mod function
				System.out.println("- " + values[card%13] + " of " + suits[card%4]);
			}
		}
	}

	/**Get the numeric value of a hand of cards */
	public static int getHandValue(int [] hand)
	{
		//declare array of values
		int[] cardValues = {11,2,3,4,5,6,7,8,9,10,10,10,10};
		int total = 0;

		//for each card get its value and add to total
		for(int card: hand)
		{
			if(card != -1)
			{
				total += cardValues[card%13];
			}
		}

		//return total
		return total;
	}	

}

