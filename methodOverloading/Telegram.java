class Telegram
{
	static void Login(String userName, String password)
	{
		System.out.println(userName);
		System.out.println(password);
	}
	static void Login(long phnNum, String password)
	{
		System.out.println(phnNum);
		System.out.println(password);
	}
	public static void main(String ref[])
	{
		Login("suma", "%#D63&");
		Login(8792462874l,"hfht$&^");
	}
}