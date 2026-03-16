class Skinlumina
{
	static String services[] = {"Haircut", "pedicure", "Facewash", "DTan", "Hairtransplantation", "Scalp health"};
	
	
	static void services()
	{
		System.out.println("the services are available in skin lumina are ");
		for (String service : services)
		{
			System.out.println(service);
		}
	}


	public static void main(String ref[])
	{
		services();
	}
}

