package javaBasics;

public class Coding_Basics_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sum of numbers in the array
		// printing the index of desired number
		int a[] = {2,5,4,3,6,7};
		int sum = 0;
		int b;
		for(int i=0; i < a.length; i++) // Gonna loop 5 times
		{
			//System.out.println(a[i]);
		   sum = sum + a[i];
		   System.out.println(a[i]);
		  if (a[i] == 6)
		  {
			  //System.out.println(i);
			 // break;
		  }
		   //System.out.println(sum);
		}
		
		//System.out.println(sum);

	}

}
