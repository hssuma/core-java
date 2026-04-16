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
				isadded = true;
			}
			else
				System.out.println(stateName+" is not valid");
		}
		else
			System.out.println("The memory is full already ");
		return isadded;
	}
	
	public void getStates()
	{
		for(String state : states)
			System.out.println(state);
	}
	
	public void updateStates(String existingName, String updatedStateName)
	{
		for(int i =0; i<states.length; i++)
		{
			if(states[i] == existingName)
				states[i] = updatedStateName;
		}
		if(existingName == null)
			System.out.println(existingName+" is not valid");
	}
}