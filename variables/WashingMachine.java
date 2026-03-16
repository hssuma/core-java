class WashingMachine
{
    static String productName = "LG Front Load Washing Machine";
    static int price = 32000;
    static String brand = "LG";
    static int capacity = 7;
    static String washType = "Front Load";
    static String inverterMotor = "Yes";
    static String energyRating = "5 Star";
    static String countryOfOrigin = "India";
    static String colour = "White";
    static String warranty = "10 Years Motor Warranty";

    public static void main(String[] args)
    {
        String productName = "Samsung Top Load Washing Machine";
        int price = 28000;
        String brand = "Samsung";
        int capacity = 8;
        String washType = "Top Load";
        String inverterMotor = "No";
        String energyRating = "4 Star";
        String countryOfOrigin = "India";
        String colour = "Silver";
        String warranty = "5 Years Warranty";

        System.out.println("Product name is " + productName);
        System.out.println("Product name (static) is " + WashingMachine.productName);

        System.out.println("Price is " + price);
        System.out.println("Price (static) is " + WashingMachine.price);

        System.out.println("Brand is " + brand);
        System.out.println("Brand (static) is " + WashingMachine.brand);

        System.out.println("Capacity is " + capacity + " Kg");
        System.out.println("Capacity (static) is " + WashingMachine.capacity + " Kg");

        System.out.println("Wash Type is " + washType);
        System.out.println("Wash Type (static) is " + WashingMachine.washType);

        System.out.println("Inverter Motor is " + inverterMotor);
        System.out.println("Inverter Motor (static) is " + WashingMachine.inverterMotor);

        System.out.println("Energy Rating is " + energyRating);
        System.out.println("Energy Rating (static) is " + WashingMachine.energyRating);

        System.out.println("Country of Origin is " + countryOfOrigin);
        System.out.println("Country of Origin (static) is " + WashingMachine.countryOfOrigin);

        System.out.println("Colour is " + colour);
        System.out.println("Colour (static) is " + WashingMachine.colour);

        System.out.println("Warranty is " + warranty);
        System.out.println("Warranty (static) is " + WashingMachine.warranty);
    }
}
