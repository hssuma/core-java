class Ola
{
    static void login(String name,String password)
    {
        System.out.println(name);
        System.out.println(password);
    }
    static void login(String name,int otp)
    {
        System.out.println(name);
        System.out.println(otp);
    }
    public static void main(String[] args)
    {
        login("Suma","ola@123");
        login("Suma",4444);
    }
}