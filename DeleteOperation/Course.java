class Course
{
    String technologyNames[] = new String[15];
    int index;

    boolean addTechnology(String tech)
    {
        boolean isAdded = false;

        if(index < technologyNames.length)
        {
            if(tech != null)
            {
                technologyNames[index++] = tech;
                isAdded = true;
            }
            else
                System.out.println(tech + " is not valid");
        }
        else
            System.out.println("Memory is full");

        return isAdded;
    }

    void getCourses()
    {
        for(String t : technologyNames)
            System.out.println(t);
    }
	
	void updateCourses(String existingName, String updatedName)
	{
		for (int i=0; i<technologyNames.length; i++)
		{
			if(technologyNames[i]== existingName)
				technologyNames[i]= updatedName;
		}
		if(updatedName == null)
			System.out.println(updatedName +" is not valid ");
	}
	void deletetechnology(String techName)
	{
		for(int i=0; i<technologyNames.length; i++)
		{
			if(technologyNames[i] == techName)
				technologyNames[i] = null;
		}
	}
}