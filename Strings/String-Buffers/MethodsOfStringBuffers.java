class Demo3
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("Bello let's go");

		StringBuffer sb1 = new StringBuffer(1);

		System.out.println(sb);

		System.out.println(sb.length());								// length()

		System.out.println(sb.capacity());								// capaccity()

		System.out.println(sb1.capacity());

		System.out.println(sb.charAt(4));								//charAt()

		sb.setCharAt(0,'H');											//setCharAt()

		System.out.println(sb);

		sb.append(". Come on");											//append()

		System.out.println(sb);
								
		sb.insert(0,"Abhay ");											//insert()
		System.out.println(sb);

		sb.delete(0,6);
		System.out.println(sb.toString());								//delete()

		sb.deleteCharAt(0);												//deleteCharAt()
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);											//reverse()

		sb.reverse();
		System.out.println(sb);
		
		sb.insert(0,'H');
		System.out.println(sb);

		sb.setLength(5);												//setLength()
		System.out.println(sb);  

		System.out.println(sb.capacity());								

		sb.trimToSize();
		System.out.println(sb.capacity());								//trimToSize()


	}
}