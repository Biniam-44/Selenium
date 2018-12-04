package InterfaceConcept;

public class Implement_Interface implements Bankingclient {
// now this class is responsible to implement all methods of the banking client 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Implement_Interface Inter = new Implement_Interface();
		//Inter.checkingBalance();
		//Inter.createCreditcard();
		//Inter.transferBalance();
		Inter.login();
		Inter.logout();
		
		Bankingclient bc = new Implement_Interface(); // Run time polymorphism
		bc.checkingBalance();
		bc.createCreditcard();
		bc.transferBalance();
	}

@Override
public void createCreditcard() {
	// TODO Auto-generated method stub
	System.out.println("Credit card payment implemented");
}

@Override
public void transferBalance() {
	// TODO Auto-generated method stub
	System.out.println("Credit transfer balance implemented");
}

@Override
public void checkingBalance() {
	// TODO Auto-generated method stub
	System.out.println("Credit checking Balance implemented");
}

public void login()
{
  System.out.println(" Logged in sucessfully");	
}

public void logout()
{
  System.out.println(" Logged out sucessfully");	
}
}
