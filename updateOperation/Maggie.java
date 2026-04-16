class Maggie
{
    String ingredients[] = new String[12];
    int index;

    boolean addIngredient(String ing)
    {
        boolean isAdded = false;

        if(index < ingredients.length)
        {
            if(ing != null)
            {
                ingredients[index++] = ing;
                isAdded = true;
            }
            else
                System.out.println(ing + " is not valid");
        }
        else
            System.out.println("Memory is full");

        return isAdded;
    }

    void getIngredients()
    {
        for(String i : ingredients)
            System.out.println(i);
    }
	void updateIngerident(String oldName, String updatedName)
	{
		for(int i =0; i<ingredients.length; i++)
		{
			if(ingredients[i] == oldName)
				ingredients[i] = updatedName;
		}
	}
}