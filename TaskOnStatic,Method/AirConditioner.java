class AirConditioner {

    // ===== STATIC VARIABLES =====
    static String brand = "Daikin";
    static String model = "FTKF50TV";
    static String type = "Split AC";
    static String colour = "White";

    static double tonnage = 1.5;
    static int energyRating = 5;
    static boolean inverter = true;

    static int coolingCapacity = 5000;
    static String refrigerant = "R32";
    static String compressorType = "Swing Compressor";

    static boolean turboMode = true;
    static boolean sleepMode = true;
    static boolean autoClean = true;

    static int airFlowLevel = 4;
    static String filterType = "PM2.5 Filter";

    static int voltage = 230;
    static double indoorUnitWeight = 11.5;
    static double outdoorUnitWeight = 28.0;

    static String warranty = "1 Year Product + 10 Years Compressor";
    static String countryOfOrigin = "India";
    static double rating = 4.6;


    public static void main(String[] args) {

        // ===== LOCAL VARIABLES =====
        String brand = "Local AC";
        String model = "Cool Breeze 1T";
        String type = "Window AC";
        String colour = "Grey";

        double tonnage = 1.0;
        int energyRating = 3;
        boolean inverter = false;

        int coolingCapacity = 3200;
        String refrigerant = "R22";
        String compressorType = "Rotary";

        boolean turboMode = false;
        boolean sleepMode = true;
        boolean autoClean = false;

        int airFlowLevel = 2;
        String filterType = "Dust Filter";

        int voltage = 220;
        double indoorUnitWeight = 18.0;
        double outdoorUnitWeight = 0;

        String warranty = "2 Years";
        String countryOfOrigin = "China";
        double rating = 3.9;


        // ===== STATIC PRINT =====
        System.out.println("---- STATIC VARIABLES ----");
        System.out.println("Brand: " + AirConditioner.brand);
        System.out.println("Model: " + AirConditioner.model);
        System.out.println("Type: " + AirConditioner.type);
        System.out.println("Colour: " + AirConditioner.colour);
        System.out.println("Tonnage: " + AirConditioner.tonnage);
        System.out.println("Energy Rating: " + AirConditioner.energyRating);
        System.out.println("Inverter: " + AirConditioner.inverter);
        System.out.println("Cooling Capacity: " + AirConditioner.coolingCapacity);
        System.out.println("Refrigerant: " + AirConditioner.refrigerant);
        System.out.println("Compressor: " + AirConditioner.compressorType);
        System.out.println("Turbo Mode: " + AirConditioner.turboMode);
        System.out.println("Sleep Mode: " + AirConditioner.sleepMode);
        System.out.println("Auto Clean: " + AirConditioner.autoClean);
        System.out.println("Air Flow Level: " + AirConditioner.airFlowLevel);
        System.out.println("Filter: " + AirConditioner.filterType);
        System.out.println("Voltage: " + AirConditioner.voltage);
        System.out.println("Indoor Weight: " + AirConditioner.indoorUnitWeight);
        System.out.println("Outdoor Weight: " + AirConditioner.outdoorUnitWeight);
        System.out.println("Warranty: " + AirConditioner.warranty);
        System.out.println("Country: " + AirConditioner.countryOfOrigin);
        System.out.println("Rating: " + AirConditioner.rating);


        // ===== LOCAL PRINT =====
        System.out.println("\n---- LOCAL VARIABLES ----");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Colour: " + colour);
        System.out.println("Tonnage: " + tonnage);
        System.out.println("Energy Rating: " + energyRating);
        System.out.println("Inverter: " + inverter);
        System.out.println("Cooling Capacity: " + coolingCapacity);
        System.out.println("Refrigerant: " + refrigerant);
        System.out.println("Compressor: " + compressorType);
        System.out.println("Turbo Mode: " + turboMode);
        System.out.println("Sleep Mode: " + sleepMode);
        System.out.println("Auto Clean: " + autoClean);
        System.out.println("Air Flow Level: " + airFlowLevel);
        System.out.println("Filter: " + filterType);
        System.out.println("Voltage: " + voltage);
        System.out.println("Indoor Weight: " + indoorUnitWeight);
        System.out.println("Outdoor Weight: " + outdoorUnitWeight);
        System.out.println("Warranty: " + warranty);
        System.out.println("Country: " + countryOfOrigin);
        System.out.println("Rating: " + rating);
    }
}