class OfficeChair
{
    static String productName = "Ergonomic Office Chair";
    static int price = 8500;
    static String brand = "Green Soul";
    static String material = "Mesh & Metal";
    static String adjustableHeight = "Yes";
    static String armType = "Adjustable";
    static String maxLoad = "120 Kg";
    static String countryOfOrigin = "India";
    static String colour = "Black";

    public static void main(String[] args)
    {
        String productName = "Executive Office Chair";
        int price = 10500;
        String brand = "Featherlite";
        String material = "Leatherette & Metal";
        String adjustableHeight = "Yes";
        String armType = "Fixed";
        String maxLoad = "150 Kg";
        String countryOfOrigin = "India";
        String colour = "Brown";

        System.out.println("Product name is " + productName);
        System.out.println("Product name (static) is " + OfficeChair.productName);

        System.out.println("Price is " + price);
        System.out.println("Price (static) is " + OfficeChair.price);

        System.out.println("Brand is " + brand);
        System.out.println("Brand (static) is " + OfficeChair.brand);

        System.out.println("Material is " + material);
        System.out.println("Material (static) is " + OfficeChair.material);

        System.out.println("Adjustable Height is " + adjustableHeight);
        System.out.println("Adjustable Height (static) is " + OfficeChair.adjustableHeight);

        System.out.println("Arm Type is " + armType);
        System.out.println("Arm Type (static) is " + OfficeChair.armType);

        System.out.println("Max Load is " + maxLoad);
        System.out.println("Max Load (static) is " + OfficeChair.maxLoad);

        System.out.println("Country of Origin is " + countryOfOrigin);
        System.out.println("Country of Origin (static) is " + OfficeChair.countryOfOrigin);

        System.out.println("Colour is " + colour);
        System.out.println("Colour (static) is " + OfficeChair.colour);
    }
}
