import java.util.*;
class Demo9
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size");
		int size = sc.nextInt();

		System.out.println("Enter the elements");

		int arr [] = new int [size];

		for(int i=0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.println("Original Array : "+Arrays.toString(arr));

		int temp =0;

		for(int i=0; i<size; i++)
		{
			for(int j=i+1; j<size; j++)
			{
				if(arr[j] < arr[i])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("Sorted Array : "+Arrays.toString(arr));
	}
}