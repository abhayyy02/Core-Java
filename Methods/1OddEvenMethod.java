import java.util.Scanner;
class Demo1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		isEvenOdd(num);

	}

	public static void isEvenOdd(int num)
	{
		if(num%2==0)
		{
			System.out.println("Even");
		}
		else 
		{
			System.out.println("Odd");
		}
	}
}