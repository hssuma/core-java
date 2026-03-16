class LibrarySystem
{
    static void login(String id,String password)
    {
        System.out.println(id);
        System.out.println(password);
    }
    static void login(String id,int otp)
    {
        System.out.println(id);
        System.out.println(otp);
    }
    public static void main(String[] args)
    {
        login("LIB01","lib@123");
        login("LIB01",3030);
    }
}