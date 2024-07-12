class A
{
	A()
	{
		System.out.println("0");
	}

	A(int a)
	{
		System.out.println("1");
	}

	A(int v, int w)
	{
		System.out.println("2");
	}

	public static void main(String[] args) 
	{
		A obj2 = new A();
		A obj1 = new A(1);
		A obj = new A(2,2);	
	}
}