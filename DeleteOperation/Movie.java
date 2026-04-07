class Movie
{
    String casts[] = new String[9];
    int index;

    boolean addCast(String cast)
    {
        boolean isAdded = false;

        if(index < casts.length)
        {
            if(cast != null)
            {
                casts[index++] = cast;
                isAdded = true;
            }
            else
                System.out.println(cast + " is not valid");
        }
        else
            System.out.println("Memory is full");

        return isAdded;
    }

    void getCast()
    {
        for(String c : casts)
            System.out.println(c);
    }
	void upadteCast(String existingCastName, String upadteCastName)
	{
		for(int i=0; i<casts.length; i++)
		{
			if(casts[i]== existingCastName)
				casts[i] = upadteCastName;
		}
	}
	void deleteCast(String castName)
	{
		for(int i=0; i<casts.length; i++)
		{
			if(casts[i] == castName)
				casts[i] = null;
		}
	}
}