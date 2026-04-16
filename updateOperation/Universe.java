class Universe
{
    String galaxies[] = new String[11];
    int index;

    boolean addGalaxy(String galaxy)
    {
        boolean isAdded = false;

        if(index < galaxies.length)
        {
            if(galaxy != null)
            {
                galaxies[index++] = galaxy;
                isAdded = true;
            }
            else
                System.out.println(galaxy + " is not valid");
        }
        else
            System.out.println("Memory is full");
        return isAdded;
    }

    void getGalaxies()
    {
        for(String g : galaxies)
            System.out.println(g);
    }
	
	boolean updateGalaxy(String existingName, String updateGalaxyName)
	{
		boolean isupdated = false;
		for(int i =0; i<galaxies.length; i++)
		{
			if(galaxies[i] == existingName)
			{
				galaxies[i] = updateGalaxyName;
				return isupdated = true;
			}
		}
		return isupdated;
	}
}