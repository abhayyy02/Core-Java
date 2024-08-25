import java.util.*;

class AbhayException extends Exception
{
	String desc;

	AbhayException(String desc)
	{
		super(desc);
	}
}

class AbhayDriver 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of Array");
		int size = sc.nextInt();

		System.out.println("Enter the  elements");

		int arr [] =new int[size];

		for(int i=0;i<size; i++)
		{
			arr[i] = sc.nextInt();
		}	

		System.out.println(Arrays.toString(arr));
	
		for(int i=0; i<size; i++)
		{
			if(arr[i]==3)
			{
				try 
				{
					throw new AbhayException("3 is not allowed");
				}

				catch(AbhayException ae)
				{
					ae.printStackTrace();
				}
			}

		}
	}
}