package javaBasics;

public class Stings_practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "MADAM";
		String t = "";
		for (int i = s.length()-1; i>=0;i--)
		{
			 t = t + (s.charAt(i));
		}
		
		System.out.println (t);
		
		System.out.println (s);
		
		
		if (s == t)
		{
		
		}
	}

}
