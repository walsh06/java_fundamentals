public class IntegerMethods
{
	public static void main(String[] args)
	{
		for(int i = 2; i < 20; i++)
		{
			if(isPrime(i))
			{
				System.out.println(i + " is Prime");
			}
		}
		
	}

	/**check if a number is even*/
	public static boolean isEven(int n)
	{
		//call the isDivisible method
		return isDivisible(n, 2);
	}

	/**check if a number is odd*/
	public static boolean isOdd(int n)
	{	
		//call the isDivisible method
		return !isDivisible(n, 2);
	}

	/**check if a number is divisible by another*/
	public static boolean isDivisible(int n, int p)
	{
		//use the ternary operator to check if the mod is 0
		return n % p == 0? true: false;
	}

	/**check if a number is prime*/
	public static boolean isPrime(int n)
	{
		//loop from 2 to half the value of the number we are checking
		for(int i = 2; i <= n/2; i++)
		{
			//if its evenly divisible
			if(n % i == 0)
			{
				//not prime
				return false;
			}
		}
		//the number is prime
		return true;
	}
}