
public class ArraySumRowColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] integers= {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
		};
		
		// int sumRow = 0;  // dont use here
		// int sumCol = 0;  // dont use here
		
		for(int i=0; i<3; i++)
		{
			int sumRow = 0; // use here 
			for (int j=0; j<4; j++)
			{
				sumRow = sumRow + integers[i][j];
			}
			
			System.out.println(" the sum of " + (i+1) + " row " + sumRow);
		
		}
		
		for(int i=0; i<4; i++)
		{
			int sumCol = 0; // use here
			for(int j=0; j<3; j++)
			{
				sumCol = sumCol + integers[j][i];
			}
			
			System.out.println(" the sum of " + (i+1) + " coloumn " + sumCol);
		}
	}

}
