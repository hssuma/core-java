class ZomatoOne
{
	public static double search(String foodName)
	{
	

		if(foodName == "Burger")
		{
			System.out.println(foodName);
			 price = 99.00;
			 System.out.println(price);
			return price;
		}
		if(foodName == "pizza")
		{
			System.out.println(foodName);
			System.out.println(price);
		price = 200;
			return price;
		}
		if(foodName == "sandwich")
		{
			System.out.println(foodName);
			
			 price = 100;
			 System.out.println(price);
			return price;
		}
		if(foodName == "frenchfries")
		{
			System.out.println(foodName);
			 price = 120;
			 System.out.println(price);
			return price;
		}
		
		return price;
	}
	public static void main(String[] ref)
	{
		search("pizza");
	}
}