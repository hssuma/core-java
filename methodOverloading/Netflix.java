class Netflix
{
    static void login(String username, String password)
    {
        System.out.println("Username: "+username);
        System.out.println("Password: "+password);
    }

    static void login(String username, int pin)
    {
        System.out.println("Username: "+username);
        System.out.println("PIN: "+pin);
    }

    public static void main(String[] args)
    {
        login("suma","netflix@123");
        login("suma",1234);
    }
}