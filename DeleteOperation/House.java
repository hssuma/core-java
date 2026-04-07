class House
{
    String indoorGames[] = new String[6];
    int index;

    boolean addGame(String game)
    {
        boolean isAdded = false;

        if(index < indoorGames.length)
        {
            if(game != null)
            {
                indoorGames[index++] = game;
                isAdded = true;
            }
            else
                System.out.println(game + " is not valid");
        }
        else
            System.out.println("Memory is full");

        return isAdded;
    }

    void getGames()
    {
        for(String g : indoorGames)
            System.out.println(g);
    }
	boolean updateGame(String existingGame, String updateGameName)
	{
		boolean isupdated = false;
		for(int i =0; i<indoorGames.length; i++)
		{
			if(indoorGames[i] == existingGame)
			{
				indoorGames[i] = updateGameName;
				isupdated = true;
			}
		}
		return isupdated;
	}
	
	void deletegame(String game)
	{
		for(int i=0; i<indoorGames.length; i++)
		{
			if(indoorGames[i] == game)
				indoorGames[i] = null;
		}
	}
}