class PoliceStation
{
	String caseNames[] = new String[16];
	int index;
	
	public void addCaseNames(String caseName)
	{
		if(caseName != null)
			caseNames[index++] = caseName;
		else
			System.out.println(caseName+" case name is not valid");
	}
	public void getNames()
	{
		for(String caseName : caseNames)
			System.out.println(caseName);
	}
}