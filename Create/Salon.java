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

    void getDetails()
    {
        for(String s : services)
            System.out.println(s);
    }
}