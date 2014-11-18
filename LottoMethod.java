public class LottoMethod
{
	public static void main(String[] args)
	{
		int[] lotto = new int[6];
		int numbersCount = 0;
		while(numbersCount < 6)
		{	
			//generate random number
			currentNum = (int)(Math.random() * 48) + 1;

			//check if the number is in the array already
			if(!contains(lotto, currentNum))
			{
				//add number to the array
				lotto[numbersCount] = currentNum;
				numbersCount++;
			}
		}
	}

	/**Check if a number is in an array */
	public static boolean contains(int[] arr, int n)
	{
		//loop through the array
		for(int i =0; i < arr.length; i++)
		{
			//if the number is already in the array
			if(arr[i] == n)
			{
				return true;
			}
		}
		return false;
	}

}