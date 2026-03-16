class PreethiMixer
{
    static String productName = "Preethi Zodiac Mixer Grinder";
    static int price = 6500;
    static String brand = "Preethi";
    static int wattage = 750;
    static int jarCount = 5;
    static String motorType = "Universal Motor";
    static String material = "ABS Plastic";
    static String countryOfOrigin = "India";
    static String warranty = "5 Years Motor Warranty";
    static String colour = "White";

    public static void main(String[] args)
    {
        String productName = "Preethi Blue Leaf Mixer Grinder";
        int price = 5800;
        String brand = "Preethi";
        int wattage = 600;
        int jarCount = 3;
        String motorType = "Universal Motor";
        String material = "Polycarbonate";
        String countryOfOrigin = "India";
        String warranty = "2 Years Product Warranty";
        String colour = "Blue";

        System.out.println("Product name is " + productName);
        System.out.println("Product name (static) is " + PreethiMixer.productName);

        System.out.println("Price is " + price);
        System.out.println("Price (static) is " + PreethiMixer.price);

        System.out.println("Brand is " + brand);
        System.out.println("Brand (static) is " + PreethiMixer.brand);

        System.out.println("Wattage is " + wattage);
        System.out.println("Wattage (static) is " + PreethiMixer.wattage);

        System.out.println("Number of jars " + jarCount);
        System.out.println("Number of jars (static) " + PreethiMixer.jarCount);

        System.out.println("Motor type is " + motorType);
        System.out.println("Motor type (static) is " + PreethiMixer.motorType);

        System.out.println("Material is " + material);
        System.out.println("Material (static) is " + PreethiMixer.material);

        System.out.println("Country of Origin is " + countryOfOrigin);
        System.out.println("Country of Origin (static) is " + PreethiMixer.countryOfOrigin);

        System.out.println("Warranty is " + warranty);
        System.out.println("Warranty (static) is " + PreethiMixer.warranty);

        System.out.println("Colour is " + colour);
        System.out.println("Colour (static) is " + PreethiMixer.colour);
    }
}
