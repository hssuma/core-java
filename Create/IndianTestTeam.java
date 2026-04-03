class IndianTestTeam
{
    String playerNames[] = new String[11];
    int index;

    boolean addPlayer(String player)
    {
        boolean isAdded = false;

        if(index < playerNames.length)
        {
            if(player != null)
            {
                playerNames[index++] = player;
                isAdded = true;
            }
            else
                System.out.println(player + " is not valid");
        }
        else
            System.out.println("Memory is full");

        return isAdded;
    }

    void getDetails()
    {
        for(String p : playerNames)
            System.out.println(p);
    }
}