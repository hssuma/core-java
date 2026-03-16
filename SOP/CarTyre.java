class CarTyre
{
    static String productName = "MRF Radial Car Tyre";
    static int price = 5200;
    static String brand = "MRF";
    static String tyreSize = "195/65 R15";
    static String vehicleType = "Car";
    static String tyreType = "Tubeless";
    static String material = "Rubber";
    static String loadIndex = "91";
    static String speedRating = "H";
    static String countryOfOrigin = "India";

    public static void main(String[] args)
    {
        String productName = "Apollo Amazer Car Tyre";
        int price = 4800;
        String brand = "Apollo";
        String tyreSize = "185/65 R15";
        String vehicleType = "Car";
        String tyreType = "Tubeless";
        String material = "Synthetic Rubber";
        String loadIndex = "88";
        String speedRating = "T";
        String countryOfOrigin = "India";

        System.out.println("Product name (local) is " + productName);
        System.out.println("Product name (static) is " + CarTyre.productName);

        System.out.println("Price (local) is " + price);
        System.out.println("Price (static) is " + CarTyre.price);

        System.out.println("Brand (local) is " + brand);
        System.out.println("Brand (static) is " + CarTyre.brand);

        System.out.println("Tyre Size (local) is " + tyreSize);
        System.out.println("Tyre Size (static) is " + CarTyre.tyreSize);

        System.out.println("Vehicle Type (local) is " + vehicleType);
        System.out.println("Vehicle Type (static) is " + CarTyre.vehicleType);

        System.out.println("Tyre Type (local) is " + tyreType);
        System.out.println("Tyre Type (static) is " + CarTyre.tyreType);

        System.out.println("Material (local) is " + material);
        System.out.println("Material (static) is " + CarTyre.material);

        System.out.println("Load Index (local) is " + loadIndex);
        System.out.println("Load Index (static) is " + CarTyre.loadIndex);

        System.out.println("Speed Rating (local) is " + speedRating);
        System.out.println("Speed Rating (static) is " + CarTyre.speedRating);

        System.out.println("Country of Origin (local) is " + countryOfOrigin);
        System.out.println("Country of Origin (static) is " + CarTyre.countryOfOrigin);
    }
}
