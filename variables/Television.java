class Television
{
    static String productName;
    static int price;
    static String brand;
    static String screenSize;
    static String resolution;

    public static void main(String[] args)
    {
        productName = "Smart TV";
        price = 32000;
        brand = "Sony";
        screenSize = "43 Inches";
        resolution = "4K";

        System.out.println(productName);
        System.out.println(price);
        System.out.println(brand);
        System.out.println(screenSize);
        System.out.println(resolution);
    }
}
class Television
{
    static String productName = "LED Smart TV";
    static int price = 45000;
    static String brand = "Sony";
    static String screenSize = "55 Inches";
    static String resolution = "4K UHD";
    static String operatingSystem = "Android TV";
    static String connectivity = "WiFi + Bluetooth";
    static String refreshRate = "120 Hz";
    static String speakerOutput = "20W";
    static String countryOfOrigin = "India";

    public static void main(String[] args)
    {
        String productName = "Smart TV";
        int price = 32000;
        String brand = "Sony";
        String screenSize = "43 Inches";
        String resolution = "4K";
        String operatingSystem = "Android";
        String connectivity = "WiFi";
        String refreshRate = "60 Hz";
        String speakerOutput = "16W";
        String countryOfOrigin = "China";

        System.out.println("Product name is " + productName);
        System.out.println("Product name (static) is " + Television.productName);

        System.out.println("Price is " + price);
        System.out.println("Price (static) is " + Television.price);

        System.out.println("Brand is " + brand);
        System.out.println("Brand (static) is " + Television.brand);

        System.out.println("Screen size is " + screenSize);
        System.out.println("Screen size (static) is " + Television.screenSize);

        System.out.println("Resolution is " + resolution);
        System.out.println("Resolution (static) is " + Television.resolution);

        System.out.println("Operating system is " + operatingSystem);
        System.out.println("Operating system (static) is " + Television.operatingSystem);

        System.out.println("Connectivity is " + connectivity);
        System.out.println("Connectivity (static) is " + Television.connectivity);

        System.out.println("Refresh rate is " + refreshRate);
        System.out.println("Refresh rate (static) is " + Television.refreshRate);

        System.out.println("Speaker output is " + speakerOutput);
        System.out.println("Speaker output (static) is " + Television.speakerOutput);

        System.out.println("Country of origin is " + countryOfOrigin);
        System.out.println("Country of origin (static) is " + Television.countryOfOrigin);
    }
}
