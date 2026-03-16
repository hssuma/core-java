class Gmail
{
    static void login(String email, String password)
    {
        System.out.println("Email: "+email);
        System.out.println("Password: "+password);
    }

    static void login(String email, int otp)
    {
        System.out.println("Email: "+email);
        System.out.println("OTP: "+otp);
    }

    public static void main(String[] args)
    {
        login("suma@gmail.com","gmail@123");
        login("suma@gmail.com",7788);
    }
}