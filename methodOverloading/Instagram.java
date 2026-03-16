class Instagram
{
	static void Login(String userName, String password)
	{
		System.out.println("Enter your User name  "+userName);
		System.out.println("Enter password "+password);
	}
	static void Login(String userName, String email, String password)
	{
		System.out.println("Enter your user name "+userName);
		System.out.println("Enter your email id "+email);
		System.out.println("Enter your password "+password);
		
	}
	public static void main(String ref[])
	{
		Login("suma", "fg#@#g");
		Login("suma", "sumahsiddappa@gmail.com", "gh@$Q$");
	}
}