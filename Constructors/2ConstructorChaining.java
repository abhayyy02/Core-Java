class Car
{
	String model;
	double power;
	float mileage;
	int torque;

	Car(String model)
	{
		this.model = model;
	}

	Car(String model, double power)
	{
		this(model);
		this.power = power;
	}

	Car(String model, double power, float mileage)
	{
		this(model,power);
		this.mileage = mileage;
	}

	Car(String model, double power, float mileage, int torque)
	{
		this(model,power,mileage);
		this.torque = torque;
	}

	Car()
	{

	}

	public void displayCar()
	{
		System.out.println("Model : "+model);
		System.out.println("Power : "+power+" bhp");
		System.out.println("Mileage : "+mileage+" km/hr");
		System.out.println("Torque : "+torque+" Nm");
	}
}

class CarDriver
{
	public static void main(String[] args) 
	{
		Car obj = new Car("Toyota Fortuner Legender", 179.56d, 8.2f, 450);
		obj.displayCar();	
	}
}