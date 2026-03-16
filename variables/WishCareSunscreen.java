class WishCareSunscreen
{
    static String productName = "WishCare Sunscreen SPF 50";
    static int price = 449;
    static String brand = "WishCare";
    static String itemModelNumber = "WCS50";
    static String countryOfOrigin = "India";
    static String productDimensions = "6 x 4 x 15 cm; 60g";
    static String keyIngredients = "Niacinamide, Zinc PCA";
    static String skinType = "All skin types";
    static String protectionLevel = "SPF 50 PA+++";

    public static void main(String[] args)
    {
        String productName = "WishCare Niacinamide Oil Balance Fluid Sunscreen SPF 50 PA++++";
        int price = 379;
        String brand = "WishCare";
        String itemModelNumber = "NOBFS50";
        String countryOfOrigin = "India";
        String productDimensions = "5 x 3 x 14 cm; 50g";
        String keyIngredients = "Niacinamide, Zinc PCA, Ceramides, CICA";
        String skinType = "Oily, acne-prone, combination skin";
        String protectionLevel = "SPF 50 PA++++ broad spectrum";

        System.out.println("Product name is " + productName);
        System.out.println("Product name (static) is " + WishCareSunscreen.productName);

        System.out.println("Price is " + price);
        System.out.println("Price (static) is " + WishCareSunscreen.price);

        System.out.println("Brand is " + brand);
        System.out.println("Brand (static) is " + WishCareSunscreen.brand);

        System.out.println("Item Model Number is " + itemModelNumber);
        System.out.println("Item Model Number (static) is " + WishCareSunscreen.itemModelNumber);

        System.out.println("Country of Origin is " + countryOfOrigin);
        System.out.println("Country of Origin (static) is " + WishCareSunscreen.countryOfOrigin);

        System.out.println("Product Dimensions are " + productDimensions);
        System.out.println("Product Dimensions (static) are " + WishCareSunscreen.productDimensions);

        System.out.println("Key ingredients are " + keyIngredients);
        System.out.println("Key ingredients (static) are " + WishCareSunscreen.keyIngredients);

        System.out.println("Suitable for skin type: " + skinType);
        System.out.println("Suitable for skin type (static): " + WishCareSunscreen.skinType);

        System.out.println("Sun protection level: " + protectionLevel);
        System.out.println("Sun protection level (static): " + WishCareSunscreen.protectionLevel);
    }
}
