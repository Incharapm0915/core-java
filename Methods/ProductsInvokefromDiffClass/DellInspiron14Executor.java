class DellInspiron14Executor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = DellInspiron14.getProductName();
        System.out.println("Product Name: " + name);

        String brand = DellInspiron14.getBrand();
        System.out.println("Brand: " + brand);

        double price = DellInspiron14.getPrice();
        System.out.println("Price: ₹" + price);

        String color = DellInspiron14.getColor();
        System.out.println("Color: " + color);

        String processor = DellInspiron14.getProcessor();
        System.out.println("Processor: " + processor);

        String ram = DellInspiron14.getRAM();
        System.out.println("RAM: " + ram);

        String storage = DellInspiron14.getStorage();
        System.out.println("Storage: " + storage);

        String display = DellInspiron14.getDisplay();
        System.out.println("Display: " + display);

        String graphics = DellInspiron14.getGraphics();
        System.out.println("Graphics: " + graphics);

        String os = DellInspiron14.getOperatingSystem();
        System.out.println("Operating System: " + os);

        String weight = DellInspiron14.getWeight();
        System.out.println("Weight: " + weight);

        String warranty = DellInspiron14.getWarranty();
        System.out.println("Warranty: " + warranty);

        System.out.println("Main ended");
    }
}