class TripExec
{
    public static void main(String[] args)
    {
        Trip t = new Trip();

        t.addPlace("Goa");
        t.addPlace("Manali");
        t.addPlace("Ooty");
        t.addPlace("Mysore");
        t.addPlace("Kerala");
        t.addPlace("Jaipur");
        t.addPlace("Agra");
        t.addPlace("Delhi");
        t.addPlace("Mumbai");
        t.addPlace("Shimla");
        t.addPlace("Darjeeling");
        t.addPlace("Ladakh");
        t.addPlace("Coorg");

        t.getDetails();
    }
}