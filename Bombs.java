import java.util.Scanner;

public class Bombs
{
	public static void main(String[] args)
	{
		//declare variables
		char[][] field;
		int bombs, rows, columns, r, c;
		Scanner in = new Scanner(System.in);

		//take input for rows, columns and number of bombs
		System.out.println("Enter number of rows");
		rows = in.nextInt();

		System.out.println("Enter number of columns");
		columns = in.nextInt();

		System.out.println("Enter number of bombs");
		bombs = in.nextInt();

		//create array with parameters passed in
		field = new char[rows][columns];

		//loop through the array and set all spaces to #
		for(int i = 0; i < rows; i++)
		{
			for(int j =0; j < columns; j++)
			{
				field[i][j] = '#';
			}

		}

		//loop "bomb" times and add bombs at random positions in array
		for(int i =0; i < bombs; i++)
		{
			r = (int)(Math.random()*rows);
			c = (int)(Math.random()*columns);

			field[r][c] = 'B';
		}

		//print the field
		for(int i = 0; i < rows; i++)
		{
			for(int j =0; j < columns; j++)
			{
				System.out.print(field[i][j]);
			}
			System.out.println();
		}

	}
}