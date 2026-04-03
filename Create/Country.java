class Country
{
	String states[] = new String[29];
	int index;
	public boolean addStates(String stateName)
	{
		boolean isadded = false;
		if(index < states.length)
		{
			if(stateName != null && !stateName.isEmpty())
			{
				states[index++] = stateName;
			}
			else
				System.out.println(stateName+" is not valid");
		}
		else
			System.out.println("The memory is full already ");		
		return isadded;
	}
	
	public void getDetails()
	{
		for(String state : states)
		{
			System.out.println(state);
		}
	}
}