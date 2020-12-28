import java.util.Arrays;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {1, 2, 4, 5, 7, 9, -2, 3};
		int[] temp = new int[numbers.length];
		
		int j = 0;
		int k = numbers.length-1;
		
		for (int i=0; i<numbers.length; i++)
		{
			if (numbers[i]%2!=0)
			{
				temp[j++] = numbers[i];
			}
			else
			{
				temp[k--] = numbers[i];
			}
			
		}
		printArray(temp, numbers);
		System.out.println(" Array is = "+ Arrays.toString(numbers));
	}
	
	public static void printArray(int[] temp, int[] numbers)
	{
		for(int i=0; i<temp.length;i++)
		{
			numbers[i] = temp[i];
		}
		
	}

}
