public class Array3
{
	public static void main(String[] args)
	{
		//declare variables
		int[] lottoNumbers = new int[6];
		int numbersCount = 0, currentNum;
		boolean numFound = false;

		//keep looping until 6 numbers have been added
		while(numbersCount < 6)
		{	
			//reset boolean variable to false
			numFound = false;

			//generate random number
			currentNum = (int)(Math.random() * 48) + 1;

			//loop through all numbers
			for(int i =0; i < lottoNumbers.length; i++)
			{
				//if the random number is already in the array
				if(lottoNumbers[i] == currentNum)
				{
					numFound = true;
					break;
				}
			}

			//if the number was not already there
			//add it in and increment the count
			if(!numFound)
			{
				lottoNumbers[numbersCount] = currentNum;
				numbersCount++;
			}
		}

		//Print out result
		System.out.println("The winning numbers were: ");
		for(int i =0; i < lottoNumbers.length; i++)
		{
			System.out.print(lottoNumbers[i] + " ");
		}
		System.out.println();
	}
}