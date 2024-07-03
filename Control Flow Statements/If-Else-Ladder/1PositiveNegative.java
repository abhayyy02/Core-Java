// Check  whether a number is +ve or -ve or Neutral

import java.util.Scanner;
class Demo1
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

		else if(num<0)
		{
			System.out.println("-ve");
		}

		else 
		{
			System.out.println("Neutral");
		}
	}
}