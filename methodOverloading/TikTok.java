class TikTok
{
	static void Login(String email, String password)
	{
		System.out.println("email "+email);
		System.out.println("password "+password);
	}
	static void Login(String name,String email, String password)
	{
		System.out.println("name "+name);
		System.out.println("password "+password);
	}
	public static void main(String[] ref)
	{
		Login("sumahsiddappa@gamil.com", "agj@#DRD");
		Login("Suma ","sumahsiddappa@gamil","ADW2$D#%");
	}
}