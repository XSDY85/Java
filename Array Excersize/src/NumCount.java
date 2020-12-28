
public class NumCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {1, 1, 1, 2, 3, 4};
		int searchElement = 4;
		
		System.out.println(" count is = " + getNumberOcc(numbers, searchElement));
		
	}
	
	public static int getNumberOcc(int[] numbers, int searchElement)
	{
		int count = 0;
		for(int i=0; i<numbers.length; i++)
		{
			if(searchElement == numbers[i])
			{
				count++;
			}
		}
		
		return count;
	}

	

}
