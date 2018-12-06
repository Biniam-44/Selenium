
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if I want to store multiple values on one container we use Arrays
		// Arrays are multiple values of the same data type
		//Key word new allocates memory for an array
		int a[] = new int[5]; // Declares an array and allocates memory for the values
		int b[] = {1,4,3,5,7}; // Memory is dynamically allocated
		a[0]=2;
		a[1]=6;
		a[2]=9;
		a[3]=12;
		a[4]=13;
		
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]); // retrieve valeues present in this array
		}
		
		//single dimensional array
		for (int i=0; i<b.length; i++)
		{
			System.out.println(b[i]); // retrieve valeues present in this array
		}
	}

}
