class Hungama
{
    String showNames[] = new String[14];
    int index;

    boolean addShow(String show)
    {
        boolean isAdded = false;

        if(index < showNames.length)
        {
            if(show != null)
            {
                showNames[index++] = show;
                isAdded = true;
            }
            else
                System.out.println(show + " is not valid");
        }
        else
            System.out.println("Memory is full");

        return isAdded;
    }

    void getShowNames()
    {
        for(String s : showNames)
            System.out.println(s);
    }										
	boolean updateShow(String existingName, String updateName)
	{
		boolean isUpdated = false;
		for(int i=0 ; i<showNames.length; i++)
		{
			if(showNames[i] == existingName)
			{
				showNames[i] = updateName;
				isUpdated = true;
			}
			else
				System.out.println(existingName +" not found ");
		}
		return isUpdated;
	}
	
	boolean deleteShow(String showName)
	{
		boolean isdeleted = false; 
		for(int i =0 ; i<showNames.length; i++)
		{
			if(showNames[i]== showName)
			{
				showNames[i] = null;
				isdeleted = true;
			}
			else
				System.out.println(showName +" is not available in the list ");
		}
		return isdeleted;
	}
}