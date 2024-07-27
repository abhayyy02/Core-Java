class Parent
{
	public static void  m1()
	{
		System.out.println("Hello");
	}

	public void m1(int a)									// m1() --> Method-Overloading
	{
		System.out.println("Hey");
	}
}

class Child extends Parent
{
	public static void m1()
	{
		System.out.println("Bye");
	}
 
	public static void main(String[] args) 
	{
		m1();             // m1() of Parent Class will be shadowed by Child class's m1().

		Parent obj = new Parent();
		obj.m1(3);										
	}
}