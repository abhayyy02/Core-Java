import java.util.Scanner;
class Demo2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);	
		System.out.println("Enter the Number");
		int num = sc.nextInt();

		System.out.println(revNum(num));

		if(revNum(num)==num)
			
		{
			System.out.println("Palandrome");
		}

		else 
		{
			System.out.println("Not Palandrome");
		}

	}

	public static int revNum(int num)
	{
		int rev =0;
		

		while(num!=0)
		{
			int rem = num%10;
			rev =rev*10 +rem;
			num = num/10;
		}

		return rev;
	}
}