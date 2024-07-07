// Fabanocci Series
class Demo8
{
	public static void main(String[] args) 
	{
			int num1 = 0;
			int num2 = 1;
			int op = 0;
			for(int i=1; i<10; i++)	
			{
				op = num1+ num2;
				num1 = num2;
				num2 = op;
			}	

			System.out.println(op);
			
	}
}