// Find the element in array.

import java.util.Scanner;
class Demo2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int arr [] = {1,2,8,6,5,0};

		System.out.println("Enter the element to find");
		int element = sc.nextInt();	

		boolean flag =true;

		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==element)
			{
				System.out.println("Present at position : "+(i+1));
				flag = false;
				break;
			}
		}	

		if(flag)
		{
			System.out.println("Not ");
		}
	}
}