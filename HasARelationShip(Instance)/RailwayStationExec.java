class RailwayStationExec
{
	public static void main(String args[])
	{
		RailwayStation r = new RailwayStation();
		r.stationId = 1;
		r.stationName = "";
		r.norOfPlatform = 6;
		r.location = "yashwantpura bengaluru";
		Platform p = new Platform();
		p.platformId = 1;
		p.platformName = "";
		p.capacity = 1500;
		p.isroof = true;
		
		
		RailwayStation r2 = new RailwayStation();
		r2.stationId = 2;
		r2.stationName = "";
		r2.norOfPlatform = 4;
		r2.location = "Majestic bengaluru";
		Platform p2 = new Platform();
		p2.platformId = 2;
		p2.platformName = "";
		p2.capacity = 1500;
		p2.isroof = true;
		
		RailwayStation r3 = new RailwayStation();
		r3.stationId = 3;
		r3.stationName = "";
		r3.norOfPlatform = 5;
		r3.location  = "Shivamogga";
		Platform p3 = new Platform();
		p3.platformId = 3;
		p3.platformName = "";
		p3.capacity = 1800;
		p3.isroof = true;
		
		RailwayStation r4 = new RailwayStation();
		r4.stationId = 4;
		r4.stationName = "";
		r4.norOfPlatform = 4;
		r4.location = "hassan";
		Platform p4 = new Platform();
		p4.platformId = 4;
		p4.platformName = "";
		p4.capacity = 1000;
		p4.isroof = true;
		
		RailwayStation r5 = new RailwayStation();
		r5.stationId =  5;
		r5.stationName = "";
		r5.norOfPlatform = 2;
		r5.location = "davanagere";
		Platform p5 = new Platform();
		p5.platformId = 5;
		p5.platformName = "";
		p5.capacity = 1200;
		p5.isroof = true;
		
		RailwayStation r6 = new RailwayStation();
		r6.stationId = 6;
		r6.stationName = "";
		r6.norOfPlatform = 1222;
		r6.location = "kaddur";
		Platform p6 = new Platform();
		p6.platformId = 6;
		p6.platformName = "";
		p6.capacity = 1500;
		p6.isroof = false;
		
		RailwayStation r7 = new RailwayStation();
		r7.stationId = 7;
		r7.stationName = "";
		r7.norOfPlatform = 2;
		r7.location = "Berrur";
		Platform p7 = new Platform();
		p7.platformId = 7;
		p7.platformName = "";
		p7.capacity = 1700;
		p7.isroof = true;
		
		RailwayStation r8 = new RailwayStation();
		r8.stationId = 8;
		r8.stationName = "";
		r8.norOfPlatform = 4;
		r8.location = "";
		Platform p8 = new Platform();
		p8.platformId = 8;
		p8.platformName = "";
		p8.capacity = 1400;
		p8.isroof = true;
		
		RailwayStation r9 = new RailwayStation();
		r9.stationId = 9;
		r9.stationName = "";
		r9.norOfPlatform = 9;
		r9.location = "";
		Platform p9 = new Platform();
		p9.platformId = 9;
		p9.platformName = "";
		p9.capacity = 1600;
		p9.isroof = true;
		
		RailwayStation r10 = new RailwayStation();
		r10.stationId = 10;
		r10.stationName = "";
		r10.norOfPlatform = 10;
		r10.location = "";
		Platform p10 = new Platform();
		p10.platformId = 10;
		p10.platformName = "";
		p10.capacity = 1400;
		p10.isroof = true;
		
		RailwayStation r11 = new RailwayStation();
		r11.stationId = 11;
		r11.stationName = "";
		r11.norOfPlatform  = 4;
		r11.location = "";
		Platform p11 =new Platform();
		p11.platformId = 11;
		p11.platformName = "";
		p11.capacity=1000;
		p11.isroof = false ;
		
		RailwayStation r12 = new RailwayStation();
		r12.stationId = 12;
		r12.stationName = "";
		r12.norOfPlatform =2;
		r12.location = "";
		Platform p12 = new Platform();
		p12.platformId = 12;
		p12.platformName="";
		p12.capacity = 1200;
		p12.isroof = true;
		
		
		
		r.getDetails();
		r2.getDetails();
		r3.getDetails();
		r4.getDetails();
		r5.getDetails();
		r6.getDetails();
		r7.getDetails();
		r8.getDetails();
		r9.getDetails();
		r10.getDetails();
		r11.getDetails();
		r12.getDetails();
		
		
	}
}