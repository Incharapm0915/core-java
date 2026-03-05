class SamsungWashingMachine7KgExecutor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = SamsungWashingMachine7Kg.getProductName();
        System.out.println("Product Name: " + name);

        String brand = SamsungWashingMachine7Kg.getBrand();
        System.out.println("Brand: " + brand);

        double price = SamsungWashingMachine7Kg.getPrice();
        System.out.println("Price: ₹" + price);

        String color = SamsungWashingMachine7Kg.getColor();
        System.out.println("Color: " + color);

        String capacity = SamsungWashingMachine7Kg.getCapacity();
        System.out.println("Capacity: " + capacity);

        String load = SamsungWashingMachine7Kg.getLoadingType();
        System.out.println("Loading Type: " + load);

        String rating = SamsungWashingMachine7Kg.getEnergyRating();
        System.out.println("Energy Rating: " + rating);

        String programs = SamsungWashingMachine7Kg.getWashPrograms();
        System.out.println("Wash Programs: " + programs);

        String motor = SamsungWashingMachine7Kg.getMotorType();
        System.out.println("Motor Type: " + motor);

        String water = SamsungWashingMachine7Kg.getWaterLevel();
        System.out.println("Water Level: " + water);

        String feature = SamsungWashingMachine7Kg.getSpecialFeature();
        System.out.println("Special Feature: " + feature);

        String warranty = SamsungWashingMachine7Kg.getWarranty();
        System.out.println("Warranty: " + warranty);

        System.out.println("Main ended");
    }
}