class GasStove
{
    static String productName = "Gas Stove";
    static int price = 3500;
    static String brand = "Prestige";
    static int burnerCount = 3;
    static String material = "Toughened Glass";
    static String ignitionType = "Manual";
    static String stoveType = "LPG";
    static String countryOfOrigin = "India";
    static String colour = "Black";

    public static void main(String[] args)
    {
        String productName = "Glass Top Gas Stove";
        int price = 4200;
        String brand = "Butterfly";
        int burnerCount = 4;
        String material = "Stainless Steel";
        String ignitionType = "Auto Ignition";
        String stoveType = "LPG";
        String countryOfOrigin = "India";
        String colour = "Silver";

        System.out.println("Product name is " + productName);
        System.out.println("Product name (static) is " + GasStove.productName);

        System.out.println("Price is " + price);
        System.out.println("Price (static) is " + GasStove.price);

        System.out.println("Brand is " + brand);
        System.out.println("Brand (static) is " + GasStove.brand);

        System.out.println("Burner count is " + burnerCount);
        System.out.println("Burner count (static) is " + GasStove.burnerCount);

        System.out.println("Material is " + material);
        System.out.println("Material (static) is " + GasStove.material);

        System.out.println("Ignition type is " + ignitionType);
        System.out.println("Ignition type (static) is " + GasStove.ignitionType);

        System.out.println("Stove type is " + stoveType);
        System.out.println("Stove type (static) is " + GasStove.stoveType);

        System.out.println("Country of Origin is " + countryOfOrigin);
        System.out.println("Country of Origin (static) is " + GasStove.countryOfOrigin);

        System.out.println("Colour is " + colour);
        System.out.println("Colour (static) is " + GasStove.colour);
    }
}
