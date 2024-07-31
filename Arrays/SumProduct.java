import java.util.*;
class Demo7
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array");
		int size = sc.nextInt();

		System.out.println("Enter the elements");

		int arr [] = new int[size];

		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(arr));

		int sum=0;
		int prod=1;

		for(int i=0; i<arr.length; i++)
		{
			if(i%2==0)
			{
				sum = sum + arr[i];
				prod = prod * arr[i];
			}
		}

		System.out.println("Sum : "+sum);
		System.out.println("Product : "+prod);
	}
}