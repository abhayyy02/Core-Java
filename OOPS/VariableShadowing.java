class Parent
{
	int a =10;										
}

class Child extends Parent
{
	int a =20;
	void m1()
	{
		int a =30;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}

	public static void main(String[] args) 
	{
		Child obj = new Child();
		obj.m1();
		System.out.println(obj.a);
	}
}

