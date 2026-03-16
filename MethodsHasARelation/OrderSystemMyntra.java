class OrderSystemMyntra
{
	
	static void takeOrder()
	{
		System.out.println("takeOrder method is executing from the class OrderSystem");
		System.out.println("take Order from user");
		System.out.println("takeOrder method is finished execution");
		InventoryCheck.validate();
	}
}