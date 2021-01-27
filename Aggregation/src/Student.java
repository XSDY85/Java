
public class Student {
	
	int id;
	String name;
	Address address;
	
	public Student(int id, String name, Address address) // Emp replace by Student
	{
		
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void showDetails()
	{
		System.out.println(id+ " "+ name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address add1 = new Address("mumbai","maharashtra","india");
		Address add2 = new Address("surat", "gujrat", "india");
		
		Student s1 = new Student(0015, "nigel", add1);
		Student s2 = new Student(0016, "yogesh",add2); // address replace by add
		
		s1.showDetails();
		s2.showDetails();
		
	}

}
