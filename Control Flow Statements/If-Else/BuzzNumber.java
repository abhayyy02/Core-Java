import java.util.*;
class Demo5
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the num");
		int num = sc.nextInt();

		if(num%10==7 || num%7==0)
		{
			System.out.println("A Buzz Number");
		}

		else 
		{
			System.out.println("No");
		}
	}
}
