class Headphones {

    // ===== STATIC VARIABLES =====
    static String brand = "Sony";
    static String model = "WH-CH520";
    static String type = "Wireless";
    static String colour = "Blue";

    static String connectivity = "Bluetooth 5.2";
    static int batteryHours = 50;
    static boolean noiseCancellation = false;

    static boolean fastCharging = true;
    static int chargingTimeMinutes = 180;
    static String controlType = "Button";

    static String driverType = "Dynamic";
    static int driverSizeMM = 30;
    static String frequencyResponse = "20Hz-20kHz";

    static boolean microphone = true;
    static boolean foldable = true;

    static double weightGrams = 147;
    static String countryOfOrigin = "Malaysia";
    static double rating = 4.5;


    public static void main(String[] args) {

        // ===== LOCAL VARIABLES =====
        String brand = "Local Audio";
        String model = "Bass Pro";
        String type = "Wired";
        String colour = "Black";

        String connectivity = "3.5mm Jack";
        int batteryHours = 0;
        boolean noiseCancellation = false;

        boolean fastCharging = false;
        int chargingTimeMinutes = 0;
        String controlType = "Inline Remote";

        String driverType = "Standard";
        int driverSizeMM = 40;
        String frequencyResponse = "18Hz-18kHz";

        boolean microphone = true;
        boolean foldable = false;

        double weightGrams = 210;
        String countryOfOrigin = "China";
        double rating = 3.8;


        // ===== STATIC PRINT =====
        System.out.println("---- STATIC VARIABLES ----");
        System.out.println("Brand: " + Headphones.brand);
        System.out.println("Model: " + Headphones.model);
        System.out.println("Type: " + Headphones.type);
        System.out.println("Colour: " + Headphones.colour);
        System.out.println("Connectivity: " + Headphones.connectivity);
        System.out.println("Battery Hours: " + Headphones.batteryHours);
        System.out.println("Noise Cancellation: " + Headphones.noiseCancellation);
        System.out.println("Fast Charging: " + Headphones.fastCharging);
        System.out.println("Charging Time: " + Headphones.chargingTimeMinutes);
        System.out.println("Control Type: " + Headphones.controlType);
        System.out.println("Driver Type: " + Headphones.driverType);
        System.out.println("Driver Size: " + Headphones.driverSizeMM);
        System.out.println("Frequency Response: " + Headphones.frequencyResponse);
        System.out.println("Microphone: " + Headphones.microphone);
        System.out.println("Foldable: " + Headphones.foldable);
        System.out.println("Weight: " + Headphones.weightGrams);
        System.out.println("Country: " + Headphones.countryOfOrigin);
        System.out.println("Rating: " + Headphones.rating);


        // ===== LOCAL PRINT =====
        System.out.println("\n---- LOCAL VARIABLES ----");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Colour: " + colour);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Battery Hours: " + batteryHours);
        System.out.println("Noise Cancellation: " + noiseCancellation);
        System.out.println("Fast Charging: " + fastCharging);
        System.out.println("Charging Time: " + chargingTimeMinutes);
        System.out.println("Control Type: " + controlType);
        System.out.println("Driver Type: " + driverType);
        System.out.println("Driver Size: " + driverSizeMM);
        System.out.println("Frequency Response: " + frequencyResponse);
        System.out.println("Microphone: " + microphone);
        System.out.println("Foldable: " + foldable);
        System.out.println("Weight: " + weightGrams);
        System.out.println("Country: " + countryOfOrigin);
        System.out.println("Rating: " + rating);
    }
}