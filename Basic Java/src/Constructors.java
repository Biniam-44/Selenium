
public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Constructor executes a block of code whenever an object is created.
		//It will not return value
		// Name of the constructor should be the class name.
		// whenever you create an object constructor is called
		// If we don't define a constructor compiler will call default constructor 
		//Constructors c = new Constructors();
		Constructors cd = new Constructors(4,5);
		Constructors cons = new Constructors("Hello new constructor");
		cd.getData();
		

	}
	
	public void getData()
	{
		System .out.println("I am the method");
	}
	
	//Default Constructor
	public Constructors()
	
	{
		System.out.println("I am the constructor");
		System.out.println("I am the second message on the constructor ");
	}
	
	//Parametrized Constructor
	public Constructors(int a, int b)
	
	{
		System.out.println("I am the Parametrized constructor");
		
	}
	
public Constructors(String str)
	
	{
		System.out.println(str);
		
	}
}
