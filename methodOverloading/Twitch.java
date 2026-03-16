class Twitch
{
	static void Login(String name, String password)
	{
		System.out.println(name);
		System.out.println(password);
	}
	static void Login(long num, String password)
	{
		System.out.println(num);
		System.out.println(password);
	}
	public static void main(String ref[])
	{
		Login("Suma", "SNDJ@");
		Login(8792462864l, "dgtfdA@4");
	}
}