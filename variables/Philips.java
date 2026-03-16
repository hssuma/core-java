class Philips
{
    static String productName = "PHILIPS Standing Garment Steamer";
    static int price = 3000;
    static String brand = "Philips";
    static String itemModelNumber = "STE1040/20";
    static String countryOfOrigin = "China";
    static String productDimension = "42.7L x 35W x 34.7H Centimeters";
    static String heatTime = "40 Seconds";
    static String energyEfficiency = "High";
    static String colour = "Blue";

    public static void main(String[] args)
    {
        String productName = "PHILIPS Handheld Garment Steamer";
        int price = 2500;
        String brand = "Philips";
        String itemModelNumber = "GC360/30";
        String countryOfOrigin = "China";
        String productDimension = "30L x 12W x 18H Centimeters";
        String heatTime = "30 Seconds";
        String energyEfficiency = "Very High";
        String colour = "White";

        System.out.println("Product name is " + productName);
        System.out.println("Product name (static) is " + Philips.productName);

        System.out.println("Price is " + price);
        System.out.println("Price (static) is " + Philips.price);

        System.out.println("Brand is " + brand);
        System.out.println("Brand (static) is " + Philips.brand);

        System.out.println("Item Model Number is " + itemModelNumber);
        System.out.println("Item Model Number (static) is " + Philips.itemModelNumber);

        System.out.println("Country of Origin is " + countryOfOrigin);
        System.out.println("Country of Origin (static) is " + Philips.countryOfOrigin);

        System.out.println("Product Dimension is " + productDimension);
        System.out.println("Product Dimension (static) is " + Philips.productDimension);

        System.out.println("Heat time is " + heatTime);
        System.out.println("Heat time (static) is " + Philips.heatTime);

        System.out.println("Energy efficiency is " + energyEfficiency);
        System.out.println("Energy efficiency (static) is " + Philips.energyEfficiency);

        System.out.println("Colour is " + colour);
        System.out.println("Colour (static) is " + Philips.colour);
    }
}
