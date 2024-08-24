// Finally{} execution

class Demo
{
	public static void main(String[] args) 
	{
		String str = null;

		try 
		{
			if(str.isEmpty())
			{
				System.out.println("Hello");
			}

		}

		catch(NullPointerException d)
		{
			System.out.println("NullPointerException Handelled");
		}

		Demo obj = new Demo();

		obj.Demo1();
	}

	public void Demo1()
	{
		try 
		{
			System.out.println(10/0);
		}

		catch(Exception s)
		{
			System.out.println("HEllo from catch{} Demo1");
		}

		finally
		{	
			System.out.println("Finally from Demo1");
		}
	}
}