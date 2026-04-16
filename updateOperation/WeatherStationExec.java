class WeatherStationExec
{
    public static void main(String[] args)
    {
        WeatherStation w = new WeatherStation();

        w.addTemp("30C");
        w.addTemp("32C");
        w.addTemp("28C");
        w.addTemp("27C");
        w.addTemp("35C");
        w.addTemp("33C");
        w.addTemp("29C");
        w.addTemp("31C");
        w.addTemp("26C");
        w.addTemp("34C");
        w.addTemp("36C");
        w.addTemp("25C");
        w.addTemp("24C");
        w.addTemp("23C");
        w.addTemp("22C");
        w.addTemp("21C");
        w.addTemp("20C");
		w.updateTemp("30C","32C");
        w.getTemprature();
    }
}