class Street
{
	static void details()
	{
		System.out.println("details method is executing from the Street class");
		
	}
	static void pincode()
	{
		System.out.println("pincode method is executing from the Street class");
		Company.generate();
	}
}