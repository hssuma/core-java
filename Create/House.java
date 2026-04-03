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

    void getDetails()
    {
        for(String g : indoorGames)
            System.out.println(g);
    }
}