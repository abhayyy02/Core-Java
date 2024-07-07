// Sum of the digits.
import java.util.*;
class Demo6
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		int num = sc.nextInt();

		int rem=0;
		int sum=0;
		int i=0;
		while(num!=0)
		{
			rem = num%10;
			num = num /10;
			sum = sum +rem;
		}

		System.out.println("Sum : "+sum);
	}
}