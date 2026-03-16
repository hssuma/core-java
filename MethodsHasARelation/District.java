class District
{
	static void run()
	{
		System.out.println("run method is executing");
		Tax.taxing();
		Tax.measure();
		Tax.collect();
		Tax.revenue();
		Tax.budget();
	}
}