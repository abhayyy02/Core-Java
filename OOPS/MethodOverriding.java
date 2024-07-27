class MParent
{
	public void m1()
	{
		System.out.println("HEllo");
	}
}

class MChild extends MParent
{
	public void m1()
	{
		System.out.println("Hey");
	}


	public static void main(String[] args) 
	{
		MParent obj = new MChild();    							// Upcasting.
		obj.m1();	

		System.out.println(obj instanceof MParent);            //instanceof
	
	}
}
