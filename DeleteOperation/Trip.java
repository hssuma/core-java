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

    void getPlaces()
    {
        for(String p : places)
            System.out.println(p);
    }
	void updatePlace(String existingName, String updatedPlaceName)
	{
		for(int i=0; i<places.length; i++)
		{
			if(places[i] == existingName)
				places[i] = updatedPlaceName;
		}
	}
	void deletePlace(String place)
	{
		for(int i=0; i<places.length; i++)
		{
			if(places[i] == place)
				places[i] = null;
		}
	}
}