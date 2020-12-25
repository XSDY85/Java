import java.util.Scanner;

public class StrictDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		
		Scanner s = new Scanner (System.in);
		System.out.println(" Enter a number ");
		int n = s.nextInt();
		
		for ( int i=1; i<=n/2; i++ )
		{
			
			if(n % i == 0)
			{
				sum = sum + i;
				
			}
			
		}
		
		System.out.println(" sum is  " + sum);
	}

}
