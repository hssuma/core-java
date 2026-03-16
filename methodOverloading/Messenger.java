class Messenger
{
	static void Login(String email, String password)
	{
		System.out.println(email);
		System.out.println(password);
	}
	static void Login(long phnNum, String password)
	{
		System.out.println(phnNum);
		System.out.println(password);
	}
	public static void main(String ref[])
	{
		Login("sumahsamshasi@gmail.com", "fhddWRW@$$");
		Login(8792462864l, "ARW$&^fds");
	}
}