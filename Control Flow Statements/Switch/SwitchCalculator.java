import java.util.*;
class Demo3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println();

		System.out.println("1. Add");
		System.out.println("2. Substract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");

		System.out.println();

		System.out.println("Enter the given option only.");
		int opt = sc.nextInt();

		System.out.println("enter the num1");
		double num1 = sc.nextDouble();

		System.out.println("enter num2");
		double num2 = sc.nextDouble();

		switch (opt)
		{
		case 1:
			{
				double op = 0;
				op = num1+num2;
				System.out.println("Sum : "+op);
				break;
			}

		case 2:
			{
				double op = 0;
				op = num1-num2;
				System.out.println("Difference : "+op);
				break;
			}

		case 3:
			{
				double op = 1;
				op = num1*num2;
				System.out.println("Product : "+op);
				break;
			}

		case 4:
			{
				double op = 1;
				op = num1/num2;
				System.out.println("Division : "+op);
				break;
			}

		default :
			{
				System.out.println("Sorry you have entered unavailabe option. Enter given options only.");
				
			}

		}
	}
}