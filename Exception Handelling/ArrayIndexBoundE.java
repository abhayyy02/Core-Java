//ArrayIndexOutOfBoundsException --> Unchecked  Exception

import java.util.*;
class AEOB
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Enter the size");
		int size = sc.nextInt();

		System.out.println("Enter the elements");
		
		int arr[] = new int[size];

		for(int i=0;i<=size;i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(arr));

	}
}