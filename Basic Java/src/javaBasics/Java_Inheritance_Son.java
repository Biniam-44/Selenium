package javaBasics;

public class Java_Inheritance_Son extends Java_Inheritance_GrandFather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// object syntax is class_name xyz = new clas_ name
		Java_Inheritance_Son s = new Java_Inheritance_Son();
		s.city();
		//s.country();
		s.State();
		s.sonState();
		s.Address();
	}

	 public void activities()
	 {
		 System.out.println("Our Actvities");
	 }
	
	 public void sonState()
	 {
		 System.out.println("Virgina");
	 }
}