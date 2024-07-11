class Phone 
{
	String model;
	double price;
	int internalMemory;

	Phone(String model, double price, int internalMemory)
	{
		this.model = model;
		this.price = price;
		this.internalMemory = internalMemory;
	}

	public void displayPhone()
	{
		System.out.println("Phone Details");
		System.out.println("Model : "+model);
		System.out.println("Price : "+price+" Lakhs");
		System.out.println("Internal Memory : "+internalMemory+" GB");
	}

}

class Sim
{
	String brand;
	Phone p;

	Sim(String brand, Phone p)
	{
		this.brand = brand;
		this.p = p;
	}

	public void displaySim()
	{
		System.out.println("Sim Card");
		System.out.println("Brand : "+brand);
	}
}

class PhoneDriver
{
	public static void main(String[] args) 
	{
		Sim obj = new Sim("Jio", new Phone("Iphone 14-Pro", 1.3, 256));

		obj.displaySim();
		System.out.println();
		obj.p.displayPhone();		
	}
}