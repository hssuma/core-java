class Wattpad
{
	static void LogIn(String name, String password)
	{
		System.out.println("name "+name);
		System.out.println("password "+password);
	}
	static void LogIn(String email, int OTP)
	{
		System.out.println("email id "+email);
		System.out.println("OTP "+OTP);
	}
	public static void main(String ref[])
	{
		LogIn("Suma","SUMA@*$@11");
		LogIn("sumahsiddappa@gmail.com",4545);
	}
}