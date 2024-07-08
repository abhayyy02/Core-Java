class Laptop
{
	static String brand;
	static String model;
	static String type; 
	static byte generation;
	static double price;

	public static void displayLaptop()
	{
		System.out.println("  --- Laptop Details ---  ");
		System.out.println("Brand : "+brand);
		System.out.println("Model : "+model);
		System.out.println("Type  : "+type);
		System.out.println("Price : "+price+" Lakhs");
		System.out.println("Generation :  "+generation +"th");
	}	
}

class LaptopDriver
{
	public static void main(String[] args) 
	{
		Laptop obj = new Laptop();

		obj.brand ="Predator";
		obj.model = "Predator Helios 300";
		obj.type = "Gamming Laptop";
		obj.generation = 9;
		obj.price = 1.20;

		obj.displayLaptop();
	}
}