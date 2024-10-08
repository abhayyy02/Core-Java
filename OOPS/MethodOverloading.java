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

	void m1(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}

	public int m1(int a, String b)
	{
		System.out.println("HEY");
		return 1;
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

		obj.m1(2,"String");
	}
}