// InterruptedException --> Checked  Exception

class IE
{
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getName());	

		try 
		{
			Thread.sleep(3434);
		}

		catch(InterruptedException a)
		{
			System.out.println("InterruptedException Handelled");
		}
	}
}