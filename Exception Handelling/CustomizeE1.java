//If age<18, throw a exception.

import java.util.*;

class AgeException extends ArithmeticException
{
	String desc;

	AgeException(String desc)
	{
		super(desc);
	}
}

class CE1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the age");	
		int age = sc.nextInt();

		if(age<18)
		{
			throw new AgeException("Under Aged");
		}

		else 
		{
			System.out.println("Eligible");
		}
	}
}