class Hungama
{
    String showNames[] = new String[14];
    int index;

    boolean addShow(String show)
    {
        boolean isAdded = false;

        if(index < showNames.length)
        {
            if(show != null)
            {
                showNames[index++] = show;
                isAdded = true;
            }
            else
                System.out.println(show + " is not valid");
        }
        else
            System.out.println("Memory is full");

        return isAdded;
    }

    void getDetails()
    {
        for(String s : showNames)
            System.out.println(s);
    }
}