// this()
class Book
{
	String author;
	String title;
	double price;
	int pages;

	Book(String author)
	{
		this.author = author;
	}

	Book(String author, String title)
	{
		this(author);  																	// chaining
		this.title = title;
	}

	Book(String author, String title, double price)
	{
		this(author,title); 															// chaining
		this.price = price;
	}

	Book(String author, String title, double price, int pages)
	{
		this(author, title, price);
		this.pages = pages;
	}

	Book()												// Over-ride the No-Arg Constructor to avoid CTE. (while using multiple const and super().)
	{

	}
	
}

class Book2 extends Book
{
	String publishedYear;


	Book2(String author, String title, double price, int pages, String publishedYear)
		{
			super(author, title, price,pages);
			this.publishedYear = publishedYear;
		}


	public void displayBook()
	{
		System.out.println(author);
		System.out.println(title);
		System.out.println(price);
		System.out.println(pages);
		System.out.println(publishedYear);
	}

	public static void main(String[] args) 
	{

			Book2 obj = new Book2("ABHAY JADHAV","JAVA",2.2d,100,"2020");
			obj.displayBook();
	}
}