// print A to Z in ascending order, descending. 

class Demo2
{
	public static void main(String[] args) 
	{
		System.out.println("Ascending Order. ");
		System.out.println();

		for(char ch = 'A'; ch<='Z'; ch++)
		{
			System.out.print(ch+ " ");
		}	

		System.out.println();
		System.out.println("Descending Order. ");
		System.out.println();

		for(char ch = 90 ; ch >= 65; ch--)
		{
			System.out.print(ch+ " ");
		}
	}
}
