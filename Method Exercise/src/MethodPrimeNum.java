
public class MethodPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printPrimeBetween(10, 30);
		
		
	}
	
	public static boolean isPrime(int n)
	{
		
		for(int i=2; i<=n/2; i++)
		{
			if(n%i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void printPrimeBetween(int start, int end)
	{
		for(int i=start; i<=end; i++)
		{
			if(isPrime(i))
			{
				System.out.print(i + " ");		
			}
		}
		
	}
	

}
