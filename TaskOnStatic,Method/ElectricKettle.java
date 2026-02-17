class ElectricKettle {

    // ===== STATIC VARIABLES =====
    static String brand = "Prestige";
    static String model = "PKOSS 1.5";
    static String colour = "Silver";
    static String bodyMaterial = "Stainless Steel";

    static double capacityLitres = 1.5;
    static int powerWatts = 1500;
    static int voltage = 230;

    static boolean autoCutOff = true;
    static boolean dryBoilProtection = true;
    static boolean cordless = true;

    static String heatingElement = "Concealed";
    static String lidType = "Lockable Lid";
    static String handleType = "Cool Touch";

    static String indicatorType = "LED";
    static double weightKg = 0.9;

    static String countryOfOrigin = "India";
    static String warranty = "1 Year";
    static double rating = 4.4;


    public static void main(String[] args) {

        // ===== LOCAL VARIABLES =====
        String brand = "Local Kettle";
        String model = "BoilFast";
        String colour = "Black";
        String bodyMaterial = "Plastic";

        double capacityLitres = 1.0;
        int powerWatts = 1000;
        int voltage = 220;

        boolean autoCutOff = false;
        boolean dryBoilProtection = false;
        boolean cordless = false;

        String heatingElement = "Visible Coil";
        String lidType = "Normal Lid";
        String handleType = "Plastic Handle";

        String indicatorType = "None";
        double weightKg = 0.7;

        String countryOfOrigin = "China";
        String warranty = "6 Months";
        double rating = 3.5;


        // ===== STATIC PRINT =====
        System.out.println("---- STATIC VARIABLES ----");
        System.out.println("Brand: " + ElectricKettle.brand);
        System.out.println("Model: " + ElectricKettle.model);
        System.out.println("Colour: " + ElectricKettle.colour);
        System.out.println("Body Material: " + ElectricKettle.bodyMaterial);
        System.out.println("Capacity: " + ElectricKettle.capacityLitres);
        System.out.println("Power: " + ElectricKettle.powerWatts);
        System.out.println("Voltage: " + ElectricKettle.voltage);
        System.out.println("Auto Cut Off: " + ElectricKettle.autoCutOff);
        System.out.println("Dry Boil Protection: " + ElectricKettle.dryBoilProtection);
        System.out.println("Cordless: " + ElectricKettle.cordless);
        System.out.println("Heating Element: " + ElectricKettle.heatingElement);
        System.out.println("Lid Type: " + ElectricKettle.lidType);
        System.out.println("Handle Type: " + ElectricKettle.handleType);
        System.out.println("Indicator: " + ElectricKettle.indicatorType);
        System.out.println("Weight: " + ElectricKettle.weightKg);
        System.out.println("Country: " + ElectricKettle.countryOfOrigin);
        System.out.println("Warranty: " + ElectricKettle.warranty);
        System.out.println("Rating: " + ElectricKettle.rating);


        // ===== LOCAL PRINT =====
        System.out.println("\n---- LOCAL VARIABLES ----");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Colour: " + colour);
        System.out.println("Body Material: " + bodyMaterial);
        System.out.println("Capacity: " + capacityLitres);
        System.out.println("Power: " + powerWatts);
        System.out.println("Voltage: " + voltage);
        System.out.println("Auto Cut Off: " + autoCutOff);
        System.out.println("Dry Boil Protection: " + dryBoilProtection);
        System.out.println("Cordless: " + cordless);
        System.out.println("Heating Element: " + heatingElement);
        System.out.println("Lid Type: " + lidType);
        System.out.println("Handle Type: " + handleType);
        System.out.println("Indicator: " + indicatorType);
        System.out.println("Weight: " + weightKg);
        System.out.println("Country: " + countryOfOrigin);
        System.out.println("Warranty: " + warranty);
        System.out.println("Rating: " + rating);
    }
}