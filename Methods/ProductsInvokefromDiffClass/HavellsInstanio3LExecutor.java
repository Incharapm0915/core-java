class HavellsInstanio3LExecutor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = HavellsInstanio3L.getProductName();
        System.out.println("Product Name: " + name);

        String brand = HavellsInstanio3L.getBrand();
        System.out.println("Brand: " + brand);

        double price = HavellsInstanio3L.getPrice();
        System.out.println("Price: ₹" + price);

        String color = HavellsInstanio3L.getColor();
        System.out.println("Color: " + color);

        String capacity = HavellsInstanio3L.getCapacity();
        System.out.println("Capacity: " + capacity);

        String power = HavellsInstanio3L.getPower();
        System.out.println("Power: " + power);

        String element = HavellsInstanio3L.getHeatingElement();
        System.out.println("Heating Element: " + element);

        String pressure = HavellsInstanio3L.getPressureRating();
        System.out.println("Pressure Rating: " + pressure);

        String safety = HavellsInstanio3L.getSafetyFeatures();
        System.out.println("Safety Features: " + safety);

        String material = HavellsInstanio3L.getBodyMaterial();
        System.out.println("Body Material: " + material);

        String indicator = HavellsInstanio3L.getIndicator();
        System.out.println("Indicator: " + indicator);

        String warranty = HavellsInstanio3L.getWarranty();
        System.out.println("Warranty: " + warranty);

        System.out.println("Main ended");
    }
}