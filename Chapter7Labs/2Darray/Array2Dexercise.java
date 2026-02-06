package Chapter7Labs/2Darray;
public class Array2Dexercise {

	public static void main(String[] args) {
		
		int[][] table1;
		table1 = new int[5][4];

		for (int row = 0; row < table1.length; row++) {
			for (int col = 0; col < table1[0].length; col++) {
				table1[row][col] = (int)(Math.random() * 10 * (row + 1));
			}
		}
		
		System.out.println("table1:\n" + tableToString(table1));

		System.out.println(sum_of_col_3(table1));
		System.out.println(smallest(table1));
		repeats();
	}

	// Prints a 2-D table.  Precondition: the entries are all numbers
	public static String tableToString(int[][] table) {
		
		if (table.length == 0) 
				return "";
		
		String str = "";

		str += table.length + " rows by " + table[0].length + " cols\n     ";
		for (int col = 0; col < table[0].length; col++) {
			str += col + "  ";
		}
		str += "\n   ";

		for (int col = 0; col < table[0].length; col++) {
			str += "---";
		}
		str += "\n";

		for (int row = 0; row < table.length; row++) {
			str += row + " | ";
			
			for (int col = 0; col < table[0].length; col++) {
				if (table[row][col] < 10) str += table[row][col] + "  ";
				else str += table[row][col] + " ";
			}			
			str += "\n";
		}
		
		return str;
	}

	public static String sum_of_col_3(int[][] table)
	{
		int sum = 0;
		for (int row = 0; row < table.length; row++) {
			sum += table[row][3];
		}
		return ("Sum of column 3 is " + sum);
	}

	public static String smallest(int[][] table)
	{
		int min = table[2][0];
		for (int col = 0; col < table[0].length; col++) {
			if (table[2][col] < min) {
				min = table[2][col];
			}
		}		
		return("The smallest value in row 2 is " + min);
	}

	public static void repeats()
	{
		int[][] table2 = {{35,18,12},{22,26,23},{32,15,18},{35,38,32}};
		
		System.out.println();
		System.out.println("table2:\n" + tableToString(table2));

		int count = 0;

		for (int r1 = 0; r1 < table2.length; r1++)
		{
			for (int c1 = 0; c1 < table2[0].length; c1++)
			{
				for (int r2 = r1; r2 < table2.length; r2++)
				{
					int startC = 0;
					if (r2 == r1) startC = c1 + 1;

					for (int c2 = startC; c2 < table2[0].length; c2++)
					{
						if (table2[r1][c1] == table2[r2][c2])
						{
							count++;
						}
					}
				}
			}
		}

		System.out.println("The number of repeat entries in table2  is " + count);
	}
}
