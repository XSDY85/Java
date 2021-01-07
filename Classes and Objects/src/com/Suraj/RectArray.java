package com.Suraj;

import java.util.Scanner;

public class RectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle[] rectangle = new Rectangle[3];
		
		Scanner s = new Scanner(System.in);
		
		for (int i=0; i<rectangle.length; i++)
		{
			System.out.println("do you want to enter width and height: enter (y/n)");
			int choice = s.next().charAt(0);
			
			if (choice == 'y')
			{
				rectangle[i] = new Rectangle(s.nextDouble(), s.nextDouble());
			}
			else
			{
				rectangle[i] = new Rectangle();
			}
		}
	
	   System.out.println(" rectangles are: ");
	   
	   for(int i=0; i<rectangle.length; i++)
	   {
		   System.out.println("the width is : "+ rectangle[i].getWidth()+ " the height is: "+ rectangle[i].getHeight());
	   }
	}
}
