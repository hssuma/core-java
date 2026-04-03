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

    void getDetails()
    {
        for(String t : technologyNames)
            System.out.println(t);
    }
}