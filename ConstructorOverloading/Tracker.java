class Tracker
{
	String brand;
	double cost; 
	int quantity;
	float rating;
	String ASIN; 
	String type;
	
	Tracker()
	{
		System.out.println("This is a default constructor ");
	}
	Tracker(String brand)
	{
		this.brand = brand;
		System.out.println("The tracker brand is "+brand);
	}
	Tracker(double cost)
	{
		this.cost = cost;
		System.out.println("The cost of the tracker is "+cost);
	}
	Tracker(int quantity)
	{
		this.quantity = quantity;
		System.out.println("The quantity of the tracker is "+quantity);
	}
	Tracker(float rating)
	{
		this.rating = rating;
		System.out.println("The rating of the tracker is "+rating);
	}
	Tracker(String brand, String type)
	{
		this.brand = brand;
		this.type = type;
		System.out.println("The tracker type is "+type);
	}
	Tracker(double cost , String ASIN)
	{
		this.cost = cost;
		this.ASIN = ASIN;
		System.out.println("the ASIN of the tracker is "+ASIN);
	}
	
}