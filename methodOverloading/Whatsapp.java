class Whatsapp
{
	static void LogIn(String name, String password)
	{
		System.out.println("name "+name);
		System.out.println("password "+password);
	}
	static void LogIn(String name, int otp)
	{
		System.out.println("name "+name);
		System.out.println("OTP "+otp);
	}
	public static void main(String[] ref)
	{
		LogIn("SUMA ","GGF#%@str");
		LogIn("suma", 7845);
	}
}