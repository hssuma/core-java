class YouTube
{
	static void Login(String email, String password)
	{
		System.out.println("email "+email);
		System.out.println("password "+password);
	}
	static void Login(String email, int otp)
	{
		System.out.println("email "+email);
		System.out.println("OTP "+otp);
	}
	public static void main(String[] login)
	{
		Login("sumahsi@gmail.com","KKOE*#");
		Login("sumahsi@gmail.com",5679);
	}
}