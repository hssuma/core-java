class DisneyHotstar
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
        login("suma","hot@123");
        login("suma",3456);
    }
}