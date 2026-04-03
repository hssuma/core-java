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
			}
			else
				System.out.println(sportName+" is not valid");
		}
		else
			System.out.println("already memory is fulled");
		return isAdded;
	}
	
	public void getDetails()
	{
		for(String sportName : sportNames)
			System.out.println(sportName);
	}
}