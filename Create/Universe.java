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

    void getDetails()
    {
        for(String g : galaxies)
            System.out.println(g);
    }
}