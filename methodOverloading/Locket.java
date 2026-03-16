class Locket
{
    static void login(String phone,String password)
    {
        System.out.println(phone);
        System.out.println(password);
    }
    static void login(String phone,int otp)
    {
        System.out.println(phone);
        System.out.println(otp);
    }
    public static void main(String[] args)
    {
        login("9876543210","lock@123");
        login("9876543210",1000);
    }
}