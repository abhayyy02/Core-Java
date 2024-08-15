import java.util.*;
class Demo6
{
	public static void main(String[] args) 
	{
		Scanner op = new Scanner (System.in);
		System.out.println("Enter the number");

		int num = op.nextInt();

		boolean f = true;

		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				f=false;
				break;
			}
		}

		if(f)
		{
			System.out.println("Prime");
		}
		else 
		{
			System.out.println("Not Prime");
		}
	}
}