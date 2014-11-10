public class Array3
{
	public static void main(String[] args)
	{
		int[] lottoNumbers = new int[6];
		int numbersCount = 0, currentNum;
		boolean numFound = false;
		while(numbersCount < 6)
		{
			numFound = false;
			currentNum = (int)(Math.random() * 48) + 1;

			for(int i =0; i < lottoNumbers.length; i++)
			{
				if(lottoNumbers[i] == currentNum)
				{
					numFound = true;
					break;
				}
			}

			if(!numFound)
			{
				lottoNumbers[numbersCount] = currentNum;
				numbersCount++;
			}
		}

		System.out.println("The winning numbers were: ");
		for(int i =0; i < lottoNumbers.length; i++)
		{
			System.out.print(lottoNumbers[i] + " ");
		}
		System.out.println();
	}
}