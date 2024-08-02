class Demo1
{
	public static void main(String[] args) 
	{
		String str = "Abhay Jadhav";	

		String [] arr = str.split(" ");

		for(String i : arr)
		{
			System.out.println(i);
		}
	}
}