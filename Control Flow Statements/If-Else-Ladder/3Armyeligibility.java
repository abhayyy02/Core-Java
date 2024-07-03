/* ELIGIBILITY CRITERIA FOR ARMY
1. Age = 18+
2. Height = 162
3. Weight = 56
*/

import java.util.Scanner;
class Demo3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter the Age");
		int age = sc.nextInt();	


		if(age>18)
		{
			System.out.println("Enter the height in cm. ");
			int height = sc.nextInt();

			if(height>162)
			{
				System.out.println("Enter the Weigth in kg");
				int weight = sc.nextInt();

				if(weight>56)
				{
					System.out.println("You are eligibile.");
				}

				else 
				{
					System.out.println("Not ELIGIBILE");
				}
			}

			else 
			{
				System.out.println("Not ELIGIBILE");
			}
		}

		else 
		{
			System.out.println("NOT ELIGIBILE");
		}
	}
}