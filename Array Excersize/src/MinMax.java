
public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {1, 2, 3, 4, 5};
		int min = numbers[0];
		int max = numbers[0];
		
		for(int i=1; i<numbers.length; i++)
		{
			if(numbers[i]> max)
			{
				max = numbers[i];
				
			}
			else if(numbers[i]< min)
			{
				min = numbers[i];
				
			}
			
		}

	   System.out.println(" max is = "+ max +" min is = "+ min);
	}
	

}
