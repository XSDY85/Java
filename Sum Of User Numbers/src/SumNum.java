import java.util.Scanner;

public class SumNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner (System.in);
		
		System.out.println(" Please enter a number");
		int i = s.nextInt();
		
		while(i<100)
		{
			System.out.println(" Please enter a number again ");
			i = i + s.nextInt(); 
			
		}
				System.out.println(" DONE " + i);
				

	}

}
