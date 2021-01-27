interface Animal
{
	
}

class Mammal implements Animal
{
	
}
public class Dog extends Mammal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mammal m = new Mammal();
		Dog d = new Dog();
		
		System.out.println(m instanceof Animal);
		System.out.println(d instanceof Mammal);
		System.out.println(d instanceof Animal);

	}

}
