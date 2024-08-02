import java.util.*;
class Demo2
{
	public static void main(String[] args) 
	{
		String str = "My name is Abhay Jadhav. ";

		System.out.println(str);

		System.out.println("length() : "+str.length());										//length()	
		
		System.out.println("isEmpty() : "+str.isEmpty());									//isEmpty()

		System.out.println("charAt() : "+str.charAt(8));									//charAt()
		//System.out.println(str.charAt(100));    											// StringIndexOutOfBoundsException.
 					
 		System.out.println("toLowerCase() : "+str.toLowerCase());							//toLowerCase()

 		System.out.println("toUpperCase() : "+str.toUpperCase());							//toUpperCase()

 		String str2 ="My branch is Computer-Science.";

 		System.out.println("concat() : "+str.concat(str2));									//concat()
			
 		System.out.println("substring() : "+str.substring(0,2));             				//substring(int startIndex,int LastLength)

 		System.out.println("indexOf() : "+str.indexOf('m'));								//indexOf()
 		System.out.println("indexOf() : "+str.indexOf('z'));								//-1

 		System.out.println("lastIndexOf() : "+str.lastIndexOf('a'));						//lastIndexOf()

 		System.out.println("codePointAt() : "+str.codePointAt(4));							//codePointAt()  --> returns ASCII Values.

 		System.out.println("trim() : "+str.trim());											//trim() --> trims the SPACE from start and end of string.

 		System.out.println("startsWith() : "+str.startsWith("My"));							//startsWith() 

 		if(str.startsWith("A"))
 		{
 			System.out.println("HELLO");
 		}
 		else 
 		{
 			System.out.println("BYE");
 		}

 		System.out.println("endsWith() : "+str.endsWith(". *"));							//endsWith()

 		
 		String [] words = str.split(" ");										 			//split()

 		System.out.println();
 		System.out.println("split() : ");
 		System.out.println("After split()");

 		for(String s : words)
 		{
 			System.out.println(s);
 		}

 	}
}