import java.util.*;
class Demo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num");
		int num = sc.nextInt();
		int dup = num;

		int sq = num*num;
		int sum =0;
		int lastDigit = 0;

		while(sq>0)
		{
			lastDigit = sq%10;
			sum = sum +lastDigit;
			sq=sq/10; 		
		}	

		System.out.println(dup==sum?"Yes a Neon NUmber":"No");
	}
}