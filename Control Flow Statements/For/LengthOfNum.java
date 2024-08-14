import java.util.Scanner;
class Demo4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Entert the number");
		int num = sc.nextInt();

		int leng=0;

		while(num!=0)
		{
			num = num/10;
			leng++;
		}	

		System.out.println("Length : "+leng);
	}
}