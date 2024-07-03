/* Conditions for increasing the payment of employees
1. If monthly target > 90, increase salary by 3%
2. else increse by 1%
*/

import java.util.Scanner;
class Demo2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter the Target Scored by employee");
		int score = sc.nextInt();	

		System.out.println("Enter the salary of employee");
		double sal = sc.nextDouble();

		if(score > 90)
		{
			sal = sal + sal * 0.03;
			System.out.println("3% increment in Salary. Current Sal = "+sal);
		}

		else 
		{
			sal = sal + sal * 0.01;
			System.out.println("1% increment in Salary. Current Sal = "+sal);
		}
	}
}