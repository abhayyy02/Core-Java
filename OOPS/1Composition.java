// Has-A relationship - Composition
class Engine 
{
	String type;
	int cc;

	public Engine(String type, int cc)
	{
		this.type = type;
		this.cc = cc;
	}

	public void displayEngine()
	{
		System.out.println("Engine Details");
		System.out.println(type);
		System.out.println(cc);
	}

}

class Car                  // Car class is Dependent on Engine class.
{
	String brand;
	String model;
	double price;

	Engine e;

	Car(String brand, String model, double price, Engine e)
	{
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.e = e;
	}

	public void displayCar()
	{
		
		System.out.println("CAR DETAILS");
		System.out.println(brand);
		System.out.println(model);
		System.out.println(price);
	}
}

class CarDriver
{
	public static void main(String[] args) 
	{
		Car obj = new Car("Toyota","Fortuner Legender", 42.34, new Engine("Petrol", 960));

		// System.out.println(obj.brand);
		// System.out.println(obj.e.type);              // Path

		obj.displayCar();
		System.out.println();
		obj.e.displayEngine();
	}
}