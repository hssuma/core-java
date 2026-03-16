class Threads
{
	static void Login(String email, String password)
	{
		System.out.println("Email_ID  "+email);
		System.out.println("Password "+password);
	}
	static void Login(String name, int otp)
	{
		System.out.println("name"+name);
		System.out.println("OTP "+otp);
	}
	public static void main(String[] ref)
	{
		Login("sumahsi@gmail.com","SDHWQ");
		Login("Suma",56876);
	}
}