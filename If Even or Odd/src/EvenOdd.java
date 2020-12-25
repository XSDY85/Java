import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner i = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		
		int n = i.nextInt();
		
		if(n%2==0)
			System.out.println(n + " is Even");
			
		if(n%2==1)
			System.out.println(n + " is Odd");

	}

}
