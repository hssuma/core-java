class Microwave
{
    static String productName = "Microwave Oven";
    static int price = 12000;
    static String brand = "Panasonic";
    static String capacity = "20 litres";
    static String energyConsumption = "800 Watts";
    static String manufacturer = "Panasonic";
    static String productDimension = "44.3 x 34 x 25.8 Centimeters";
    static String model = "NN-ST26JMFDG";
    static String countryOfOrigin = "Thailand";
    static String colour = "Silver";

    public static void main(String[] args)
    {
        String productName = "Convection Microwave Oven";
        int price = 15500;
        String brand = "Samsung";
        String capacity = "28 litres";
        String energyConsumption = "900 Watts";
        String manufacturer = "Samsung";
        String productDimension = "51.7 x 31 x 47.6 Centimeters";
        String model = "MC28H5013AK";
        String countryOfOrigin = "India";
        String colour = "Black";

        System.out.println("Product name is " + productName);
        System.out.println("Product name (static) is " + Microwave.productName);

        System.out.println("Price is " + price);
        System.out.println("Price (static) is " + Microwave.price);

        System.out.println("Brand is " + brand);
        System.out.println("Brand (static) is " + Microwave.brand);

        System.out.println("Capacity is " + capacity);
        System.out.println("Capacity (static) is " + Microwave.capacity);

        System.out.println("Energy Consumption is " + energyConsumption);
        System.out.println("Energy Consumption (static) is " + Microwave.energyConsumption);

        System.out.println("Manufacturer is " + manufacturer);
        System.out.println("Manufacturer (static) is " + Microwave.manufacturer);

        System.out.println("Product Dimension is " + productDimension);
        System.out.println("Product Dimension (static) is " + Microwave.productDimension);

        System.out.println("Model is " + model);
        System.out.println("Model (static) is " + Microwave.model);

        System.out.println("Country of Origin is " + countryOfOrigin);
        System.out.println("Country of Origin (static) is " + Microwave.countryOfOrigin);

        System.out.println("Colour is " + colour);
        System.out.println("Colour (static) is " + Microwave.colour);
    }
}
