import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ArraylistsSortPrint {

	public static void main(String[] args) {
		// TODO Auto-generateIntegerd stub

		ArrayList<Integer> integers = new ArrayList<>();
		
		System.out.println(" enter 5 elements ");
		Scanner s = new Scanner(System.in);
		
		
		
		for(int i=1; i<=5; i++)
		{
			int n = s.nextInt();
		
			if(!integers.contains(n))
				integers.add(n);
			
		}
		Collections.sort(integers);
		System.out.println(integers);
		
		
	}

}
