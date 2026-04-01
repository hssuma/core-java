class Capacitor
{
	int capacitorId;
	String brand;
	double cost ;
	float ratings;
	String material;
	
	void getDetails()
	{
		System.out.println("The getDetails() from capacitor class is started execution");
		System.out.println("The capacitorId is "+capacitorId);
		System.out.println("The capacitor brand is "+brand);
		System.out.println("The cost of the capacitor is "+cost);
		System.out.println("The ratings of the capacitor is "+ratings);
		System.out.println("The material of the capacitor is "+material);
	
	}
}