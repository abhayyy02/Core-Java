// Multi-Level Inheritance.    ProgLan --> Java -->  Oops

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

class Oops extends Java
{
	String [] oops;

	Oops(String [] oops,String [] features, boolean efficient, String founder, String extention, int inventedYear)
	{
		super(features, efficient,founder,extention,inventedYear );
		this.oops = oops;
	}

	public void displayOops()
	{
		System.out.println("OOPS : "+Arrays.toString(oops));
	}
}

class InheritDriver1
{
	public static void main(String[] args) 
	{
		String [] features = {" Platform Independent"," Robust"," Secure"," Multi-Threaded"," Object-Oriented"};

		String [] oops = {"Encapsulation", "Inheritance", "Abstraction", "Polymorphism"};

		Oops obj = new Oops(oops,features,true,"James Gosling",".java",1995);
		obj.displayOops();

		System.out.println();
		obj.displayJava();

		System.out.println();
		obj.displayProgLang();
	
	}
}