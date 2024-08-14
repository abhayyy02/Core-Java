import java.util.*;
class Demo1
{
	public static void main(String[] args) 
	{
		Scanner ok = new Scanner (System.in);

		System.out.println("Enter the num");
		int num = ok.nextInt();
		
		int rev=0;
		int lastDigit=0;

		while(num!=0)
		{
			lastDigit = num%10;
			rev = rev * 10 + lastDigit;
			num =num/10;
		}

		System.out.println(rev);
	}
}