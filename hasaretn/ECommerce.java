class ECommerce
{
	Product products[] = new Product[10];
	int index;
	public boolean addProducts(Product product)
	{
		boolean isAdded = false;
		
		products[index++] = product;
		
		return isAdded;
	}
	
	void getProducts()
	{
		for(Product product : products)
		{
			System.out.println("The product id is "+product.productId);
			System.out.println("The product name is "+product.productName);
			System.out.println("The cost of the product is "+product.cost);
			System.out.println();
		}
	}
}