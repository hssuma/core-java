class Swiggy
{
	//A functionality can achieve using method overloading
	public static double search(String foodName)
	{
		double price = 99.88;
		System.out.println("burger cost is "+price);
		return price;
	}

	public static double search(String foodName,  double price, int quantity)
	{
		double totalPrice = quantity * price;
		System.out.println(totalPrice);
		return totalPrice ;
	}
	public static void main(String ref[])
	{
		
		search("burger");
		search("burger", 99.22, 2);
	}
}