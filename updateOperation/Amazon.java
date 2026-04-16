class Amazon
{
    String categoryNames[] = new String[21];
    int index;

    boolean addCategory(String name)
    {
        boolean isAdded = false;

        if(index < categoryNames.length)
        {
            if(name != null)
            {
                categoryNames[index++] = name;
                isAdded = true;
            }
            else
                System.out.println(name + " is not valid");
        }
        else
            System.out.println("Memory is full");

        return isAdded;
    }

    void getCategories()
    {
        for(String c : categoryNames)
            System.out.println(c);
    }
	
	boolean updateCategory(String existingCategoryName, String updateCategoryName)
	{
		boolean isupdated = false;
		for(int i = 0; i<categoryNames.length; i++)
		{
			if(categoryNames[i] == existingCategoryName)
			{
				categoryNames[i] = updateCategoryName;
				isupdated = true;
			}
		}
		return isupdated;
	}
}