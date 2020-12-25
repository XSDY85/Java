import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.print(" Enter a number ");
		int n = s.nextInt();
		
		boolean isPrime = true;
		
		
		for ( int i=2; i<=n/2; i++) // because 2 is only even prime number (n/2) & isPrime is considered true outside the loop.
		{
			
			if (n%i == 0 )
			{
				
				isPrime = false;
				break;
				
			}

		}
		
		if(isPrime == false)
		{
			
			System.out.println(n + " is not Prime number ");
		}

		else 
		{
			
			System.out.println(n + " is Prime number");
			
		}
	}

}
