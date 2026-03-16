class BloodBank
{
    static String emailId = "hfhtft";
    static int donorId = 204;
    static String firstName = "Suma";
    static String lastName = "H S";
    static long phoneNumber = 7826856956L;
    static int zipCode = 577223;
    static String dateOfBirth = "01/02/2005";
    static String password = "dhttygj";
    static String repeatPassword = "dhttygj";

    public static void main(String[] args)
    {
        String emailId = "donor@gmail.com";
        int donorId = 305;
        String firstName = "Anita";
        String lastName = "R";
        long phoneNumber = 9876543210L;
        int zipCode = 560068;
        String dateOfBirth = "12/08/2002";
        String password = "abcd1234";
        String repeatPassword = "abcd1234";

        System.out.println("Email id (local) is " + emailId);
        System.out.println("Email id (static) is " + BloodBank.emailId);

        System.out.println("Donor id (local) is " + donorId);
        System.out.println("Donor id (static) is " + BloodBank.donorId);

        System.out.println("First name (local) is " + firstName);
        System.out.println("First name (static) is " + BloodBank.firstName);

        System.out.println("Last name (local) is " + lastName);
        System.out.println("Last name (static) is " + BloodBank.lastName);

        System.out.println("Phone number (local) is " + phoneNumber);
        System.out.println("Phone number (static) is " + BloodBank.phoneNumber);

        System.out.println("Zip code (local) is " + zipCode);
        System.out.println("Zip code (static) is " + BloodBank.zipCode);

        System.out.println("Date of birth (local) is " + dateOfBirth);
        System.out.println("Date of birth (static) is " + BloodBank.dateOfBirth);

        System.out.println("Password (local) is " + password);
        System.out.println("Password (static) is " + BloodBank.password);

        System.out.println("Repeat password (local) is " + repeatPassword);
        System.out.println("Repeat password (static) is " + BloodBank.repeatPassword);
    }
}
