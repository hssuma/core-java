class Steel
{
	String brand;
	double cost; 
	int quantity;
	float rating;
	String ASIN; 
	String type;
	
	Steel()
	{
		System.out.println("This is a default constructor ");
	}
	Steel(String brand)
	{
		this.brand = brand;
		System.out.println("The steel brand is " + brand);
	}
	Steel(double cost)
	{
		this.cost = cost;
		System.out.println("The cost of the steel is " + cost);
	}
	Steel(int quantity)
	{
		this.quantity = quantity;
		System.out.println("The quantity of the steel is " + quantity);
	}
	Steel(float rating)
	{
		this.rating = rating;
		System.out.println("The rating of the steel is " + rating);
	}
	Steel(String brand, String type)
	{
		this.brand = brand;
		this.type = type;
		System.out.println("The steel type is " + type);
	}
	Steel(double cost, String ASIN)
	{
		this.cost = cost;
		this.ASIN = ASIN;
		System.out.println("The ASIN of the steel is " + ASIN);
	}
}