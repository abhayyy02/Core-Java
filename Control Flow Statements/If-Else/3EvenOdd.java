// Check num is even or odd

import java.util.Scanner;
class Demo3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number.");
		int num = sc.nextInt();	

		if(num%2==0)
		{
			System.out.println("Even");
		}

		else 
		{
			System.out.print("Odd");
		}
	}
}