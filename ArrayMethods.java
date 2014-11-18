public class ArrayMethods
{
	public static void main(String[] args)
	{
		//declare arrays
		int[] numbers = {1,2,3,4,5,7,8};
		int[] otherNums = {2,3,4,5,1,3,2,2};

		//call print method	
		printArray(numbers);
		printArray(otherNums);

		//call contain method
		if(contains(numbers, 7))
		{
			System.out.println("7 is in array");
		}

		//call getIndex method
		int index = getIndex(numbers(4));

		System.out.println("4 is at position " + index);
	}

	/**Check if int n is in the array*/
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

	/**print each element of an array*/
	public static void printArray(int[] arr)
	{
		//loop through the array
		for(int i =0; i < arr.length; i++)
		{	
			//print each element
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	/** return the index of an element in an array*/
	public static int getIndex(int[] arr, int n)
	{
		//loop through the array
		for(int i =0; i < arr.length; i++)
		{
			//if the number is at position i
			if(arr[i] == n)
			{
				return i;
			}
		}
		//number not found
		return -1;
	}

}