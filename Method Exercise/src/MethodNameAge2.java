import java.util.Scanner;

public class MethodNameAge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(" Enter your name ");
		System.out.println(" Your name is = "+ getName());
		
		System.out.print(" Enter your age ");
		System.out.println(" Your Age is = "+ getAge());

	}
	
	public static String getName()
	{
		Scanner s = new Scanner (System.in);
		String name = s.nextLine();
		
		return name;
		
	}
	
	public static int getAge()
	{
		
		Scanner s1 = new Scanner (System.in);
		int age = s1.nextInt();
		
		return age;
	}

}
