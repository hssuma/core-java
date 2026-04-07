class SuperMarketExec
{
	public static void main (String args[])
	{
		SuperMarket s = new SuperMarket();
		s.addProducts("Wheat flour");
		s.addProducts("Pulses");
		s.addProducts("Cooking oil");
		s.addProducts("Sugar");
		s.addProducts("Spices");
		s.addProducts("Milk");
		s.addProducts("Ghee");
		s.addProducts("IceCreams");
		s.getProducts();
		s.updateProduct("IceCreams", "Mango Ice Cream");
		s.getProducts();
		s.deleteProduct("Wheat flour");
		s.getProducts();
	}
}