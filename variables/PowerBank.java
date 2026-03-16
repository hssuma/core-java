class PowerBank
{
    static String productName = "Fast Charge Power Bank";
    static int price = 1800;
    static String brand = "Mi";
    static String capacity = "20000 mAh";
    static String chargingType = "Fast Charging";
    static String inputPort = "Type-C";
    static String outputPort = "USB-A + Type-C";
    static String colour = "Black";
    static String weight = "450 g";

    public static void main(String[] args)
    {
        String productName = "Power Bank";
        int price = 1200;
        String brand = "Mi";
        String capacity = "10000 mAh";
        String chargingType = "Normal Charging";
        String inputPort = "Micro USB";
        String outputPort = "USB-A";
        String colour = "Silver";
        String weight = "300 g";

        System.out.println("Product name is " + productName);
        System.out.println("Product name (static) is " + PowerBank.productName);

        System.out.println("Price is " + price);
        System.out.println("Price (static) is " + PowerBank.price);

        System.out.println("Brand is " + brand);
        System.out.println("Brand (static) is " + PowerBank.brand);

        System.out.println("Capacity is " + capacity);
        System.out.println("Capacity (static) is " + PowerBank.capacity);

        System.out.println("Charging type is " + chargingType);
        System.out.println("Charging type (static) is " + PowerBank.chargingType);

        System.out.println("Input port is " + inputPort);
        System.out.println("Input port (static) is " + PowerBank.inputPort);

        System.out.println("Output port is " + outputPort);
        System.out.println("Output port (static) is " + PowerBank.outputPort);

        System.out.println("Colour is " + colour);
        System.out.println("Colour (static) is " + PowerBank.colour);

        System.out.println("Weight is " + weight);
        System.out.println("Weight (static) is " + PowerBank.weight);
    }
}
