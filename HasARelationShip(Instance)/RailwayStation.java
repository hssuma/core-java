class RailwayStation
{
	int stationId; 
	String stationName;
	int norOfPlatform;
	String location;
	
	Platform platform;
	
	void getDetails()
	{
		System.out.println("The station id is "+stationId);
		System.out.println("The station name is "+stationName);
		System.out.println("The station have total "+norOfPlatform+" number of platform");
		System.out.println("The station is located in "+location);
		platform.getDetails();
	}
	
}