class MedicalShop
{
    String medicineNames[] = new String[10];
    int index;

    boolean addMedicine(String name)
    {
        boolean isAdded = false;

        if(index < medicineNames.length)
        {
            if(name != null)
            {
                medicineNames[index++] = name;
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
        for(String m : medicineNames)
            System.out.println(m);
    }
}