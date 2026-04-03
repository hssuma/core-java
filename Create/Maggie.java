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

    void getDetails()
    {
        for(String i : ingredients)
            System.out.println(i);
    }
}