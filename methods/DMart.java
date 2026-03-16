class DMart
{
	static String homeDecorThings[] = {"Micah planter", "Unaisa statue", "Killian planter", "Martin vase", "Lynlee planter"}; 
	static void homeDecor()
	{
		System.out.println("the list of home decor items in dmart are ");
		for (String homeDecor : homeDecorThings)
		{
			System.out.println(homeDecor);
		}
	}
	
	public static void main(String[] args)
	{
		homeDecor();
	}
}