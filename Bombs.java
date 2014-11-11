import java.util.Scanner;

public class Bombs
{
	public static void main(String[] args)
	{
		char[][] field;
		int bombs, rows, columns, r, c;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter number of rows");
		rows = in.nextInt();

		System.out.println("Enter number of columns");
		columns = in.nextInt();

		System.out.println("Enter number of bombs");
		bombs = in.nextInt();

		field = new char[rows][columns];

		for(int i = 0; i < rows; i++)
		{
			for(int j =0; j < columns; j++)
			{
				field[i][j] = '#';
			}

		}
		for(int i =0; i < bombs; i++)
		{
			r = (int)(Math.random()*rows);
			c = (int)(Math.random()*columns);

			field[r][c] = 'B';
		}

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