// User created NPE

class UserNPE extends  Exception
{
	String desc;

	UserNPE(String desc)
	{
		super(desc);
	}
}

class Student
{
	String name;
	String place;

	Student(String name, String place)
	{
		this.name = name;
		this.place = place;
	}
}

class CNPE
{
	public static void main(String[] args) 
	{
		Student obj = new Student("ABHAY","PUNE");

		Student obj1=null;

		if(obj1==null)
		{
			try 
			{
				throw new UserNPE("Object is null");
			}
			catch(UserNPE s)
			{				
				s.printStackTrace();
			}
		}	
	}
}