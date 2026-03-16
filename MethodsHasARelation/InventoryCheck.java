class InventoryCheck
{
	static void validate()
	{
		System.out.println("Validate method is executing from the class InventoryCheck");
		System.out.println("validating the order");
		System.out.println("validate method is finished execution");
		WareHouse.fetchFromAisle();
	}
}