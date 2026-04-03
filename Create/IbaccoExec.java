class IbaccoExec
{
	public static void main(String args[])
	{
		Ibacco i = new Ibacco();
		boolean added = i.addIceCream("Black current");
		
		added = i.addIceCream("Butter scotch");
		added = i.addIceCream("Strawberry");
		added = i.addIceCream("DBC");
		added = i.addIceCream("black chacolate");
		added = i.addIceCream("Chaco chips");
		added = i.addIceCream("Mango");
		added = i.addIceCream("Blue berry");
		added = i.addIceCream("Black berry");
		added = i.addIceCream("Belligium chacolate");
		added = i.addIceCream("smoothie");
		i.getIcecream();
		
	}
}