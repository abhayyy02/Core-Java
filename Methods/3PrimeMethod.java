import java.util.Scanner;
class Demo3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number.");
		int num = sc.nextInt();

		isPrime(num);

	}

	public static void isPrime(int num)
	{
		boolean flag = true;

		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Prime number");
		}

		else 
		{
			System.out.println("Not Prime");
		}

	}
}