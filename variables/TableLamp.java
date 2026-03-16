class TableLamp
{
    static String productName = "Decorative Table Lamp";
    static int price = 1800;
    static String brand = "Homesake";
    static String material = "Wood & Fabric";
    static String powerSource = "Electric";
    static String bulbType = "LED";
    static String height = "40 cm";
    static String countryOfOrigin = "India";
    static String colour = "Beige";

    public static void main(String[] args)
    {
        String productName = "Modern Study Table Lamp";
        int price = 2200;
        String brand = "Philips";
        String material = "Metal & Plastic";
        String powerSource = "Electric";
        String bulbType = "LED";
        String height = "45 cm";
        String countryOfOrigin = "India";
        String colour = "White";

        System.out.println("Product name is " + productName);
        System.out.println("Product name (static) is " + TableLamp.productName);

        System.out.println("Price is " + price);
        System.out.println("Price (static) is " + TableLamp.price);

        System.out.println("Brand is " + brand);
        System.out.println("Brand (static) is " + TableLamp.brand);

        System.out.println("Material is " + material);
        System.out.println("Material (static) is " + TableLamp.material);

        System.out.println("Power Source is " + powerSource);
        System.out.println("Power Source (static) is " + TableLamp.powerSource);

        System.out.println("Bulb Type is " + bulbType);
        System.out.println("Bulb Type (static) is " + TableLamp.bulbType);

        System.out.println("Height is " + height);
        System.out.println("Height (static) is " + TableLamp.height);

        System.out.println("Country of Origin is " + countryOfOrigin);
        System.out.println("Country of Origin (static) is " + TableLamp.countryOfOrigin);

        System.out.println("Colour is " + colour);
        System.out.println("Colour (static) is " + TableLamp.colour);
    }
}
