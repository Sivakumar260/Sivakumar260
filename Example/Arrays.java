package Example;

import java.util.Scanner;

class Arrays{
	
	static void SingledimArray() {
		int n ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of an array ");
		n=sc.nextInt();
		int array[] = new int [n];
		System.out.println("Enter the elements of an array ");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("access Array elements ");
		
		for(int a :array)
		{
			System.out.print(a+",");
		}
		System.out.println();
	}
    static void MultiDimArray() {
			int array[][]= {{9,8,7},{6,5,4},{3,2,1}};
			System.out.println("\nMultidimentional array");
			System.out.println("\nAccess first row 2nd element "+array[0][1]);
			
			System.out.println("Access third row first element "+array[2][0]);
			
			for(int row=0;row<3;row++)
			{
				for(int col=0;col<3;col++)
				{
					System.out.print(array[row][col]+"\t");
				}
				
				System.out.println();
			}
		}
	public static void main(String[] args) {
		SingleDimArray();
		MultiDimArray();
	}
}
