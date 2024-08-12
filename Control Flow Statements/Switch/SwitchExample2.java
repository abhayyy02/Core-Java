import java.util.*;
class Demo2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Month's number");
		int num = sc.nextInt();

		switch(num)
		{
		case 12: 
		case 1:
		case 2: 
				{
					System.out.println("Winter");
					break;
				}
		case 3:
		case 4: 
		case 5:
		
			{
				System.out.println("Summer");
				break;
			}

		 case 6:
		 case 7:
		 case 8:
		 case 9:
		 	{
		 		System.out.println("Monsoon");
		 		break;
		 	}

		 case 10:
		 case 11:
		 	{
		 		System.out.println("Autum");
		 	}
		}		

	}
}