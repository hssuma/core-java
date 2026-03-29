class Umbrella
{
	String brand;
	double cost;
	float rating;
	int quantity;
	long serialNo;
	String ASIN;
	
	Umbrella()
	{
		System.out.println("This is a deafault constructor of the class Umbrella");
	}
	Umbrella(String brand)
	{
		this.brand = brand;
		System.out.println("The brand of the umbrella is "+brand);
	}
	Umbrella(double cost)
	{
		this.cost = cost;
		System.out.println("The cost of the umbrella is "+cost);
	}
	Umbrella(float rating)
	{
		this.rating =rating;
		System.out.println("The rating of umbrella is "+rating);
	}
	Umbrella(int quantity)
	{
		this.quantity = quantity;
		System.out.println("The unit of umbrella "+quantity);
	}
	Umbrella(long serialNo)
	{
		this.serialNo = serialNo;
		System.out.println("The serialNo of the umberalla is "+serialNo);
	}
	Umbrella(String brand, String ASIN)
	{
		this.brand = brand;
		this.ASIN = ASIN;
		System.out.println("The umbrella of the brand "+brand +"'s is "+ASIN);
	}

}