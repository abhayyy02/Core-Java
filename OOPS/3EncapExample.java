class Bike3
{
	private String brand, model;
	private int fuelCap;
	private float mileage;
	private double price;

	Bike3(String brand, String model, int fuelCap, float mileage, double price)
	{
		this.brand = brand;
		this.model = model;
		this.fuelCap = fuelCap;
		this.mileage = mileage;
		this.price = price;
	}

	public String getBrand()
	{
		return brand;
	}

	public String getModel()
	{
		return model;
	}

	public int getFuelCap()
	{
		return fuelCap;
	}

	public float getMileage()
	{
		return mileage;
	}

	public void setMileage(float updatesMileage)
	{
		mileage = updatesMileage;
	}

	public double getPrice()
	{
		return price;
	}

	public void displayBike()
	{
		System.out.println(brand);
		System.out.println(model);
		System.out.println(fuelCap+ " ltr");
		System.out.println(mileage +" km/hr");
		System.out.println(price +" Lakhs");
	}

}

class Driver3
{
	public static void main(String[] args) 
	{
		Bike3 obj = new Bike3("Royal-Enfield", "Continental GT-650", 12, 25,3.25);
		obj.displayBike();			
	}
}