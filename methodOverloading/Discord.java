class Discord
{
	static void Login(String email, String password)
	{
		System.out.println(email);
		System.out.println(password);
	}
	static void Login(String userName, String email, String password)
	{
		System.out.println(userName);
		System.out.println(email);
		System.out.println(password);
	}
	public static void main(String ref[])
	{
		Login("sumahsiddappa@gamil.com", "97yWR");
		Login("suma", "sumahsiddappa@gamil", "97yWR");
	}
}