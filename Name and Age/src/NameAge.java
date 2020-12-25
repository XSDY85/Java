import java.util.Scanner;

public class NameAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter your name and Age");
		
		Scanner input = new Scanner(System.in);
		
		String s = input.nextLine();
		int i = input.nextInt();
		
		
		System.out.println(s + "  you are "+ i +" years old");

	}

}
