package Keywords;

public class thisDemo extends finalDemo {

	// this refer to current object - object Scope lies in class level 
	// Super keyword refers to a parent class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   thisDemo td = new thisDemo();
   td.getData();
   
   
	}
	 int a = 2;
	  
	  public void getData()
	  {
		  int a = 3;
		  int b = a + this.a;
		  System.out.println(a);
		  System.out.println(this.a);
		  System.out.println(b);
	  }
	  
	 
}
