class ExamPortal
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
        login("EX01","exam@123");
        login("EX01",4040);
    }
}