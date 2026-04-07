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
	public void updateCaseName(String caseName, String updatedCaseName)
	{
		for(int i=0; i<caseNames.length; i++)
		{
			if(caseNames[i] == caseName)
				caseNames[i] = updatedCaseName;
		}
	}
	void deleteCase(String caseName)
	{
		for(int i=0; i<caseNames.length; i++)
		{
			if(caseNames[i] == caseName)
				caseNames[i] = null;
		}
	}
	
}