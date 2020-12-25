import java.util.Scanner;

public class NumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner (System.in);
		System.out.println(" Enter a number ");
		int n = s.nextInt();
		int sum = 0; 
		
		while(n > 0)
		{
			
			sum = sum + n%10;
			n = n/10;
			
		}
		
		System.out.println(" sum of digit is = " + sum);
		

	}

}
