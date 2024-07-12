// Method Overloading - Class having more than one method with same name and different formal arguments.

class ClassA
{
	public static void m1(int a)
	{
		System.out.println(a);
	}


	public static void m1(int a, int b)
	{
		System.out.println(a+b);
	}

	public void m1(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}

}

class ADriver
{
	public static void main(String[] args) 
	{
		ClassA.m1(2);

		ClassA obj = new ClassA();

		ClassA.m1(4,0);

		obj.m1(2,3,4);
	}
}