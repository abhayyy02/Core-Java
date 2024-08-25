class T1
{
	public static void main(String[] args) 
	{
		System.out.println("Starts");

		try 
		{
			throw new ArithmeticException("AE created");
		}

		catch(ArithmeticException ae)
		{
			System.out.println(ae.toString()+" <- Handelled");
		}

		System.out.println("Ends");
	}
}