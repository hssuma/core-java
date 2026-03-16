class Reddit
{
	static void Login(String userName, String password)
	{
		System.out.println(userName);
		System.out.println(password);
	}
	static void Login(String email, int OTP)
	{
		System.out.println(email);
		System.out.println(OTP);
	}
	public static void main(String ref[])
	{
		Login("suma", "SOI@$ws2");
		Login("sumahsiddappa@gmail.com", 789123);
	}
}