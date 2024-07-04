import java.util.Scanner;
class Demo5
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int dup =num;

		int revNum =0;
		int rem =0;
		

		while(num!=0)
		{
			rem = num%10;
			revNum = revNum * 10 + rem;
			num = num /10;
		}

		System.out.println(revNum);

		System.out.println((dup==revNum)?"Palandrome":"Not a Palandrome");
	}
}