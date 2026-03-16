class SBIApp
{
    static void login(String user,String password)
    {
        System.out.println(user);
        System.out.println(password);
    }

    static void login(String user,int otp)
    {
        System.out.println(user);
        System.out.println(otp);
    }

    public static void main(String[] args)
    {
        login("suma","sbi@123");
        login("suma",1112);
    }
}