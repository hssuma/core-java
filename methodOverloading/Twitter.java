class Twitter
{
	static void SignUp(String name, String password)
	{
		System.out.println("enter your name "+name);
		System.out.println("enter your password "+password);
	}
	static void SignUp(String name, String email, String password)
	{
		System.out.println("enter your name  "+name);
		System.out.println("Enter your email "+email);
		System.out.println("Enter your password "+password);
	}
	public static void main (String ref[])
	{
		SignUp("Suma", "SDS@#!d");
		SignUp("suma", "sumahsiddappa@gmail.com","hagsd");
	}
}