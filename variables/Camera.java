class Camera
{
    static String productName = "DSLR Camera";
    static int price = 52000;
    static String brand = "Canon";
    static String resolution = "32 MP";
    static String lensType = "Wide Angle";
    static String sensorType = "CMOS";
    static String videoResolution = "4K";
    static String connectivity = "WiFi + Bluetooth";
    static String colour = "Black";

    public static void main(String[] args)
    {
        String productName = "Digital Camera";
        int price = 45000;
        String brand = "Canon";
        String resolution = "24 MP";
        String lensType = "Standard Lens";
        String sensorType = "APS-C";
        String videoResolution = "Full HD";
        String connectivity = "USB";
        String colour = "Black";

        System.out.println("Product name is " + productName);
        System.out.println("Product name (static) is " + Camera.productName);

        System.out.println("Price is " + price);
        System.out.println("Price (static) is " + Camera.price);

        System.out.println("Brand is " + brand);
        System.out.println("Brand (static) is " + Camera.brand);

        System.out.println("Resolution is " + resolution);
        System.out.println("Resolution (static) is " + Camera.resolution);

        System.out.println("Lens type is " + lensType);
        System.out.println("Lens type (static) is " + Camera.lensType);

        System.out.println("Sensor type is " + sensorType);
        System.out.println("Sensor type (static) is " + Camera.sensorType);

        System.out.println("Video resolution is " + videoResolution);
        System.out.println("Video resolution (static) is " + Camera.videoResolution);

        System.out.println("Connectivity is " + connectivity);
        System.out.println("Connectivity (static) is " + Camera.connectivity);

        System.out.println("Colour is " + colour);
        System.out.println("Colour (static) is " + Camera.colour);
    }
}
