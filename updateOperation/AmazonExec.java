class AmazonExec
{
    public static void main(String[] args)
    {
        Amazon a = new Amazon();

        a.addCategory("Electronics");
        a.addCategory("Mobiles");
        a.addCategory("Laptops");
        a.addCategory("Fashion");
        a.addCategory("Men Clothing");
        a.addCategory("Women Clothing");
        a.addCategory("Home Appliances");
        a.addCategory("Kitchen Items");
        a.addCategory("Furniture");
        a.addCategory("Books");
        a.addCategory("Toys");
        a.addCategory("Sports");
        a.addCategory("Beauty Products");
        a.addCategory("Health Care");
        a.addCategory("Groceries");
        a.addCategory("Automobile");
        a.addCategory("Pet Supplies");
        a.addCategory("Office Supplies");
        a.addCategory("Gaming");
        a.addCategory("Jewellery");
        a.addCategory("Footwear");
		a.updateCategory("Mobiles", "Smart phones");
        a.getCategories();
		
    }
}