import java.awt.Point;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayNumPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner (System.in);
		System.out.println(" Enter a number ( max is 10 )");
		
		int n = s.nextInt();
		
		while ( n>10 || n<=0 )
		{
			
			System.out.println(" Invalid number. Enter a number again");
			n = s.nextInt();
		}
		
		Point[] points = new Point[n];
		
		fillArrayOfPoints(points);
		printArrayOfPoints(points);
		 
	}
	
	private static void fillArrayOfPoints(Point[] points)
	{
		
		Scanner s1 = new Scanner (System.in);
		
		for (int i=0; i<points.length; i++)
		{
			System.out.println(" enter x and y for points");
			
			points[i] = new Point(s1.nextInt(), s1.nextInt());
		}
		
	}
	
	private static void printArrayOfPoints(Point[] points)
	{
		System.out.println(Arrays.toString(points));
	}

}

