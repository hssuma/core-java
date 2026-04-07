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

    void getWeaponNames()
    {
        for(String w : weaponNames)
            System.out.println(w);
    }
	void updateWeapon(String exixstingName, String updateWeaponName)
	{
		for(int i=0; i<weaponNames.length; i++)
		{
			if(weaponNames[i] == exixstingName)
				weaponNames[i] = updateWeaponName;
		}
	}
	void deleteWeapon(String weapon)
	{
		for(int i=0; i<weaponNames.length; i++)
		{
			if(weaponNames[i] == weapon)
				weaponNames[i] = null;
		}
	}
}