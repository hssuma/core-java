class Fan
{
	int fanId;
	String brand;
	int norOfBlades;
	float ratings;
	double cost;
	Capacitor capacitor;
	
	Void getDetails()
	{
		System.out.println("Fan class getDetails() is started ");
		System.out.println("The fan id is "+fanId);
		System.out.println("The fan brand is "+brand);
		System.out.println("The fan consists of "+norOfBlades +" number of blades");
		System.out.println("The fan ratings is "+ratings);
		System.out.println("The fan cost is ");
		capacitor.getDetails();
	}
	
}