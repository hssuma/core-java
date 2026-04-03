class Spotify
{
    String songNames[] = new String[10];
    int index;

    boolean addSong(String name)
    {
        boolean isAdded = false;

        if(index < songNames.length)
        {
            if(name != null)
            {
                songNames[index++] = name;
                isAdded = true;
            }
            else
                System.out.println(name + " is not valid");
        }
        else
            System.out.println("Memory is full");

        return isAdded;
    }

    void getDetails()
    {
        for(String s : songNames)
            System.out.println(s);
    }
}