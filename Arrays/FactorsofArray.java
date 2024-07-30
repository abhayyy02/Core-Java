import java.util.*;
class Demo4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number to get Factors of ");
		int num = sc.nextInt();

		int size=0;

		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				size++;
			}
		}

		int factArr [] = new int [size];

		int itt = 0;
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				factArr[itt++] = i;
			} 
		}

		System.out.println(Arrays.toString(factArr));
	}
}