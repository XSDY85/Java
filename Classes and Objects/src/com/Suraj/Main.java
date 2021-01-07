package com.Suraj;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r = new Rectangle();
		Rectangle r1 = new Rectangle(3.0, 4.0);
		
		System.out.println(" the area is : "+ r.getArea()+ " the perimeter is " + r.getPeri());
		System.out.println(" the area is : "+ r1.getArea()+ " the perimeter is " + r1.getPeri());
	
		
		
	    r.setWidth(4.0);
	    r.setHeight(4.5);
	    
	    System.out.println(" new width is : "+ r.getWidth() + " new height is : " + r.getHeight());
	    System.out.println(" new area is : "+ r.getArea()+ " new perimeter is " + r.getPeri());
	
	
	    r1.setWidth(5.0);
	    r1.setHeight(8.5);
	    
	    System.out.println(" new width is : "+ r1.getWidth() + " new height is : " + r1.getHeight());
	    System.out.println(" new area is : "+ r1.getArea()+ " new perimeter is " + r1.getPeri());
	}

}
