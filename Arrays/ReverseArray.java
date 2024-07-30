import java.util.*;
class Demo3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size");
		int size = sc.nextInt();

		System.out.println("Enter the elements.");

		int arr [] = new int [size];

		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(arr));

		int revArr [] = new int [size]; 
		int itt = 0;

		for(int i=arr.length-1; i>=0; i--)
		{
			revArr[itt++] = arr[i];
		}

		System.out.println(Arrays.toString(revArr));
	}
}