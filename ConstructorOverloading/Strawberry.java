class Strawberry
{
	String brand;
	double cost; 
	int quantity;
	float rating;
	String ASIN; 
	String type;
	
	Strawberry()
	{
		System.out.println("This is a default constructor ");
	}
	Strawberry(String brand)
	{
		this.brand = brand;
		System.out.println("The strawberry brand is " + brand);
	}
	Strawberry(double cost)
	{
		this.cost = cost;
		System.out.println("The cost of the strawberry is " + cost);
	}
	Strawberry(int quantity)
	{
		this.quantity = quantity;
		System.out.println("The quantity of the strawberries is " + quantity);
	}
	Strawberry(float rating)
	{
		this.rating = rating;
		System.out.println("The rating of the strawberry is " + rating);
	}
	Strawberry(String brand, String type)
	{
		this.brand = brand;
		this.type = type;
		System.out.println("The strawberry type is " + type);
	}
	Strawberry(double cost, String ASIN)
	{
		this.cost = cost;
		this.ASIN = ASIN;
		System.out.println("The ASIN of the strawberry is " + ASIN);
	}
}