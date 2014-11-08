public class Array1
{
	public static void main(String[] args)
	{
		//declare integer array of size 6
		int[] counters = new int[6];
		int num = 0;

		//loop 100 times
		for(int i =0; i < 100; i++)
		{
			//generate random number between 0 and 5
			num = (int)(Math.random() * 6);

			//increment the position "num" in counters
			counters[num]++;
		}

		System.out.println("Num - Count");
		for(int i = 0; i < counters.length; i++)
		{
			//print each number in array
			System.out.println((i + 1) + "      " + counters[i]);
		}
	}
}