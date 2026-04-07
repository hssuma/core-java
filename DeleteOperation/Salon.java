class Salon
{
    String services[] = new String[7];
    int index;

    boolean addService(String service)
    {
        boolean isAdded = false;

        if(index < services.length)
        {
            if(service != null)
            {
                services[index++] = service;
                isAdded = true;
            }
            else
                System.out.println(service + " is not valid");
        }
        else
            System.out.println("Memory is full");

        return isAdded;
    }

    void getServices()
    {
        for(String s : services)
            System.out.println(s);
    }
	
	
	public boolean updateService(String existingService, String updatedServiceName)
	{
		boolean isUpdated = false;
		for(int i=0; i<services.length; i++)
		{
			if(services[i] == existingService)
			{
				services[i] = updatedServiceName;
				isUpdated = true;
			}
		}
		if(existingService == null)
			System.out.println(existingService +" is not available");
		return isUpdated;
	}
	void deleteService(String service)
	{
		for(int i=0; i<services.length; i++)
		{
			if(services[i] == service)
				services[i] = null;
		}
	}

}