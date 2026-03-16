class MobilePhone
{
    static String productName = "Smartphone";
    static int price = 22000;
    static String brand = "Samsung";
    static String model = "Galaxy M34";
    static String ram = "8 GB";
    static String storage = "256 GB";
    static String batteryCapacity = "6000 mAh";
    static String camera = "50 MP";
    static String operatingSystem = "Android";

    public static void main(String[] args)
    {
        String productName = "Smartphone";
        int price = 18000;
        String brand = "Samsung";
        String model = "Galaxy M14";
        String ram = "6 GB";
        String storage = "128 GB";
        String batteryCapacity = "5000 mAh";
        String camera = "48 MP";
        String operatingSystem = "Android";

        System.out.println("Product name is " + productName);
        System.out.println("Product name (static) is " + MobilePhone.productName);

        System.out.println("Price is " + price);
        System.out.println("Price (static) is " + MobilePhone.price);

        System.out.println("Brand is " + brand);
        System.out.println("Brand (static) is " + MobilePhone.brand);

        System.out.println("Model is " + model);
        System.out.println("Model (static) is " + MobilePhone.model);

        System.out.println("RAM is " + ram);
        System.out.println("RAM (static) is " + MobilePhone.ram);

        System.out.println("Storage is " + storage);
        System.out.println("Storage (static) is " + MobilePhone.storage);

        System.out.println("Battery capacity is " + batteryCapacity);
        System.out.println("Battery capacity (static) is " + MobilePhone.batteryCapacity);

        System.out.println("Camera is " + camera);
        System.out.println("Camera (static) is " + MobilePhone.camera);

        System.out.println("Operating system is " + operatingSystem);
        System.out.println("Operating system (static) is " + MobilePhone.operatingSystem);
    }
}
