class Battery
{
	String brand;
	double cost; 
	int quantity;
	float rating;
	String ASIN; 
	String type;
	
	Battery()
	{
		System.out.println("This is a default constructor ");
	}
	Battery(String brand)
	{
		this.brand = brand;
		System.out.println("The battery brand is "+brand);
	}
	Battery(double cost)
	{
		this.cost = cost;
		System.out.println("The cost of the battery is "+cost);
	}
	Battery(int quantity)
	{
		this.quantity = quantity;
		System.out.println("The quantity of the battery is "+quantity);
	}
	Battery(float rating)
	{
		this.rating = rating;
		System.out.println("The rating of the battery is "+rating);
	}
	Battery(String brand, String type)
	{
		this.brand = brand;
		this.type = type;
		System.out.println("The battery type is "+type);
	}
	Battery(double cost , String ASIN)
	{
		this.cost = cost;
		this.ASIN = ASIN;
		System.out.println("the ASIN of the battery is "+ASIN);
	}
	
}