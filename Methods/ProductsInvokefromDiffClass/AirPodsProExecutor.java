class AirPodsProExecutor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String productName = AirPodsPro.getProductName();
        System.out.println("Product Name: " + productName);

        String brand = AirPodsPro.getBrand();
        System.out.println("Brand: " + brand);

        double price = AirPodsPro.getPrice();
        System.out.println("Price: ₹" + price);

        String color = AirPodsPro.getColor();
        System.out.println("Color: " + color);

        String connectivity = AirPodsPro.getConnectivity();
        System.out.println("Connectivity: " + connectivity);

        String battery = AirPodsPro.getBatteryLife();
        System.out.println("Battery Life: " + battery);

        String charging = AirPodsPro.getChargingType();
        System.out.println("Charging Type: " + charging);

        String noise = AirPodsPro.getNoiseControl();
        System.out.println("Noise Control: " + noise);

        String water = AirPodsPro.getWaterResistance();
        System.out.println("Water Resistance: " + water);

        String warranty = AirPodsPro.getWarranty();
        System.out.println("Warranty: " + warranty);

        double weight = AirPodsPro.getWeight();
        System.out.println("Weight (per earbud): " + weight + " grams");

        System.out.println("Main ended");
    }
}