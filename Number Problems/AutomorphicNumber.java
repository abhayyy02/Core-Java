import java.util.*;
class Demo4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = sc.nextInt();

		int dup = num;

		int div=1;

		int square = num*num;

		while(num>0)
		{
			div = div*10;
			num = num/10;
		}

		int lastDigit = square%div;

		System.out.println(dup==lastDigit?"Automorphic Number": "No");
	}
}