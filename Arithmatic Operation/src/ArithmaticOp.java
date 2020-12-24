import java.util.Scanner;

public class ArithmaticOp {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter num1 operator num2 (ex:x+y)  ");
			
		double d1 = s.nextDouble();
		char c = s.next().charAt(0);
		double d2 = s.nextDouble();
		 
		switch(c)
		{
		
		case '+':
			System.out.println(d1+d2);
			break;
		
		case '-':
			System.out.println(d1-d2);
			break;
			
		case '*':
			System.out.println(d1*d2);
			break;
			
		case '/':
			System.out.println(d1/d2);
			break;
		
		default:
			System.out.println("not a valid operator");
			
		}
		

	}

}
