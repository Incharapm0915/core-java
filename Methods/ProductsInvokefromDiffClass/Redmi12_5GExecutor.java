class Redmi12_5GExecutor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = Redmi12_5G.getProductName();
        System.out.println("Product Name: " + name);

        String brand = Redmi12_5G.getBrand();
        System.out.println("Brand: " + brand);

        double price = Redmi12_5G.getPrice();
        System.out.println("Price: ₹" + price);

        String color = Redmi12_5G.getColor();
        System.out.println("Color: " + color);

        String display = Redmi12_5G.getDisplay();
        System.out.println("Display: " + display);

        String processor = Redmi12_5G.getProcessor();
        System.out.println("Processor: " + processor);

        String ram = Redmi12_5G.getRAM();
        System.out.println("RAM: " + ram);

        String storage = Redmi12_5G.getStorage();
        System.out.println("Storage: " + storage);

        String camera = Redmi12_5G.getCamera();
        System.out.println("Camera: " + camera);

        String battery = Redmi12_5G.getBattery();
        System.out.println("Battery: " + battery);

        String os = Redmi12_5G.getOperatingSystem();
        System.out.println("Operating System: " + os);

        String warranty = Redmi12_5G.getWarranty();
        System.out.println("Warranty: " + warranty);

        System.out.println("Main ended");
    }
}