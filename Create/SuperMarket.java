class SuperMarket
{
	String productNames[] = new String[8];
	int index;
	
	boolean addProducts(String productName)
	{
		boolean isAdded = false;
		if(index<productNames.length)
		{
			if(productName != null)
				productNames[index++] = productName;
			else
				System.out.println(productName + " is not valid");
		}
		else
			System.out.println("memory is full");
		return isAdded;
	}
	
	void getDetails()
	{
		for(String productName : productNames)
			System.out.println(productName);
	}
}