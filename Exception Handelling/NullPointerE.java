// NullPointerException  --> Unchecked Exception (with multiple catch blocks

class NPE
{
	public static void main(String[] args) 
	{
		String str = null;	

		try 
		{
			if(str.isEmpty())
			{
				System.out.println("BYEBYE");
			}
		}

		catch(IndexOutOfBoundsException ae)							// Won't execute.
		{
			System.out.println(" okay ");
		}

		catch(ClassCastException s)									// Will not execute
		{
			System.out.println(" okay ");
		}

		catch(NullPointerException a)
		{
			System.out.println("NullPointerException Handelled");
		}
	}
}