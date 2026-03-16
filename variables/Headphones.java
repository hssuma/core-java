class Headphones
{
    static String productName = "Wireless Headphones";
    static int price = 3500;
    static String brand = "Boat";
    static String type = "Over Ear";
    static String connectivity = "Bluetooth";
    static String batteryBackup = "30 Hours";
    static String colour = "Black";
    static String noiseCancellation = "Yes";
    static String chargingPort = "Type-C";
    static String countryOfOrigin = "India";

    public static void main(String[] args)
    {
        String productName = "Headphones";
        int price = 2500;
        String brand = "Boat";
        String type = "Over Ear";
        String connectivity = "Bluetooth";
        String batteryBackup = "20 Hours";
        String colour = "Blue";
        String noiseCancellation = "No";
        String chargingPort = "Micro USB";
        String countryOfOrigin = "China";

        System.out.println("Product name is " + productName);
        System.out.println("Product name (static) is " + Headphones.productName);

        System.out.println("Price is " + price);
        System.out.println("Price (static) is " + Headphones.price);

        System.out.println("Brand is " + brand);
        System.out.println("Brand (static) is " + Headphones.brand);

        System.out.println("Type is " + type);
        System.out.println("Type (static) is " + Headphones.type);

        System.out.println("Connectivity is " + connectivity);
        System.out.println("Connectivity (static) is " + Headphones.connectivity);

        System.out.println("Battery backup is " + batteryBackup);
        System.out.println("Battery backup (static) is " + Headphones.batteryBackup);

        System.out.println("Colour is " + colour);
        System.out.println("Colour (static) is " + Headphones.colour);

        System.out.println("Noise cancellation is " + noiseCancellation);
        System.out.println("Noise cancellation (static) is " + Headphones.noiseCancellation);

        System.out.println("Charging port is " + chargingPort);
        System.out.println("Charging port (static) is " + Headphones.chargingPort);

        System.out.println("Country of origin is " + countryOfOrigin);
        System.out.println("Country of origin (static) is " + Headphones.countryOfOrigin);
    }
}
