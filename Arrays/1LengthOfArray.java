// Length of array.
class Demo1
{
	public static void main(String[] args) 
	{
		int arr [] = {3,2,6,8,4,0};
		int leng = 0;

		for(;;)
		{
			try 
			{
				System.out.println(arr[leng++]);
			}

			catch (ArrayIndexOutOfBoundsException a)
			{
				break;
			}
			
		}	

		System.out.println("Length is : "+(leng-1));
		
	}
}