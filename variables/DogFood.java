class DogFood
{
    static String productName = "Pedigree Adult Dog Food";
    static int price = 2100;
    static String brand = "Pedigree";
    static String flavour = "Chicken & Vegetables";
    static String dogAgeGroup = "Adult";
    static String netWeight = "10 Kg";
    static String proteinSource = "Chicken";
    static String countryOfOrigin = "India";
    static String packType = "Dry Food";

    public static void main(String[] args)
    {
        String productName = "Drools Adult Dog Food";
        int price = 1850;
        String brand = "Drools";
        String flavour = "Chicken";
        String dogAgeGroup = "Adult";
        String netWeight = "8 Kg";
        String proteinSource = "Chicken";
        String countryOfOrigin = "India";
        String packType = "Dry Food";

        System.out.println("Product name is " + productName);
        System.out.println("Product name (static) is " + DogFood.productName);

        System.out.println("Price is " + price);
        System.out.println("Price (static) is " + DogFood.price);

        System.out.println("Brand is " + brand);
        System.out.println("Brand (static) is " + DogFood.brand);

        System.out.println("Flavour is " + flavour);
        System.out.println("Flavour (static) is " + DogFood.flavour);

        System.out.println("Dog Age Group is " + dogAgeGroup);
        System.out.println("Dog Age Group (static) is " + DogFood.dogAgeGroup);

        System.out.println("Net Weight is " + netWeight);
        System.out.println("Net Weight (static) is " + DogFood.netWeight);

        System.out.println("Protein Source is " + proteinSource);
        System.out.println("Protein Source (static) is " + DogFood.proteinSource);

        System.out.println("Country of Origin is " + countryOfOrigin);
        System.out.println("Country of Origin (static) is " + DogFood.countryOfOrigin);

        System.out.println("Pack Type is " + packType);
        System.out.println("Pack Type (static) is " + DogFood.packType);
    }
}
