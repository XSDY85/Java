import java.util.Arrays;
import java.util.Scanner;


public class ArrayNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner (System.in);
		System.out.println(" Enter a number ( max is 10 )");
		
		int n = s.nextInt();
		
		while ( n>10 || n<=0 )
		{
			
			System.out.println(" Invalid number. Enter a number again");
			n = s.nextInt();
		}
		
		int[] numbers = new int[n];
		
		fillArrayOfIntegers(numbers);
		printArrayOfIntegers(numbers);
		 
	}
	
	private static void fillArrayOfIntegers(int[] numbers)
	{
		
		Scanner s1 = new Scanner (System.in);
		
		for (int i=0; i<numbers.length; i++)
		{
			numbers[i] = s1.nextInt();
		}
		
	}
	
	private static void printArrayOfIntegers(int[] numbers)
	{
		System.out.println(Arrays.toString(numbers));
	}

}
