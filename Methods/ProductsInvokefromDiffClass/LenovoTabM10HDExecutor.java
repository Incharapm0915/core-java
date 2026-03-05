class LenovoTabM10HDExecutor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = LenovoTabM10HD.getProductName();
        System.out.println("Product Name: " + name);

        String brand = LenovoTabM10HD.getBrand();
        System.out.println("Brand: " + brand);

        double price = LenovoTabM10HD.getPrice();
        System.out.println("Price: ₹" + price);

        String color = LenovoTabM10HD.getColor();
        System.out.println("Color: " + color);

        String display = LenovoTabM10HD.getDisplay();
        System.out.println("Display: " + display);

        String processor = LenovoTabM10HD.getProcessor();
        System.out.println("Processor: " + processor);

        String ram = LenovoTabM10HD.getRAM();
        System.out.println("RAM: " + ram);

        String storage = LenovoTabM10HD.getStorage();
        System.out.println("Storage: " + storage);

        String camera = LenovoTabM10HD.getCamera();
        System.out.println("Camera: " + camera);

        String battery = LenovoTabM10HD.getBattery();
        System.out.println("Battery: " + battery);

        String os = LenovoTabM10HD.getOperatingSystem();
        System.out.println("Operating System: " + os);

        String warranty = LenovoTabM10HD.getWarranty();
        System.out.println("Warranty: " + warranty);

        System.out.println("Main ended");
    }
}