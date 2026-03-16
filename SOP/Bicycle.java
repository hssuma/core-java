class Bicycle
{
    static String productName = "Hero Mountain Bicycle";
    static int price = 9500;
    static String brand = "Hero";
    static String cycleType = "Mountain Bike";
    static String frameMaterial = "Steel";
    static int gearCount = 21;
    static String brakeType = "Disc Brake";
    static String tyreSize = "26 Inches";
    static String countryOfOrigin = "India";
    static String colour = "Red";

    public static void main(String[] args)
    {
        String productName = "Atlas Road Bicycle";
        int price = 8800;
        String brand = "Atlas";
        String cycleType = "Road Bike";
        String frameMaterial = "Aluminium";
        int gearCount = 18;
        String brakeType = "V-Brake";
        String tyreSize = "27 Inches";
        String countryOfOrigin = "India";
        String colour = "Blue";

        System.out.println("Product name (local) is " + productName);
        System.out.println("Product name (static) is " + Bicycle.productName);

        System.out.println("Price (local) is " + price);
        System.out.println("Price (static) is " + Bicycle.price);

        System.out.println("Brand (local) is " + brand);
        System.out.println("Brand (static) is " + Bicycle.brand);

        System.out.println("Cycle Type (local) is " + cycleType);
        System.out.println("Cycle Type (static) is " + Bicycle.cycleType);

        System.out.println("Frame Material (local) is " + frameMaterial);
        System.out.println("Frame Material (static) is " + Bicycle.frameMaterial);

        System.out.println("Gear Count (local) is " + gearCount);
        System.out.println("Gear Count (static) is " + Bicycle.gearCount);

        System.out.println("Brake Type (local) is " + brakeType);
        System.out.println("Brake Type (static) is " + Bicycle.brakeType);

        System.out.println("Tyre Size (local) is " + tyreSize);
        System.out.println("Tyre Size (static) is " + Bicycle.tyreSize);

        System.out.println("Country of Origin (local) is " + countryOfOrigin);
        System.out.println("Country of Origin (static) is " + Bicycle.countryOfOrigin);

        System.out.println("Colour (local) is " + colour);
        System.out.println("Colour (static) is " + Bicycle.colour);
    }
}
