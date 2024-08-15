import java.util.*;
class Demo5
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();

		int temp = num;

		System.out.println("Enter the Number");
		int sum=0;
		int prod=1;

		while(num>0)
		{
			int ld = num%10;
			sum = sum+ld;
			prod = prod * ld;
			num = num/10;
		}

		System.out.println("Product : "+prod);
		System.out.println("Sum : "+sum);

		System.out.println(sum==prod ? temp +" is a Spy Number": temp+ " is Not a spy num");
	}
}