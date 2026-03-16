class HpLaptop
{
    static String productName = "HP Pavilion Laptop";
    static int price = 55000;
    static String brand = "HP";
    static String processor = "Intel Core i5";
    static String ram = "8 GB";
    static String storage = "512 GB SSD";
    static String operatingSystem = "Windows 11";
    static String countryOfOrigin = "India";
    static String colour = "Silver";

    public static void main(String[] args)
    {
        String productName = "HP Victus Gaming Laptop";
        int price = 72000;
        String brand = "HP";
        String processor = "Intel Core i7";
        String ram = "16 GB";
        String storage = "1 TB SSD";
        String operatingSystem = "Windows 11";
        String countryOfOrigin = "China";
        String colour = "Black";

        System.out.println("Product name is " + productName);
        System.out.println("Product name (static) is " + HpLaptop.productName);

        System.out.println("Price is " + price);
        System.out.println("Price (static) is " + HpLaptop.price);

        System.out.println("Brand is " + brand);
        System.out.println("Brand (static) is " + HpLaptop.brand);

        System.out.println("Processor is " + processor);
        System.out.println("Processor (static) is " + HpLaptop.processor);

        System.out.println("RAM is " + ram);
        System.out.println("RAM (static) is " + HpLaptop.ram);

        System.out.println("Storage is " + storage);
        System.out.println("Storage (static) is " + HpLaptop.storage);

        System.out.println("Operating System is " + operatingSystem);
        System.out.println("Operating System (static) is " + HpLaptop.operatingSystem);

        System.out.println("Country of Origin is " + countryOfOrigin);
        System.out.println("Country of Origin (static) is " + HpLaptop.countryOfOrigin);

        System.out.println("Colour is " + colour);
        System.out.println("Colour (static) is " + HpLaptop.colour);
    }
}
