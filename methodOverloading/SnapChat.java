class SnapChat
{
	static void Login(String userName, String pasword)
	{
		System.out.println("userName "+userName);
		System.out.println("password "+pasword);
	}
	static void Login(String userName,String email, String pasword)
	{
		System.out.println("userName "+userName);
		System.out.println("email "+email);
		System.out.println("password " +pasword);
	}
	public static void main(String ref[])
	{
		Login("Suma","fghA@$ED");
		Login("Suma","sumahdsiddappa@gmail.com", "fdW#R$");
	}
}