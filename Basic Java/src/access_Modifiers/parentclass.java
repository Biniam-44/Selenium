package access_Modifiers;

public class parentclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 parentclass pc = new parentclass();
	     pc.denyAcess();
	    pc.getAccess();
	}
     public void getAccess()
     {
    	 System.out.println("This is a Public class");
     }
     
     private void denyAcess()
     {
    	 System.out.println("This is a private class");
     }
     
    
}


