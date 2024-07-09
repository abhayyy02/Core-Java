class BankDetails2
{
	private String name, ifsc; 
	private long acNumb;
	private int pin;

	BankDetails2(String name, String ifsc, long acNumb, int pin)
	{
		this.name = name;
		this.ifsc = ifsc;
		this.acNumb = acNumb;
		this.pin = pin;
	}

	public String getName()
	{
		return name;
	}

	public String getIFSC()
	{
		return ifsc;
	}

	public long getAcNo()
	{
		return acNumb;
	}

	public int getPin()
	{
		return pin;
	}

	public void setPin(int upin)
	{
		pin = upin;
	}

	void displayBankDetails()
	{
		System.out.println(name);
		System.out.println(ifsc);
		System.out.println(acNumb);
		System.out.println(pin);
	}
}

class BankDetailsDriver
{
	public static void main(String[] args) 
	{
		BankDetails2 obj = new BankDetails2("Abhay Jadhav", "IBS7737G",636373,1001);

		obj.displayBankDetails();
	}
}