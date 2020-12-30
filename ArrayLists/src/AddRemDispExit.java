import java.util.ArrayList;
import java.util.Scanner;

public class AddRemDispExit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> integers = new ArrayList<>();
		
		Scanner s = new Scanner(System.in);
		
		while(true)
		{
			
			getShow();
			int n = s.nextInt();
			
			if(n==1)
			{
				// Add
				
				System.out.print(" enter a number to add ");
				integers.add(s.nextInt());
				System.out.println("Added");
				
			}
			else if (n==2)
			{
				//Remove
				System.out.print("Enter a number to remove");
				int elementToRemove = s.nextInt();
				if(integers.contains(elementToRemove))
				{
					integers.remove(Integer.valueOf(elementToRemove));
					System.out.println(" removed ");
				}
				else
					System.out.println(" element not exists");
				
				
			}
			else if (n==3)
			{
				//Display
				System.out.println("your List : "+ integers);
			}
			else if (n==4)
			{
				// Exit
				System.out.println("Good bye");
				break;
			}
			else
			{
				System.out.println(" Not a valid choice");
			}
		}

		
		
	}
	
	public static void getShow()
	{
		
		System.out.println(" Choose from following ");
		System.out.println("1. Add");
		System.out.println("2. Remove");
		System.out.println("3. Display");
		System.out.println("4. Exit");
		
		System.out.println(" Enter your Choice");
	}

}
