
public class PrePostFixTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x = 0;
		int y = 0;
		
		System.out.println("the values of x & y are " + "x= "+ x + " y= "+  y);
		x++;
		System.out.println("x++ result =  " + x);
		++x;
		System.out.println("++x result =  " + x);
		
		x = 0;
		
		y= x++;
		
		System.out.println("new value of x and y due to x++ " + "x= "+ x + " y= " + y);
		
		y= ++x;
		
		System.out.println("new value of x and y due to x++ " + "x= "+ x + " y= " + y);

	}

}
