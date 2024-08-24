//ArithmeticException --> Unchecked Exception

class AE
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println(10/0);
		}	

		catch(ArithmeticException ae)
		{
			System.out.println("Starts");
			ae.printStackTrace();
			System.out.println("Ends");
		}
	}
}