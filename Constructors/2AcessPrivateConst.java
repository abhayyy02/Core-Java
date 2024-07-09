class Abhay
{
	int num;
	private Abhay(int num)
	{
		this.num=num;
		System.out.println("Hello");                 // Acessing private const in another class.
	}

	public Abhay createObjectOfAbhay(int num)
	{
		return new Abhay(num);
	}

	Abhay()
	{

	}
}

class AbhayDriver1
{
	public static void main(String[] args) 
	{
		Abhay obj = new Abhay();	
		obj.createObjectOfAbhay(2);
	}
}