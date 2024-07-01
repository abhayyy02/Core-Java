// Local and Global variable 
class Demo3
{
	static int a=10;             			 // Global Static Variable. 
	
	public static void main(String[] args) 
	{
		int a = 20;           			     // Local Variable.    // non-static variable
		
		System.out.println(a);  			 // Local varialble will be preferred.

		System.out.println(Demo3.a);         // We can acess global variable using class name as reference.
	}
}