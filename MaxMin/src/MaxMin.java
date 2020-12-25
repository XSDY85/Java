import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.print(" Enter a number ");
		int n = s.nextInt();
		

		int max = n;
		int min = n;
		
		if (n>=0)
		{
			
		while(n>=0)
		{
			
			System.out.println(" Enter a number again ");
			n = s.nextInt();
			
			if(n<0)
			{
				break;
			}
			else if (n<min)
			{
				min = n;
				continue;
			}
			else if (n>max)
			{
				max = n;
				continue;
			}
			
		break;
			
			
		}
		
		System.out.println(" max is = " + max + "  min is = " + min);
		
		}
		
		else
		{
			System.out.println( " Entered a negative number");
		}
	}

}
