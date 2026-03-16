class Laptop {
    public static String getBrand() {
        System.out.println("getBrand() invoked");
        return "Dell";
    }
    public static double getPrice() {
        System.out.println("getPrice() invoked");
        return 65999;
    }
    public static String getColor() {
        System.out.println("getColor() invoked");
        return "Silver";
    }
    public static void main(String[] args) {
        String brand = getBrand();
        double price = getPrice();
        String color = getColor();
        System.out.println(brand + " " + price + " " + color);
    }
}