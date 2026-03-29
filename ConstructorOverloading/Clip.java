class Clip
{
	String brand;
	double cost; 
	int quantity;
	float rating;
	String ASIN; 
	String material;
	
	Clip()
	{
		System.out.println("This is a default constructor ");
	}
	Clip(String brand)
	{
		this.brand = brand;
		System.out.println("The clip brand is "+brand);
	}
	Clip(double cost)
	{
		this.cost = cost;
		System.out.println("The cost of the clip is "+cost);
	}
	Clip(int quantity)
	{
		this.quantity = quantity;
		System.out.println("The quantity of the clip is "+quantity);
	}
	Clip(float rating)
	{
		this.rating = rating;
		System.out.println("The rating of the clip is "+rating);
	}
	Clip(String brand, String material)
	{
		this.brand = brand;
		this.material = material;
		System.out.println("The clip is made by the material "+material);
	}
	Clip(double cost , String ASIN)
	{
		this.cost = cost;
		this.ASIN = ASIN;
		System.out.println("the ASIN of the clip is "+ASIN);
	}
	
}