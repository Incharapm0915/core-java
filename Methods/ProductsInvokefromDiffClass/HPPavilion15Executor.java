class HPPavilion15Executor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = HPPavilion15.getProductName();
        System.out.println("Product Name: " + name);

        String brand = HPPavilion15.getBrand();
        System.out.println("Brand: " + brand);

        double price = HPPavilion15.getPrice();
        System.out.println("Price: ₹" + price);

        String color = HPPavilion15.getColor();
        System.out.println("Color: " + color);

        String processor = HPPavilion15.getProcessor();
        System.out.println("Processor: " + processor);

        String ram = HPPavilion15.getRAM();
        System.out.println("RAM: " + ram);

        String storage = HPPavilion15.getStorage();
        System.out.println("Storage: " + storage);

        String display = HPPavilion15.getDisplay();
        System.out.println("Display: " + display);

        String graphics = HPPavilion15.getGraphics();
        System.out.println("Graphics: " + graphics);

        String os = HPPavilion15.getOperatingSystem();
        System.out.println("Operating System: " + os);

        String weight = HPPavilion15.getWeight();
        System.out.println("Weight: " + weight);

        String warranty = HPPavilion15.getWarranty();
        System.out.println("Warranty: " + warranty);

        System.out.println("Main ended");
    }
}