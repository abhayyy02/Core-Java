// Check  whether a number is +ve or  -ve

import java.util.Scanner;
class Demo4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = sc.nextInt();

		if(num>0)
		{
			System.out.println("+ve");
		}	

		else 
		{
			System.out.println("-ve");
		}
	}
}