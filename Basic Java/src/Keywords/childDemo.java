package Keywords;

public class childDemo extends parentDemo {
// using super keyword it will refer to a parent class 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         childDemo cd = new childDemo();
         cd.getString();
         cd.getData();
         
	}

	
	String name = "Duplicate Technocraft";
	public void getString()
	{
		System.out.println(name);
		System.out.println(super.name);
		
	}
	public void getData()
	{
		super.getData();
		System.out.println("Child method called");
	}
	
	public childDemo()
	{
		super(); // this should be always on the first line of the constructor
		System.out.println("Child class constructor");
	}
}
