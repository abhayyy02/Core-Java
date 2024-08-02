class Demo1
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer();					//No-Argument Constructor

		StringBuffer sb2 = new StringBuffer(13);				//(int capacity)	

		String str = "Abha";

		StringBuffer sb3 = new StringBuffer(str);   	// (String s)

		System.out.println(sb3);
	}
}