
public class Motorcycle {

	String make;
	String color;
	boolean engineState;
	
	void startEngine() {
		if (engineState == true)
			System.out.println("the engine is already on");
			else	{
				engineState = true;
				System.out.println("the engine is now on");
			}
	}
	
	void showAppear() {
		System.out.println("the colour is" + color + " " + make);
		if (engineState == true)
			System.out.println("the engine is on");
		else System.out.println("engine is off");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Motorcycle m= new Motorcycle();
		m.make = "Yamaha";
		m.color = "yellow";
		m.showAppear();
		m.startEngine();
		

	}

}
