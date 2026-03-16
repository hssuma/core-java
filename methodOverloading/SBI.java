class SBI
{
    static void login(String userId, String password)
    {
        System.out.println("User ID: "+userId);
        System.out.println("Password: "+password);
    }

    static void login(String userId, int otp)
    {
        System.out.println("User ID: "+userId);
        System.out.println("OTP: "+otp);
    }

    public static void main(String[] args)
    {
        login("SBI1100","Suma@123");
        login("SBI1100",1122);
    }
}