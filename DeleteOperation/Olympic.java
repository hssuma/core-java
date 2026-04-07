class Olympic
{
	String sportNames[] = new String[11];
	int index;
	public boolean addSportNames(String sportName)
	{
		boolean isAdded = false;
		if(index < sportNames.length)
		{
			if(sportName != null && !sportName.isEmpty())
			{
				sportNames[index++] = sportName;
				isAdded = true;
			}
			else
				System.out.println(sportName+" is not valid");
		}
		else
			System.out.println("already memory is fulled");
		return isAdded;
	}
	
	public void getSportNames()
	{
		for(String sportName : sportNames)
			System.out.println(sportName);
	}
	
	public boolean updateSportName(String existingSportName, String updatedSportName)
	{
		boolean isUpdated = false;
		for(int i=0; i<sportNames.length; i++)
		{
			if(sportNames[i] == existingSportName)
			{
				sportNames[i] = updatedSportName;
				isUpdated = true;
			}
		}
		return isUpdated;
	}
	
	public void deleteSport(String sport)
	{
		for(int i=0; i<sportNames.length; i++)
		{
			if(sportNames[i] == sport)
				sportNames[i] = null;
		}
	}
}