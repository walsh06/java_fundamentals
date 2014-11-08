import java.util.Scanner;

public class JavaFundamentalsOne
{
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		boolean correct = false;
		int guess, number = (int)(Math.random() * 10)  + 1;

		while(!correct)
		{
			System.out.print("Enter guess:" );

			guess = scan.nextInt();

			if (guess == number)
			{
				correct = true;
			}
			else
			{
				System.out.println(" ..... Wrong");
			}
		}

		System.out.println(number + " was correct!!");
	}
}













//else if (guess < number)
//{
//	System.out.println("... Higher");
//}
//else 
//{
//	System.out.println("... Lower");
//}