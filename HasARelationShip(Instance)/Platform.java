class Platform
{
	int platformId;
	String platformName;
	int capacity;
	boolean isroof;
	
	void getDetails()
	{
		System.out.println("The platformId is "+platformId);
		System.out.println("The platformName is "+platformName);
		System.out.println("The capacity of platform is "+capacity);
		System.out.println("The platform has roof "+isroof);
	}
}