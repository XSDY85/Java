import java.util.Scanner;

public class MethodNameAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getName();
		getAge();

	}
	
	public static String getName()
	{
		Scanner s = new Scanner (System.in);
		System.out.print(" Enter your name ");
		String name = s.nextLine();
		
		System.out.println(" Your name is = "+ name);
		return name;
		
	}
	
	public static int getAge()
	{
		
		Scanner s1 = new Scanner (System.in);
		System.out.print(" Enter your age ");
		int age = s1.nextInt();
		
		System.out.println(" Your age is = "+ age);
		return age;
	}

}
