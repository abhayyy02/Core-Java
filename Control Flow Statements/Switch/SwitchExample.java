import java.util.*;
class Demo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Select the options");
		String var1 = sc.next().toUpperCase();

		switch(var1)
		{
			case "A" :
			{ 
				System.out.println("Hello from A");
			}

			case "B" : 
			{
				System.out.println("Hello from B");
			}

			case "C" :
			{
				System.out.println("Hello from C");
			}

			default :
			{
				System.out.println("Hello from default.");
			}
		}
	}
}