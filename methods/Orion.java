class Orion
{
	//static String shopNames[] ={"zara","h&m","Dyson","Superdry","tommy hilfiger","Sephora"};
	static String clothShops[] = {"zara", "h&m","pantlooms"};
	static String games[] = {"bowling","Arcade games","bumper cars"};
	static String snacks[] = {"kabajji cafe","mc","dessert works"};
	static void shop()
	{
		System.out.println("THe list of available shops in orion mall are ");
		System.out.println();
		
		System.out.println("The list of available cloth shops in orion mall are");
		for(String clothshop: clothShops)
		{
			System.out.println(clothshop);
		}
		
		System.out.println();
		System.out.println("THe list of available games in orion mall are");
		for(String game : games)
		{
			System.out.println(game);
		}
		System.out.println();
		System.out.println("THe list of available snacks in orion mall are");
		for (String food : snacks)
		{
			System.out.println(food);
		
		}
	}
	
	
	/*satic void 
	{
		
	}*/
	
	
	
	
	public static void main(String ref[])
	{
		shop();
	}
}