class WeChat
{
	static void Login(String name, String password)
	{
		System.out.println(name);
		System.out.println(password);
	}
	static void Login(long num, int otp)
	{
		System.out.println(num);
		System.out.println(otp);
	}
	public static void main(String []ref)
	{
		Login("Suma", "hkuE#");
		Login(8792462864l, 87955);
	}
}