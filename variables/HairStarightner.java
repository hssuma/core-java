class HairStarightner
{
    static String productName = "Straightner";
    static int price = 5469;
    static String weight = "900g";
    static String brand = "IKONIC";
    static String feature = "Straightening";
    static String productDimension = "33 x 12 x 12 Centimeters";
    static String manufacturer = "IKONIC, SSIZ International Pvt Ltd, SSIZ International";
    static String shape = "BTP";
    static String colour = "Black";

    public static void main(String[] args)
    {
        String productName = "Hair Straightener Pro";
        int price = 4899;
        String weight = "850g";
        String brand = "Philips";
        String feature = "Straightening & Styling";
        String productDimension = "30 x 10 x 10 Centimeters";
        String manufacturer = "Philips India Ltd";
        String shape = "Flat";
        String colour = "Purple";

        System.out.println("Product name is " + productName);
        System.out.println("Product name (static) is " + HairStarightner.productName);

        System.out.println("Price is " + price);
        System.out.println("Price (static) is " + HairStarightner.price);

        System.out.println("Weight is " + weight);
        System.out.println("Weight (static) is " + HairStarightner.weight);

        System.out.println("Brand is " + brand);
        System.out.println("Brand (static) is " + HairStarightner.brand);

        System.out.println("Feature is " + feature);
        System.out.println("Feature (static) is " + HairStarightner.feature);

        System.out.println("Product Dimension is " + productDimension);
        System.out.println("Product Dimension (static) is " + HairStarightner.productDimension);

        System.out.println("Manufacturer is " + manufacturer);
        System.out.println("Manufacturer (static) is " + HairStarightner.manufacturer);

        System.out.println("Shape is " + shape);
        System.out.println("Shape (static) is " + HairStarightner.shape);

        System.out.println("Colour is " + colour);
        System.out.println("Colour (static) is " + HairStarightner.colour);
    }
}
