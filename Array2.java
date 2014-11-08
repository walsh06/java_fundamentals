import java.util.Scanner;
public class Array2
{
	public static void main(String[] args)
	{
		//declare array of nums
		int[] nums; // = {2,5,4,1,6,8,3};

		//set initial index to 0 and numer to the first number
		int smallIndex = 0, smallNum = nums[0];

		Scanner in = new Scanner(System.in);

		System.out.println("How many numbers:");
		int totalNums = in.nextInt();

		//create array of size specified by the user
		nums = new int[totalNums];
		for(int i = 0; i < totalNums; i++)
		{	
			System.out.print("Enter num:");
			//store each number in the array
			nums[i] = in.nextInt();
		}

		//iterate through the array
		for(int i = 1; i < nums.length; i++)
		{
			//compare each number to the current smallest number
			if(nums[i] < smallNum)
			{
				//update the index and value of smallest number
				smallNum = nums[i];
				smallIndex = i;
			}
		}

		System.out.println("The smallest number was " + smallNum + " at position " + smallIndex);
	}
}

