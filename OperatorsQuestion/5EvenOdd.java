// Find even odd number in Java. 

import java.util.Scanner;
class Demo5
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println((num%2==0) ? "Even" : "Odd");
	}
}