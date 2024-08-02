// abcdef --> aBcDeF

import java.util.*;
class Demo4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter the String");
		String str =sc.nextLine();

		System.out.println("Before Manipulation : "+str);
		StringBuffer sb = new StringBuffer();

		for(int i=0; i<str.length(); i++)
		{
			if(i%2==0)
			{
				String str2 = str.substring(i,i+1).toLowerCase();
				sb.append(str2);
			}

			else 
			{
				String str2 = str.substring(i,i+1).toUpperCase();
				sb.append(str2);
			}
		}

		System.out.println("After Manipulation : "+sb);

	}
}