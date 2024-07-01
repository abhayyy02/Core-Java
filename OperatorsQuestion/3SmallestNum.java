// A program to find the smallest among 2 number

import java.util.Scanner;
class Demo3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st number : ");
		int num1 = sc.nextInt();

		System.out.println("Enter 2nd number : ");
		int num2 = sc.nextInt();

		int min  = (num1>num2) ? num2 : num1;            // Ternary operator
		System.out.println("Smallest number is : "+ min);
	} 
}