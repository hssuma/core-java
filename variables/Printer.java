class Printer
{
    static String productName = "All-in-One Printer";
    static int price = 12000;
    static String brand = "Epson";
    static String type = "Laser";
    static String connectivity = "WiFi";
    static String colour = "White";
    static String paperSize = "A4";
    static String countryOfOrigin = "Japan";

    public static void main(String[] args)
    {
        String productName = "Printer";
        int price = 9000;
        String brand = "Epson";
        String type = "Inkjet";
        String connectivity = "USB";
        String colour = "Black";
        String paperSize = "A4";
        String countryOfOrigin = "India";

        System.out.println("Product name is " + productName);
        System.out.println("Product name (static) is " + Printer.productName);

        System.out.println("Price is " + price);
        System.out.println("Price (static) is " + Printer.price);

        System.out.println("Brand is " + brand);
        System.out.println("Brand (static) is " + Printer.brand);

        System.out.println("Type is " + type);
        System.out.println("Type (static) is " + Printer.type);

        System.out.println("Connectivity is " + connectivity);
        System.out.println("Connectivity (static) is " + Printer.connectivity);

        System.out.println("Colour is " + colour);
        System.out.println("Colour (static) is " + Printer.colour);

        System.out.println("Paper size is " + paperSize);
        System.out.println("Paper size (static) is " + Printer.paperSize);

        System.out.println("Country of origin is " + countryOfOrigin);
        System.out.println("Country of origin (static) is " + Printer.countryOfOrigin);
    }
}
