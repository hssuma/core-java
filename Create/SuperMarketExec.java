class SuperMarketExec
{
	public static void main (String args[])
	{
		SuperMarket s = new SuperMarket();
		s.addProducts("Rice");
		s.addProducts("Wheat flour");
		s.addProducts("Pulses");
		s.addProducts("Cooking oil");
		s.addProducts("Sugar");
		s.addProducts("Spices");
		s.addProducts("Dal");
		s.addProducts("Milk");
		s.addProducts("Ghee");
		s.addProducts("IceCreams");
		s.getDetails();
	}
}