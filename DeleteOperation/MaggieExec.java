class MaggiExec
{
    public static void main(String[] args)
    {
        Maggie m = new Maggie();

        m.addIngredient("Noodles");
        m.addIngredient("Water");
        m.addIngredient("Masala");
        m.addIngredient("Salt");
        m.addIngredient("Oil");
        m.addIngredient("Vegetables");
        m.addIngredient("Carrot");
        m.addIngredient("Beans");
        m.addIngredient("Onion");
        m.addIngredient("Capsicum");
        m.addIngredient("Peas");
        m.addIngredient("Corn");
		m.getIngredients();
		System.out.println("After updating ingredients ");
		m.updateIngerident("Noodles", "Atta Noodles");
        m.getIngredients();
		m.deleteIngerident("Atta Noodles");
		m.getIngredients();
    }
}