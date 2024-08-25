
import  java.util.*;

class PrimeException extends Exception
{
	String desc ;

	PrimeException(String desc)
	{
		super(desc);
	}
}

class CPE
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = sc.nextInt();

		boolean flag = true;

		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				flag = false;
				break;
			}
		}

		if(flag)
		{

			try 
			{
				throw new PrimeException("Prime number");
			}

			catch(PrimeException s)
			{
				s.printStackTrace();
			}
		}

		else 
		{
			try 
			{
				throw new PrimeException("Not a Prime number");
			}

			catch(PrimeException pe)
			{
				System.out.println(pe.toString());
			}
		}

	}
}