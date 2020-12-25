import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner (System.in);
		System.out.println(" Enter a place number fibonacci sequence you want ");
		int n = s.nextInt();
		int sum = 0 ;
		int v1 = 1;
		int v2 = 1;
		
		for (int i=1; i<=n-2; i++)
		{
			
			sum = v1 + v2;
			v1 = v2; 
		    v2 = sum;
		    
		}
		
		System.out.println(" the fibonacci number is =  " + sum);
	}

}
