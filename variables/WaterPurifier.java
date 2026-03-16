class WaterPurifier
{
    static String productName = "Kent Water Purifier";
    static int price = 15000;
    static String brand = "Kent";
    static String purificationType = "RO + UV";
    static String capacity = "8 Litres";
    static String colour = "White";
    static String countryOfOrigin = "India";
    static String warranty = "1 Year";
    static String storageTank = "ABS Plastic";

    public static void main(String[] args)
    {
        String productName = "Aquaguard Water Purifier";
        int price = 18000;
        String brand = "Aquaguard";
        String purificationType = "RO + UV + UF";
        String capacity = "7 Litres";
        String colour = "Black";
        String countryOfOrigin = "India";
        String warranty = "2 Years";
        String storageTank = "Food Grade Plastic";

        System.out.println("Product name (local) is " + productName);
        System.out.println("Product name (static) is " + WaterPurifier.productName);

        System.out.println("Price (local) is " + price);
        System.out.println("Price (static) is " + WaterPurifier.price);

        System.out.println("Brand (local) is " + brand);
        System.out.println("Brand (static) is " + WaterPurifier.brand);

        System.out.println("Purification Type (local) is " + purificationType);
        System.out.println("Purification Type (static) is " + WaterPurifier.purificationType);

        System.out.println("Capacity (local) is " + capacity);
        System.out.println("Capacity (static) is " + WaterPurifier.capacity);

        System.out.println("Colour (local) is " + colour);
        System.out.println("Colour (static) is " + WaterPurifier.colour);

        System.out.println("Country Of Origin (local) is " + countryOfOrigin);
        System.out.println("Country Of Origin (static) is " + WaterPurifier.countryOfOrigin);

        System.out.println("Warranty (local) is " + warranty);
        System.out.println("Warranty (static) is " + WaterPurifier.warranty);

        System.out.println("Storage Tank (local) is " + storageTank);
        System.out.println("Storage Tank (static) is " + Water
