class DispatchVehicle
{
	static void outOfDelivery()
	{
		System.out.println("outOfDelivery method is executing");
		DeliveryAgent.reachDoorStep();
	}
}