class UPS
{
    static String productName = "APC UPS";
    static int price = 17567;
    static String brand = "APC";
    static String capacity = "20 liters";
    static String voltage = "230 Volts";
    static String manufacturer = "Schneider Electric IT Business India Pvt. Ltd";
    static String productDimension = "11.4D x 30.1W x 38.2H Centimeters";
    static String model = "Lead Acid";
    static String countryOfOrigin = "India";
    static String colour = "Black";

    public static void main(String[] args)
    {
        String productName = "Microtek UPS";
        int price = 14999;
        String brand = "Microtek";
        String capacity = "18 liters";
        String voltage = "220 Volts";
        String manufacturer = "Microtek International Pvt. Ltd";
        String productDimension = "10D x 28W x 36H Centimeters";
        String model = "Tubular Battery";
        String countryOfOrigin = "India";
        String colour = "Grey";

        System.out.println("Product name is " + productName);
        System.out.println("Product name (static) is " + UPS.productName);

        System.out.println("Price is " + price);
        System.out.println("Price (static) is " + UPS.price);

        System.out.println("Brand is " + brand);
        System.out.println("Brand (static) is " + UPS.brand);

        System.out.println("Capacity is " + capacity);
        System.out.println("Capacity (static) is " + UPS.capacity);

        System.out.println("Voltage is " + voltage);
        System.out.println("Voltage (static) is " + UPS.voltage);

        System.out.println("Manufacturer is " + manufacturer);
        System.out.println("Manufacturer (static) is " + UPS.manufacturer);

        System.out.println("Product Dimension is " + productDimension);
        System.out.println("Product Dimension (static) is " + UPS.productDimension);

        System.out.println("Model is " + model);
        System.out.println("Model (static) is " + UPS.model);

        System.out.println("Country of Origin is " + countryOfOrigin);
        System.out.println("Country of Origin (static) is " + UPS.countryOfOrigin);

        System.out.println("Colour is " + colour);
        System.out.println("Colour (static) is " + UPS.colour);
    }
}
