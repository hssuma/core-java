class ATMApp
{
    static void login(String card,String pin)
    {
        System.out.println(card);
        System.out.println(pin);
    }

    static void login(String card,int otp)
    {
        System.out.println(card);
        System.out.println(otp);
    }

    public static void main(String[] args)
    {
        login("AXIS123456","4567$");
        login("AXIS123456",9999);
    }
}