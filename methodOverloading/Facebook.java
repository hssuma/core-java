class Facebook
{
	static void Login(String userName, String password)
	{
		System.out.println("enter your user name "+userName);
		System.out.println("Enter your password "+password);
	}
	static void Login(String userName, long phoneNum, String password)
	{
		System.out.println("Enter your user name "+userName);
		System.out.println("Enter your phone number "+phoneNum);
		System.out.println("Enter your password "+password);
	}
	public static void main(String ref[])
	{
		Login("suma", "gf@td56");
		Login("suma",8792462864l, "ghd@dhf55");
	}
}