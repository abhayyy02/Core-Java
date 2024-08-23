import java.util.*;

class ProgLang
{
	String founder;
	String extention;
	int inventedYear;

	ProgLang(String founder, String extention, int inventedYear)
	{
		this.founder = founder;
		this.extention = extention;
		this.inventedYear = inventedYear;
	}

	public void displayProgLang()
	{
		System.out.println("Founder : "+founder);
		System.out.println("Extention : "+extention);
		System.out.println("inventedYear : "+inventedYear);
	}
}

class Java extends ProgLang
{
	String [] features;
	boolean efficient;

	Java(String [] features, boolean efficient, String founder, String extention, int inventedYear)
	{
		super(founder,extention,inventedYear);
		this.features = features;
		this.efficient = efficient;
	}

	public void displayJava()
	{
		System.out.println("Features : "+Arrays.toString(features));
		System.out.println("Efficient : "+efficient);
	}
}

class InheritDriver1
{
	public static void main(String[] args) 
	{
		String [] features = {" Platform Independent"," Robust"," Secure"," Multi-Threaded"," Object-Oriented"};

		Java obj = new Java(features,true,"James Gosling",".java",1995);

		obj.displayJava();

		ProgLang ob1 = new ProgLang("James Gosling",".java",1995);
		ob1.displayProgLang();
	}
}