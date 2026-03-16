class Care2
{
    static void login(String email,String password)
    {
        System.out.println(email);
        System.out.println(password);
    }

    static void login(String email,int otp)
    {
        System.out.println(email);
        System.out.println(otp);
    }

    public static void main(String[] args)
    {
        login("suma@gmail.com","care@123");
        login("suma@gmail.com",8787);
    }
}