class AppleiPad10thGenExecutor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = AppleiPad10thGen.getProductName();
        System.out.println("Product Name: " + name);

        String brand = AppleiPad10thGen.getBrand();
        System.out.println("Brand: " + brand);

        double price = AppleiPad10thGen.getPrice();
        System.out.println("Price: ₹" + price);

        String color = AppleiPad10thGen.getColor();
        System.out.println("Color: " + color);

        String display = AppleiPad10thGen.getDisplay();
        System.out.println("Display: " + display);

        String processor = AppleiPad10thGen.getProcessor();
        System.out.println("Processor: " + processor);

        String storage = AppleiPad10thGen.getStorage();
        System.out.println("Storage: " + storage);

        String camera = AppleiPad10thGen.getCamera();
        System.out.println("Camera: " + camera);

        String connectivity = AppleiPad10thGen.getConnectivity();
        System.out.println("Connectivity: " + connectivity);

        String battery = AppleiPad10thGen.getBatteryLife();
        System.out.println("Battery Life: " + battery);

        String os = AppleiPad10thGen.getOperatingSystem();
        System.out.println("Operating System: " + os);

        String warranty = AppleiPad10thGen.getWarranty();
        System.out.println("Warranty: " + warranty);

        System.out.println("Main ended");
    }
}