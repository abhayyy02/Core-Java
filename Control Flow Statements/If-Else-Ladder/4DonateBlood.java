/* Conditions for donating blood
1. Age = 20+
2. Must not consumed alcohol and smoked
3. weight = 50+
*/

import java.util.Scanner;
class Demo4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);	

		System.out.println("Have you consumed alcohol or smoked in past 24 hrs? (YES/NO)");
		String str = sc.next().toUpperCase();

		if(str.equals("NO"))
		{
			System.out.println("Enter the age in yrs");
			int age = sc.nextInt();

			if(age>20)
			{
				System.out.println("Enter the Weight in kg");
				int weight = sc.nextInt();

				if(weight>50)
				{
					System.out.println("Please Move Forward in line. ");
				}

				else 
				{
					System.out.println("Increase your weight by "+(50-weight)+" kg");
				}
			}

			else 
			{
				System.out.println("Try after "+ (20-age)+ " years.");
			}
		}	

		else 
		{
			System.out.println("Sorry, drunk or smoked people are not allowed.");
		}	
	}
}