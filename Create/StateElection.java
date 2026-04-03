class StateElection 
{
    String partyNames[] = new String[7];
    int index;

    public void addParty(String name)
	{
        if (name != null)
            partyNames[index++] = name;
        else
            System.out.println(name + " is not valid");
    }

    public void getNames()
	{
        for (String n : partyNames)
            System.out.println(n);
    }
}