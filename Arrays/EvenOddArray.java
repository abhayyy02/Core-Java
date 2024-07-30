import java.util.*;
class Demo5
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size");	
		int size = sc.nextInt();

		System.out.println("Enter the ELements");
		int arr [] = new int [size];

		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(arr));

		int evenSize = 0;
		int oddSize = 0; 

		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				evenSize++;
			}

			else 
			{
				oddSize++;
			}
		}

		int evenArr [] = new int [evenSize];
		int oddArr [] = new int [oddSize];

		int eitt=0;
		int oitt =0; 

		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				evenArr[eitt++]= arr[i];
			}

			else 
			{
				oddArr[oitt++] = arr[i];
			}
		}

		System.out.println("Even Array : "+Arrays.toString(evenArr));
		System.out.println("Odd Array : "+Arrays.toString(oddArr));
			
	}
}