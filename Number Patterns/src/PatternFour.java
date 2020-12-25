import java.util.Scanner;

public class PatternFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner (System.in);
		System.out.println(" Enter a number ");
		int n = s.nextInt();
		
		for ( int i=1; i<=n; i++)
		{
			for (int j=1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			
			for (int k=1; k<=2*i-1; k++)
			{
				if (i==n)
				{
					System.out.print("*");
				}
				else if (k==1 || k==2*i-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		
			System.out.println();
		
		}
	}

}
