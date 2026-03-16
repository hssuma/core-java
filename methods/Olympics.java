class Olympics
{
	static String sportNames[]= {"Swimming","running","relay","Cycling","wrestling"};
		
	static void sport()
	{		
		System.out.println("olympics class started");
		System.out.println("Sports are ");
		/*sportNames = {"Swimming","running"};
		array declaration and initialization must be in a same line*/
		for (String sport : sportNames)
		{
			System.out.println(sport);
		}
		System.out.println();
		System.out.println("olympics class executed");
	}
			
	public static void main(String ref[])
	{
		sport();		
	}
}