class WeatherStation
{
    String temperatureReadings[] = new String[17];
    int index;

    boolean addTemp(String temp)
    {
        boolean isAdded = false;

        if(index < temperatureReadings.length)
        {
            if(temp != null)
            {
                temperatureReadings[index++] = temp;
                isAdded = true;
            }
            else
                System.out.println(temp + " is not valid");
        }
        else
            System.out.println("Memory is full");

        return isAdded;
    }

    void getDetails()
    {
        for(String t : temperatureReadings)
            System.out.println(t);
    }
}