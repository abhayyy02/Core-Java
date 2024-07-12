// Primitve Casting --> 1.Widening 2.Narrowing

// Widening is done implicitly my compilier.

class WideningExample
{
	public static void main(String[] args) 
	{
		byte a =1;
		short b = a;
		int c = a;
		long d = a;

		System.out.println(d);
	}
}

class NarrowingExample
{
	public static void main(String[] args) 
	{
		int a=5;
		byte c = (byte)a;

		System.out.println(c);

		double z = 9.3d;
		float f = (float)z;


		char r = 'a';
		int o = (int)r;


		System.out.println(o);
		System.out.println(f);	
	}
}