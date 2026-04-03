class Military
{
    String weaponNames[] = new String[21];
    int index;

    boolean addWeapon(String weapon)
    {
        boolean isAdded = false;

        if(index < weaponNames.length)
        {
            if(weapon != null)
            {
                weaponNames[index++] = weapon;
                isAdded = true;
            }
            else
                System.out.println(weapon + " is not valid");
        }
        else
            System.out.println("Memory is full");

        return isAdded;
    }

    void getDetails()
    {
        for(String w : weaponNames)
            System.out.println(w);
    }
}