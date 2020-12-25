import java.awt.Point;

public class TestPoint 
{
	
	public static void main(String[] args) 
	
	{
		
		
        Point thePoint = new Point(10,10);
		
		System.out.println("X is = "+ thePoint.x);
		System.out.println("Y is = "+ thePoint.y);
		
		
		thePoint.x = 5;
		thePoint.y = 15;
		
		
		System.out.println("New X is = "+ thePoint.x);
		System.out.println("New Y is = "+ thePoint.y);
	}

}
