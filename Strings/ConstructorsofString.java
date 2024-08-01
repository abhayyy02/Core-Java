import java.util.*;
class Demo1
{
	public static void main(String[] args)
	{
		String str = new String();             						// No-Argument Constructor.
		System.out.println(str);            

		StringBuffer sb = new StringBuffer("Abhay");				//StringBuffer
		String str1 = new String(sb);
		System.out.println(str1);

		StringBuilder sb1 = new StringBuilder("Jadhav");			//StringBuilder
		String str2 = new String(sb1);
		System.out.println(str2);

		char ch [] = {'A','B','H','A'}; 							//charArray[]
		String str3 = new String(ch);
		System.out.println(str3);

		byte arr [] = {65,66,64,63,90,77};							//byteArray[]	
		String str4 = new String(arr);
		System.out.println(str4);
	}
}