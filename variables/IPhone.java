class IPhone
{
    static String productName = "iPhone 17 Pro";
    static int price = 134900;
    static String brand = "Apple";
    static String memoryStorageCapacity = "256 GB";
    static String itemModelNumber = "MG8H4HN/A";
    static String countryOfOrigin = "India";
    static String productDimension = "0.87 x 7.19 x 15 cm; 206 g";
    static String model = "Apple";
    static String energyEfficiency = "High";
    static String colour = "Orange";

    public static void main(String[] args)
    {
        String productName = "iPhone 16 Pro";
        int price = 129900;
        String brand = "Apple";
        String memoryStorageCapacity = "512 GB";
        String itemModelNumber = "MN0X3HN/A";
        String countryOfOrigin = "China";
        String productDimension = "0.8 x 7.15 x 14.9 cm; 199 g";
        String model = "Apple iPhone";
        String energyEfficiency = "Very High";
        String colour = "Space Black";

        System.out.println("Product name is " + productName);
        System.out.println("Product name (static) is " + IPhone.productName);

        System.out.println("Price is " + price);
        System.out.println("Price (static) is " + IPhone.price);

        System.out.println("Brand is " + brand);
        System.out.println("Brand (static) is " + IPhone.brand);

        System.out.println("Memory Storage Capacity is " + memoryStorageCapacity);
        System.out.println("Memory Storage Capacity (static) is " + IPhone.memoryStorageCapacity);

        System.out.println("Item Model Number is " + itemModelNumber);
        System.out.println("Item Model Number (static) is " + IPhone.itemModelNumber);

        System.out.println("Country of Origin is " + countryOfOrigin);
        System.out.println("Country of Origin (static) is " + IPhone.countryOfOrigin);

        System.out.println("Product Dimension is " + productDimension);
        System.out.println("Product Dimension (static) is " + IPhone.productDimension);

        System.out.println("Model is " + model);
        System.out.println("Model (static) is " + IPhone.model);

        System.out.println("Energy Efficiency is " + energyEfficiency);
        System.out.println("Energy Efficiency (static) is " + IPhone.energyEfficiency);

        System.out.println("Colour is " + colour);
        System.out.println("Colour (static) is " + IPhone.colour);
    }
}
