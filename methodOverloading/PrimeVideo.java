class PrimeVideo
{
    static void login(String user,String password)
    {
        System.out.println(user);
        System.out.println(password);
    }
    static void login(String user,int pin)
    {
        System.out.println(user);
        System.out.println(pin);
    }
    public static void main(String[] args)
    {
        login("suma","prime@123");
        login("suma",2345);
    }
}