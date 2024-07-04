// Length of number or number of digits in number.

import java.util.Scanner;
class Demo1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter the number");
		int num = sc.nextInt();

		int leng =0;

		while(num!=0)
		{
			num = num/10;
			leng++;
		}	

		System.out.println(leng);
	}
}