class USB {
    public static String getBrand() {
        System.out.println("getBrand() invoked");
        return "SanDisk";
    }
    public static double getPrice() {
        System.out.println("getPrice() invoked");
        return 799;
    }
    public static String getColor() {
        System.out.println("getColor() invoked");
        return "Red";
    }
    public static void main(String[] args) {
        String brand = getBrand();
        double price = getPrice();
        String color = getColor();
        System.out.println(brand + " " + price + " " + color);
    }
}