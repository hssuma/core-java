class Refrigerator
{
    static String productName = "Double Door Refrigerator";
    static int price = 32000;
    static String brand = "LG";
    static String capacity = "340 Litres";
    static String energyRating = "4 Star";
    static String coolingTechnology = "Smart Inverter Compressor";
    static String defrostType = "Frost Free";
    static String colour = "Silver";
    static String doorType = "Double Door";
    static String countryOfOrigin = "India";

    public static void main(String[] args)
    {
        String productName = "Refrigerator";
        int price = 24000;
        String brand = "LG";
        String capacity = "260 Litres";
        String energyRating = "3 Star";
        String coolingTechnology = "Direct Cool";
        String defrostType = "Manual";
        String colour = "Grey";
        String doorType = "Single Door";
        String countryOfOrigin = "India";

        System.out.println("Product name is " + productName);
        System.out.println("Product name (static) is " + Refrigerator.productName);

        System.out.println("Price is " + price);
        System.out.println("Price (static) is " + Refrigerator.price);

        System.out.println("Brand is " + brand);
        System.out.println("Brand (static) is " + Refrigerator.brand);

        System.out.println("Capacity is " + capacity);
        System.out.println("Capacity (static) is " + Refrigerator.capacity);

        System.out.println("Energy rating is " + energyRating);
        System.out.println("Energy rating (static) is " + Refrigerator.energyRating);

        System.out.println("Cooling technology is " + coolingTechnology);
        System.out.println("Cooling technology (static) is " + Refrigerator.coolingTechnology);

        System.out.println("Defrost type is " + defrostType);
        System.out.println("Defrost type (static) is " + Refrigerator.defrostType);

        System.out.println("Colour is " + colour);
        System.out.println("Colour (static) is " + Refrigerator.colour);

        System.out.println("Door type is " + doorType);
        System.out.println("Door type (static) is " + Refrigerator.doorType);

        System.out.println("Country of origin is " + countryOfOrigin);
        System.out.println("Country of origin (static) is " + Refrigerator.countryOfOrigin);
    }
}
