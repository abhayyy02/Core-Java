// Areas of Shapes, using creation of object of Multiple constructors.  (Explicitly creation of object.)

class Area
{
	double side;
	double b;
	double l;
	float radius;

	private Area(double side)
	{
		// Area of Circle
		this.side = side;
		double areaSquare = side * side;
		System.out.println("Square : "+areaSquare);
	}

	private Area(double b, double l)
	{
		// Area of  rectangle
		this.b=b;
		this.l=l;
		double areaRect = l*b;
		System.out.println("Rectangle : "+areaRect);
	}

	private Area(float radius)
	{
		this.radius = radius;
		float areaCircle = 3.14f * (radius * radius);
		System.out.println("Circle : "+areaCircle);
	}

	Area()
	{

	}

	public Area createObjofSquare(double side)
	{
		return new Area(side);
	}

	public Area createObjofRect(double b, double l)
	{
		return new Area (b,l);
	}

	public Area createObjofCircle(float radius)
	{
		return new Area(radius);
	}
}

class Shapes
{
	public static void main(String[] args) 
	{
		Area a = new Area();	

		a.createObjofSquare(4.2);
		a.createObjofRect(1.5 , 3.5);
		a.createObjofCircle(2.2f);
 
	}
}