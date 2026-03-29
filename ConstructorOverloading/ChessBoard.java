class ChessBoard
{
	String brand;
	float rating;
	int quantity;
	double cost;
	String ASIN;
	long serialNumber;
	
	ChessBoard()
	{
		System.out.println("This is a default constructor");
	}
	ChessBoard(String brand)
	{
		this.brand = brand;
		System.out.println("The brand of the chess board is "+brand);
	}
	ChessBoard(float rating)
	{
		this.rating = rating;
		System.out.println("The rating of the chess board is "+rating);
	}
	ChessBoard(int quantity)
	{
		this.quantity = quantity;
		System.out.println("The quantity of the chess board is "+quantity);
	}
	ChessBoard(double cost)
	{
		this.cost = cost;
		System.out.println("The cost of the chess board is "+cost);
	}
	ChessBoard(String brand, String ASIN)
	{
		this.brand= brand;
		this.ASIN = ASIN;
		System.out.println("The ASIN Of the chess board "+brand+" is "+ASIN);
	}
	ChessBoard(long serialNumber)
	{
		this.serialNumber = serialNumber;
		System.out.println("the serial number of the chess board is "+serialNumber);
	}
}