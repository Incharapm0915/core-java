class SonyWH1000XM5Executor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = SonyWH1000XM5.getProductName();
        System.out.println("Product Name: " + name);

        String brand = SonyWH1000XM5.getBrand();
        System.out.println("Brand: " + brand);

        double price = SonyWH1000XM5.getPrice();
        System.out.println("Price: ₹" + price);

        String color = SonyWH1000XM5.getColor();
        System.out.println("Color: " + color);

        String connectivity = SonyWH1000XM5.getConnectivity();
        System.out.println("Connectivity: " + connectivity);

        String battery = SonyWH1000XM5.getBatteryLife();
        System.out.println("Battery Life: " + battery);

        String charging = SonyWH1000XM5.getChargingTime();
        System.out.println("Charging Time: " + charging);

        String noise = SonyWH1000XM5.getNoiseCancellation();
        System.out.println("Noise Cancellation: " + noise);

        String driver = SonyWH1000XM5.getDriverSize();
        System.out.println("Driver Size: " + driver);

        String weight = SonyWH1000XM5.getWeight();
        System.out.println("Weight: " + weight);

        String warranty = SonyWH1000XM5.getWarranty();
        System.out.println("Warranty: " + warranty);

        String feature = SonyWH1000XM5.getSpecialFeature();
        System.out.println("Special Feature: " + feature);

        System.out.println("Main ended");
    }
}