 import java.util.*;
 class Demo3
 {
 	public static void main(String[] args) 
 	{
 		Scanner sc = new Scanner (System.in);

 		System.out.println("Enter number");
 		int num = sc.nextInt();

 		int i=1;

 		System.out.print("Factors are : ");
 		while(i<=num)
 		{
 			if(num%i==0)
 			{
 				System.out.print(i+" ");
 			}

 			i++;
 		}	
 	}
 }