class Amazon
{
    static void login(String email, String password)
    {
        System.out.println("Email: "+email);
        System.out.println("Password: "+password);
    }

    static void login(String email, long phone)
    {
        System.out.println("Email: "+email);
        System.out.println("Phone Number: "+phone);
    }

    public static void main(String[] args)
    {
        login("suma@gmail.com","amazon@123");
        login("suma@gmail.com",9876543210L);
    }
}