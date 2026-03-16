class BluetoothSpeaker
{
    static String productName = "Portable Bluetooth Speaker";
    static int price = 5500;
    static String brand = "JBL";
    static String batteryBackup = "12 Hours";
    static String connectivity = "Bluetooth 5.0";
    static String waterResistance = "IPX7";
    static String colour = "Black";
    static String weight = "1.2 kg";
    static String countryOfOrigin = "India";

    public static void main(String[] args)
    {
        String productName = "Bluetooth Speaker";
        int price = 4000;
        String brand = "JBL";
        String batteryBackup = "10 Hours";
        String connectivity = "Bluetooth";
        String waterResistance = "IPX5";
        String colour = "Blue";
        String weight = "1 kg";
        String countryOfOrigin = "China";

        System.out.println("Product name is " + productName);
        System.out.println("Product name (static) is " + BluetoothSpeaker.productName);

        System.out.println("Price is " + price);
        System.out.println("Price (static) is " + BluetoothSpeaker.price);

        System.out.println("Brand is " + brand);
        System.out.println("Brand (static) is " + BluetoothSpeaker.brand);

        System.out.println("Battery backup is " + batteryBackup);
        System.out.println("Battery backup (static) is " + BluetoothSpeaker.batteryBackup);

        System.out.println("Connectivity is " + connectivity);
        System.out.println("Connectivity (static) is " + BluetoothSpeaker.connectivity);

        System.out.println("Water resistance is " + waterResistance);
        System.out.println("Water resistance (static) is " + BluetoothSpeaker.waterResistance);

        System.out.println("Colour is " + colour);
        System.out.println("Colour (static) is " + BluetoothSpeaker.colour);

        System.out.println("Weight is " + weight);
        System.out.println("Weight (static) is " + BluetoothSpeaker.weight);

        System.out.println("Country of origin is " + countryOfOrigin);
        System.out.println("Country of origin (static) is " + BluetoothSpeaker.countryOfOrigin);
    }
}
