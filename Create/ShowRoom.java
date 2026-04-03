class ShowRoom
{
    String managerNames[] = new String[8];
    int index;

    boolean addManager(String name)
    {
        boolean isAdded = false;

        if(index < managerNames.length)
        {
            if(name != null)
            {
                managerNames[index++] = name;
                isAdded = true;
            }
            else
                System.out.println(name + " is not valid");
        }
        else
            System.out.println("Memory is full");

        return isAdded;
    }

    void getDetails()
    {
        for(String m : managerNames)
            System.out.println(m);
    }
}