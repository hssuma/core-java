class SamsungGalaxy
{
    static String productName = "Samsung Galaxy S25 Ultra 5G";
    static int price = 142000;
    static String brand = "Samsung";
    static String memoryStorageCapacity = "256 GB";
    static String itemModelNumber = "SM-S938B";
    static String countryOfOrigin = "India";
    static String productDimension = "0.82 x 7.76 x 16.28 cm; 218 g";
    static String model = "Samsung";
    static String energyEfficiency = "High";
    static String colour = "Titanium Silverblue";

    public static void main(String[] args)
    {
        String productName = "Samsung Galaxy S24 Ultra 5G";
        int price = 129999;
        String brand = "Samsung";
        String memoryStorageCapacity = "512 GB";
        String itemModelNumber = "SM-S928B";
        String countryOfOrigin = "India";
        String productDimension = "0.86 x 7.9 x 16.2 cm; 233 g";
        String model = "Samsung Galaxy";
        String energyEfficiency = "Very High";
        String colour = "Titanium Black";

        System.out.println("Product name is " + productName);
        System.out.println("Product name (static) is " + SamsungGalaxy.productName);

        System.out.println("Price is " + price);
        System.out.println("Price (static) is " + SamsungGalaxy.price);

        System.out.println("Brand is " + brand);
        System.out.println("Brand (static) is " + SamsungGalaxy.brand);

        System.out.println("Memory Storage Capacity is " + memoryStorageCapacity);
        System.out.println("Memory Storage Capacity (static) is " + SamsungGalaxy.memoryStorageCapacity);

        System.out.println("Item Model Number is " + itemModelNumber);
        System.out.println("Item Model Number (static) is " + SamsungGalaxy.itemModelNumber);

        System.out.println("Country of Origin is " + countryOfOrigin);
        System.out.println("Country of Origin (static) is " + SamsungGalaxy.countryOfOrigin);

        System.out.println("Product Dimension is " + productDimension);
        System.out.println("Product Dimension (static) is " + SamsungGalaxy.productDimension);

        System.out.println("Model is " + model);
        System.out.println("Model (static) is " + SamsungGalaxy.model);

        System.out.println("Energy Efficiency is " + energyEfficiency);
        System.out.println("Energy Efficiency (static) is " + SamsungGalaxy.energyEfficiency);

        System.out.println("Colour is " + colour);
        System.out.println("Colour (static) is " + SamsungGalaxy.colour);
    }
}
