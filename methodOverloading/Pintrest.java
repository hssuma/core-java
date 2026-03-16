class Pintrest
{
    static void login(String username,String password)
    {
        System.out.println(username);
        System.out.println(password);
    }
    static void login(String username,int otp)
    {
        System.out.println(username);
        System.out.println(otp);
    }
    public static void main(String[] args)
    {
        login("suma","Suma@123");
        login("suma",1060);
    }
}