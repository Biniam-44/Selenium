
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Payment $100 Paid
		
		// Multiple ways to access string class
		
		String st = "Payment $100 paid";
		//check if only one payment is made
		System.out.println(st.charAt(8)); 
		
		String sttr = "Payments $100 paid";
		//check if morethan one payment is made
		System.out.println(sttr.indexOf("$"));
		
		//find the text based on the starting index
		System.out.println(sttr.substring(9));
		// find the text based on the starting and ending text
		System.out.println(sttr.substring(9,13));
		//String str = new String("Payment $100 paid");
	}

}
