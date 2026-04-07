class SalonExec
{
    public static void main(String[] args)
    {
        Salon s = new Salon();

        s.addService("Hair cut");
        s.addService("Hair Spa");
        s.addService("Facial");
        s.addService("Manicure");
        s.addService("Pedicure");
        s.addService("Hair Coloring");
        s.addService("Shaving");
		s.updateService("Hair cut", "Classic hair cut");
        s.getServices();
		s.deleteService("Hair Spa");
		s.getServices();
    }
}