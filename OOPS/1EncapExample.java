// Encapsulation : Restrict direct access of private variables and give them indirect access through getters and setters().

class MyInfo1
{
	private String name, birthDate, address;
	private long number;
	private int age;

	MyInfo1(String name, String birthDate, String address, long number ,int age)
	{
		this.name = name;
		this.birthDate = birthDate;
		this.address = address;
		this.number = number;
		this.age = age;
	}

	public String getName()
	{
		return name;
	}
	
	public String getBirthDate()
	{
		return birthDate;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String updatedAdress)
	{
		address = updatedAdress;
	}

	public long getNumber()
	{
		return number;
	}

	public void setNumber(long updatedNumber)
	{
		number = updatedNumber;
	}

	public int getAge()
	{
		return age;
	}

	void displayMyInfo()
	{
		System.out.println(name);
		System.out.println(birthDate);
		System.out.println(address);
		System.out.println(number);
		System.out.println(age);
	}
}

class MyInfo1Driver
{
	public static void main(String[] args) 
	{
		MyInfo1 obj = new MyInfo1 ("Abhay Jadhav","07-08-2002","West Coast Park, Pune", 9322765l, 21);	
		obj.displayMyInfo();

		System.out.println();

		MyInfo1 obj2 = new MyInfo1 ("Sharvari Jadhav","09-03-2007","West Coast Park, Pune", 992838l, 17);
		obj2.displayMyInfo();

		obj2.setAddress("Latur");
		System.out.println(obj2.getAddress());
	}
}
