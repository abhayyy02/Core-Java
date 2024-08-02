// abcdef--> aBcDeF

import java.util.Scanner;
class Demo2
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String");
		String str = sc.next();

		StringBuffer sb = new StringBuffer();

		System.out.println("Original String : "+ str);
		for(int i=0; i<str.length(); i++)
		{
			if(i%2==0)
			{
				String s = str.substring(i,i+1).toLowerCase();
				sb.append(s);
			}

			else 
			{
				String s = str.substring(i,i+1).toUpperCase();
				sb.append(s);
			}
		}

		System.out.println("Manipulated String : "+sb);	
	}
}