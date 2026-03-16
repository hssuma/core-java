class Havells
{
    static String productName = "Havells Steam Iron";
    static int price = 3500;
    static String brand = "Havells";
    static String itemModelNumber = "STEAMX200";
    static String countryOfOrigin = "India";
    static String productDimension = "48L x 32W Centimeters";
    static String model = "SteamX";
    static String energyEfficiency = "Very High";
    static String colour = "Grey";

    public static void main(String[] args)
    {
        String productName = "Havells Blaze Dry Iron";
        int price = 3000;
        String brand = "Havells";
        String itemModelNumber = "GHGDICPK125";
        String countryOfOrigin = "India";
        String productDimension = "46L x 30W Centimeters";
        String model = "Blaze";
        String energyEfficiency = "High";
        String colour = "Black";

        System.out.println("Product name is " + productName);
        System.out.println("Product name (static) is " + Havells.productName);

        System.out.println("Price is " + price);
        System.out.println("Price (static) is " + Havells.price);

        System.out.println("Brand is " + brand);
        System.out.println("Brand (static) is " + Havells.brand);

        System.out.println("Item Model Number is " + itemModelNumber);
        System.out.println("Item Model Number (static) is " + Havells.itemModelNumber);

        System.out.println("Country of Origin is " + countryOfOrigin);
        System.out.println("Country of Origin (static) is " + Havells.countryOfOrigin);

        System.out.println("Product dimension is " + productDimension);
        System.out.println("Product dimension (static) is " + Havells.productDimension);

        System.out.println("Model is " + model);
        System.out.println("Model (static) is " + Havells.model);

        System.out.println("Energy efficiency is " + energyEfficiency);
        System.out.println("Energy efficiency (static) is " + Havells.energyEfficiency);

        System.out.println("Colour is " + colour);
        System.out.println("Colour (static) is " + Havells.colour);
    }
}
