class VacuumCleaner {
    public static String getBrand() {
        System.out.println("getBrand() invoked");
        return "Dyson";
    }
    public static double getPrice() {
        System.out.println("getPrice() invoked");
        return 54999;
    }
    public static String getColor() {
        System.out.println("getColor() invoked");
        return "Purple";
    }
    public static void main(String[] args) 
	{
        String brand = getBrand();
        double price = getPrice();
        String color = getColor();
        System.out.println(brand + " " + price + " " + color);
    }
}