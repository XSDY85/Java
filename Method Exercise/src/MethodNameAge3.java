import java.util.Scanner;

public class MethodNameAge3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(" Enter your name ");
		System.out.println(" Your name is = "+ getName());
		
		System.out.print(" Enter your age ");
		System.out.println(" Your Age is = "+ getAge());

	}
	
	public static String getName()
	{

		return new Scanner(System.in).nextLine();
		
	}
	
	public static int getAge()
	{
		
		return new Scanner(System.in).nextInt();
	}

}
