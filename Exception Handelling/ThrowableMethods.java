class A
{
	public static void main(String[] args) 
	{
		try 
		{
			throw new ArithmeticException ("HEllo");
		}
		catch(Exception d)
		{
			d.printStackTrace();													// 1.
			System.out.println();
			System.out.println(d.getMessage());										// 2.
			System.out.println();
			System.out.println(d.toString());										// 3.
		}	
	}
}