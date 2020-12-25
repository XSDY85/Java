import java.util.Scanner;

public class PatternSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner (System.in);
		System.out.println(" Enter a number ");
		int n = s.nextInt();
		
		for ( int i=1; i<=n; i++)
		{
			if (i==1 || i==n)
			{
				for ( int j= 1; j<=n; j++)
				{
					
				
					System.out.print("*");
				}
			}
	        
			else 
			{
			for ( int j= 1; j<=n; j++)
			{
			     if (j==1 || j==n)
			     	{
				
			    	 		System.out.print(" ");
			     	}
			
			     else
			     	{
			    	 	System.out.print("*");
			     	}    
			     
			}
			}
			System.out.println();
		}
	}

}

