class Backpack
{
    static String productName = "Skybags School Backpack";
    static int price = 1600;
    static String brand = "Skybags";
    static int capacity = 30;
    static String material = "Polyester";
    static String compartments = "3";
    static String waterResistant = "Yes";
    static String countryOfOrigin = "India";
    static String colour = "Blue";

    public static void main(String[] args)
    {
        String productName = "American Tourister Travel Backpack";
        int price = 2200;
        String brand = "American Tourister";
        int capacity = 35;
        String material = "Nylon";
        String compartments = "4";
        String waterResistant = "Yes";
        String countryOfOrigin = "India";
        String colour = "Black";

        System.out.println("Product name (local) is " + productName);
        System.out.println("Product name (static) is " + Backpack.productName);

        System.out.println("Price (local) is " + price);
        System.out.println("Price (static) is " + Backpack.price);

        System.out.println("Brand (local) is " + brand);
        System.out.println("Brand (static) is " + Backpack.brand);

        System.out.println("Capacity (local) is " + capacity);
        System.out.println("Capacity (static) is " + Backpack.capacity);

        System.out.println("Material (local) is " + material);
        System.out.println("Material (static) is " + Backpack.material);

        System.out.println("Compartments (local) is " + compartments);
        System.out.println("Compartments (static) is " + Backpack.compartments);

        System.out.println("Water Resistant (local) is " + waterResistant);
        System.out.println("Water Resistant (static) is " + Backpack.waterResistant);

        System.out.println("Country of Origin (local) is " + countryOfOrigin);
        System.out.println("Country of Origin (static) is " + Backpack.countryOfOrigin);

        System.out.println("Colour (local) is " + colour);
        System.out.println("Colour (static) is " + Backpack.colour);
    }
}
