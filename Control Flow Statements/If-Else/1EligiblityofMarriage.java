/* ELIGIBLITY CRITERIA OF MARRIAGE FOR BOYS.
1. Age > 18
2. Income > 10,00,000 per year
3. Or surname = "AMBANI"
*/

import java.util.Scanner;
class Demo1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Age");
		int age = sc.nextInt();

		System.out.println("Enter the income per year");
		int income = sc.nextInt();

		System.out.println("Enter your Surname");
		String surname = sc.next();

		if(((age>18) && (income>1000000)) || (surname .equals("Ambani")))
		{
			System.out.println("YOU ARE ELIGIBLE");
		}

		else 
		{
			System.out.println("NOT ELIGIBLE");
		}
	}
}