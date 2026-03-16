class GMITPortal
{
    static void login(String studentId, String password)
    {
        System.out.println("Student ID: "+studentId);
        System.out.println("Password: "+password);
    }

    static void login(String studentId, int otp)
    {
        System.out.println("Student ID: "+studentId);
        System.out.println("OTP: "+otp);
    }

    public static void main(String[] args)
    {
        login("GMIT1001","college@123");
        login("GMIT1001",4455);
    }
}