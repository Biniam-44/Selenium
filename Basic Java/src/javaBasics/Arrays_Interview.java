package javaBasics;

public class Arrays_Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int abc [] [] = {{9,4,5}, {3,4,7}, {1,2,9}};
		int min =abc[0][0];
	
		int minColoumn = 0;
		for (int i =0; i<3; i++)
		{
			for(int j=0; j <3; j++)
			{
				if(abc[i][j] < min)
				{
					min=abc[i][j];
					minColoumn = j;
				}
			}
		}
		int max = abc[0][minColoumn];
		int k=0;
		while (k<3)
		{
			if (abc[k]  [minColoumn] > max)
			{
				max = abc[k][minColoumn];
			}
			k++;
		}
		System.out.println(max);

	}

}
