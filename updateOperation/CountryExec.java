class CountryExec
{
	public static void main(String args[])
	{
		Country c = new Country();
		c.addStates("karnataka");
		c.addStates("Andra pradesh");
		c.addStates("Arubchal prdesh");
		c.addStates("ASsam");
		c.addStates("Bihar");
		c.addStates("Chatish ghad");
		c.addStates("Gujrat");
		c.addStates("Goa");
		c.addStates("Harayan");
		c.addStates("Himachal pradesh");
		c.addStates("jharkhand");
		c.addStates("Kerala");
		c.addStates("Madhya pradesh");
		c.addStates("Maharastra");
		c.addStates("Manipur");
		c.addStates("Meghalaya");
		c.addStates("Mizorm");
		c.addStates("Nagaland");
		c.addStates("Odisha");
		c.addStates("Punjab");
		c.addStates("Rajasthan");
		c.addStates("Sikkim");
		c.addStates("Tamil nadu");
		c.addStates("Telangana");
		c.addStates("Tripura");
		c.addStates("Uttar pradesh");
		c.addStates("Uttarkhand");
		c.addStates("West Bengal");
		System.out.println("\nBefore updating ");
		c.getStates();
		System.out.println("\nAfter updating");
		c.updateStates("Karanataka", "Karnataka");
		c.getStates();
	}
}