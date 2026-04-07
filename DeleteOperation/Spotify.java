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

    void getSongs()
    {
        for(String s : songNames)
            System.out.println(s);
    }
	void updateSong(String existingName, String updatedSong)
	{
		for(int i =0; i<songNames.length; i++)
		{
			if(songNames[i] == existingName)
			{
				songNames[i] = updatedSong;
			}
		}
	}
	void deleteSong(String song)
	{
		for(int i=0; i<songNames.length; i++)
		{
			if(songNames[i] == song)
				songNames[i] = null;
		}
	}
}