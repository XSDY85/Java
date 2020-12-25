import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		
		int n = s.nextInt();
		
		switch(n%2)		
		{
			case 0:
				
				System.out.println(n + "  is even");
			break;
			
			default:
				System.out.println(n + " is odd");
			
				
		}
		
	}

}
