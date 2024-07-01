// Check whether the alphabet is character or not

import java.util.Scanner;
class Demo4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter the character");
		char ch = sc.next().charAt(0);	

		System.out.println((ch>='a' && ch<='z' || ch >='A' && ch<='Z') ? "It is an alphabet " : "It is not an alphabet ");
	}
}

//Use of or operator ( || ) , and Operator ( && ).