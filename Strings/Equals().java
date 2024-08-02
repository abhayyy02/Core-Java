class Demo3
{
	public static void main(String[] args) 
	{
		String a = "Hello";									// Stores in SCP. (STRING CONSTANT POOL)

		String b = "Hello";

		String e = "Bye";

		String c = new String ("Hello");

		String d = new String ("Hello");					// Stores in HEAP.

		System.out.println(a==b);
		System.out.println(a.equals(b));

		System.out.println(a==e);
		System.out.println(a.equals(e));
		
		System.out.println(a==c);
		System.out.println(a.equals(c));

		System.out.println(c==d);
		System.out.println(c.equals(d));


	}
}