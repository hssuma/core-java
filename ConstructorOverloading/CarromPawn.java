class CarromPawn
{
	String brand;
	double cost; 
	int quantity;
	float rating;
	String ASIN; 
	String color;
	
	CarromPawn()
	{
		System.out.println("This is a default constructor ");
	}
	CarromPawn(String brand)
	{
		this.brand = brand;
		System.out.println("The carrom pawn brand is " + brand);
	}
	CarromPawn(double cost)
	{
		this.cost = cost;
		System.out.println("The cost of the carrom pawn is " + cost);
	}
	CarromPawn(int quantity)
	{
		this.quantity = quantity;
		System.out.println("The quantity of the carrom pawns is " + quantity);
	}
	CarromPawn(float rating)
	{
		this.rating = rating;
		System.out.println("The rating of the carrom pawn is " + rating);
	}
	CarromPawn(String brand, String color)
	{
		this.brand = brand;
		this.color = color;
		System.out.println("The carrom pawn color is " + color);
	}
	CarromPawn(double cost, String ASIN)
	{
		this.cost = cost;
		this.ASIN = ASIN;
		System.out.println("The ASIN of the carrom pawn is " + ASIN);
	}
}