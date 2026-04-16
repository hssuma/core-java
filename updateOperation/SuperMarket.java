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
	
	void getProducts()
	{
		for(String productName : productNames)
			System.out.println(productName);
	}
	boolean updateProduct(String existingProduct, String updatedProduct)
	{
		boolean isUpdated = false;
		for(int i =0; i<productNames.length; i++)
		{
			if(productNames[i] == existingProduct)
			{
				productNames[i] = updatedProduct;
				isUpdated = true;
			}
		}
		return isUpdated;
	}
}