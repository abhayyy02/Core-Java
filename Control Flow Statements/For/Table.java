import java.util.*;
class Demo5
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number you want to get table of.");	
		int num = sc.nextInt();

		for(int i=1; i<=10; i++)
		{
			System.out.println(num + " * "+ i + " = "+ (num*i));
		}

	} 
}