class ParaConst
{
	int length;
	int breadth;

		

	ParaConst(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}

	public void displayArea(int length, int breadth)
	{
		int area = length*breadth;
		System.out.println(area);
	}

	public static void main(String[] args) 
	{
		ParaConst obj = new ParaConst(1,2);          // Some values for parameterized const.
		obj.displayArea(2,3);
	}
}