package exceptionDemo;

public class exceptionParent {
	// one try block can be followed by multiple catch blocks
	// catch block should always follow immediately by the try block
	// Is there anywhere finally block will not be executed? yes, weh you stopped JVM forcefully 
	public void getResult()
	{
	int a= 4;
	int b= 8;
	int c=0;
	float d;
	int arr[] = new int [5];
	//d=b/c;
	//System.out.println(d);
	
	try
	{
		d=b/a;
		System.out.println(d);
		System.out.println(arr[7]);
	}
	
	
	catch (ArithmeticException et)
	{
		System.out.println("Arithmetic Exception Catched");
		
	}
	catch(IndexOutOfBoundsException IE)
	{
		System.out.println("Index Out of range Exception Catched");
	}
	
	catch (Exception e)
	{
		System.out.println("Opps Something happened");
	} 
	
	finally
	{
		// This block is executed irrespective of exception thrown or not 
		System.out.println("Continue Code");
		
	}
	}
}
