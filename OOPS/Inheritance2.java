import java.util.*;

class StudentInfo
{
	static String name;
	static String degree;
	static int yop;

	StudentInfo(String name, String degree, int yop)
	{
		this.name = name;
		this.degree = degree;
		this.yop = yop;
	}

	public void displayStudentInfo()
	{
		System.out.println();
		System.out.println("NAME : "+name);
		System.out.println("DEGREE : "+degree);
		System.out.println("Year Of Passout : "+yop);
	}

}

class Skills extends StudentInfo
{
	static boolean completed_Cousre;
	static String [] techical_Skills;

	Skills(boolean completed_Cousre, String [] techical_Skills, String name, String degree, int yop)
	{
		super(name,degree,yop);
		this.completed_Cousre = completed_Cousre;
		this.techical_Skills = techical_Skills;
	}

	public void displaySkills()
	{
		System.out.println();
		System.out.println("Skills");
		System.out.println(Arrays.toString(techical_Skills));
	}

	public static void main(String[] args) 
	{
		String [] techical_Skills = {"Core-Java", "SQL","JDBC","DBMS"};
		Skills obj = new Skills(true, techical_Skills, "Abhay Jadhav","B-Tech",2024);	

		obj.displayStudentInfo();

		obj.displaySkills();
		
	}
}

