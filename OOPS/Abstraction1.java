import java.util.*;

abstract class Arithmetic
{
	abstract public void addition(int i, int j);
	abstract public void substraction(int i, int j);
	abstract public void multiplication(int i, int j);
	abstract public void division(int i, int j);
}

class Implementation extends Arithmetic
{
	public void addition(int i, int j)
	{
		System.out.println("i+j = "+ (i+j));
	}

	public void substraction(int i, int j)
	{
		System.out.println("i-j = " +(i-j));
	}

	public void multiplication(int i, int j)
	{
		System.out.println("i*j = "+ (i*j));
	}

	public void division(int i, int j)
	{
		System.out.println("i/j = "+(i/j));
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("i");
		int i = sc.nextInt();

		System.out.println("j");
		int j = sc.nextInt();
	
		Arithmetic obj = new Implementation();

		obj.addition(i,j);	

		obj.substraction(i,j);

		obj.division(i,j);

		obj.multiplication(i,j);
	}
}