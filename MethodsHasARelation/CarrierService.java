class CarrierService
{
	static void pickUpPackage()
	{
		System.out.println("pickUpPackage method is executing");
		HubRouter.sortToZipCode();
	}

}