class SalonExec
{
    public static void main(String[] args)
    {
        Salon s = new Salon();

        s.addService("Hair Cut");
        s.addService("Hair Spa");
        s.addService("Facial");
        s.addService("Manicure");
        s.addService("Pedicure");
        s.addService("Hair Coloring");
        s.addService("Shaving");

        s.getDetails();
    }
}