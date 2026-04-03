class Trip
{
    String places[] = new String[13];
    int index;

    boolean addPlace(String place)
    {
        boolean isAdded = false;

        if(index < places.length)
        {
            if(place != null)
            {
                places[index++] = place;
                isAdded = true;
            }
            else
                System.out.println(place + " is not valid");
        }
        else
            System.out.println("Memory is full");

        return isAdded;
    }

    void getDetails()
    {
        for(String p : places)
            System.out.println(p);
    }
}