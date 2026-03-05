class AsusTUFF15Executor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = AsusTUFF15.getProductName();
        System.out.println("Product Name: " + name);

        String brand = AsusTUFF15.getBrand();
        System.out.println("Brand: " + brand);

        double price = AsusTUFF15.getPrice();
        System.out.println("Price: ₹" + price);

        String color = AsusTUFF15.getColor();
        System.out.println("Color: " + color);

        String processor = AsusTUFF15.getProcessor();
        System.out.println("Processor: " + processor);

        String ram = AsusTUFF15.getRAM();
        System.out.println("RAM: " + ram);

        String storage = AsusTUFF15.getStorage();
        System.out.println("Storage: " + storage);

        String graphics = AsusTUFF15.getGraphics();
        System.out.println("Graphics: " + graphics);

        String display = AsusTUFF15.getDisplay();
        System.out.println("Display: " + display);

        String keyboard = AsusTUFF15.getKeyboard();
        System.out.println("Keyboard: " + keyboard);

        String os = AsusTUFF15.getOperatingSystem();
        System.out.println("Operating System: " + os);

        String warranty = AsusTUFF15.getWarranty();
        System.out.println("Warranty: " + warranty);

        System.out.println("Main ended");
    }
}