import java.util.Scanner;
import java.util.Arrays;


public class ArrayArithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner (System.in);
		System.out.println(" enter a number ");
		int n = s.nextInt();
		
		double[] numbers = new double[(int) n];
		
		for(int i=0; i<n; i++)
		{
			Scanner s1 = new Scanner (System.in);
			System.out.println(" enter a number ");
			numbers[i] = s1.nextDouble();
		}
		
		sumNum(numbers);
		productNum(numbers);
		
		System.out.println(" average is = "+ (double)sumNum(numbers)/numbers.length);
		
	}
	
	public static double sumNum(double[] numbers) 
	{
		double sum = 0;
		for (int i=0; i<numbers.length; i++)
		{
			sum = sum+numbers[i];
		}
		System.out.println(" The sum is = " + sum);
		return sum;
	}
	
	public static void productNum(double[] numbers) 
	{
		double product = 1;
		for (int i=0; i<numbers.length; i++)
		{
			product = product*numbers[i];
		}
		System.out.println(" The product is = " + product);
	}
	


}
