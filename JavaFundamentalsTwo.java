import java.util.Scanner;

public class JavaFundamentalsTwo
{
	public static void main(String[] args)
	{
		String word, vowels = "aeiouAEIOU";
		char currentChar;
		int count = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a word:");
		word = scan.nextLine();

		for(int i = 0; i < word.length(); i++)
		{
			currentChar = word.charAt(i);

			if(vowels.indexOf(currentChar) != -1)
			{
				count++;
			}
		}

		System.out.println("Number of vowels in " + word + ": " + count);
	}
}