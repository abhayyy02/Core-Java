/* Driving License Conditions
1. Age = 18+
2. Rto test score = 60+, if less reapear.
*/
 
import java.util.Scanner;
class Demo2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Age");
		int age = sc.nextInt();

		

		if(age>18)
		{
			System.out.println("Enter the Test-Score");
			int score = sc.nextInt();

			if(score > 60)
			{
				System.out.println("Your are eligible.");
			}

			else 
			{
				System.out.println("Re-apear for the test.");
			}

		}

		else
		{
				System.out.print("You are under-aged.");
		}
		
	}
}
