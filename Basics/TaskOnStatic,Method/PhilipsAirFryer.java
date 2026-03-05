class PhilipsAirFryer {

    // ===== STATIC VARIABLES (Class Level) =====
    static String brandName = "Philips";
    static String modelName = "HD9200/90";
    static String itemType = "Air Fryer";
    static String recommendedUses = "Bake, Reheat, Roast";

    static int outputWattage = 1400;
    static int voltage = 240;
    static String controlMethod = "Touch";
    static String airFryingTechnology = "Rapid Air";

    static int minTemperatureCelsius = 60;
    static int maxTemperatureCelsius = 200;

    static String specialFeatures = "Programmable, Temperature Control";
    static String includedComponents = "Air Fryer, User Manual";
    static String countryOfOrigin = "India";

    static String manufacturerAddress =
            "Versuni India Home Solutions Ltd., 3rd Floor, Tower A, DLF IT Park, "
          + "08 Block AF Major Arterial Road, New Town (Rajarhat), Kolkata, West Bengal 700156, India";

    static String warranty = "2 Year World Wide Warranty";
    static String asin = "B09CTWFV5W";
    static double rating = 4.3;
    static int unitCount = 1;


    public static void main(String[] args) {

        // ===== LOCAL VARIABLES (Method Level) =====
        String brandName = "Local Fryer";
        String modelName = "LF100";
        String itemType = "Electric Fryer";
        String recommendedUses = "Fry Only";

        int outputWattage = 1200;
        int voltage = 220;
        String controlMethod = "Knob";
        String airFryingTechnology = "Basic Air";

        int minTemperatureCelsius = 80;
        int maxTemperatureCelsius = 180;

        String specialFeatures = "Timer";
        String includedComponents = "Fryer + Basket";
        String countryOfOrigin = "China";

        String manufacturerAddress = "Bangalore Appliances Store";

        String warranty = "1 Year Warranty";
        String asin = "LOCALAF123";
        double rating = 3.9;
        int unitCount = 1;


        // ===== PRINT STATIC VARIABLES =====
        System.out.println("------ STATIC VARIABLES ------");
        System.out.println("Brand Name: " + PhilipsAirFryer.brandName);
        System.out.println("Model Name: " + PhilipsAirFryer.modelName);
        System.out.println("Item Type: " + PhilipsAirFryer.itemType);
        System.out.println("Recommended Uses: " + PhilipsAirFryer.recommendedUses);

        System.out.println("Output Wattage: " + PhilipsAirFryer.outputWattage);
        System.out.println("Voltage: " + PhilipsAirFryer.voltage);
        System.out.println("Control Method: " + PhilipsAirFryer.controlMethod);
        System.out.println("Air Frying Technology: " + PhilipsAirFryer.airFryingTechnology);

        System.out.println("Minimum Temperature: " + PhilipsAirFryer.minTemperatureCelsius);
        System.out.println("Maximum Temperature: " + PhilipsAirFryer.maxTemperatureCelsius);

        System.out.println("Special Features: " + PhilipsAirFryer.specialFeatures);
        System.out.println("Included Components: " + PhilipsAirFryer.includedComponents);
        System.out.println("Country Of Origin: " + PhilipsAirFryer.countryOfOrigin);

        System.out.println("Manufacturer Address: " + PhilipsAirFryer.manufacturerAddress);
        System.out.println("Warranty: " + PhilipsAirFryer.warranty);
        System.out.println("ASIN: " + PhilipsAirFryer.asin);
        System.out.println("Rating: " + PhilipsAirFryer.rating);
        System.out.println("Unit Count: " + PhilipsAirFryer.unitCount);


        // ===== PRINT LOCAL VARIABLES =====
        System.out.println("\n------ LOCAL VARIABLES ------");
        System.out.println("Brand Name: " + brandName);
        System.out.println("Model Name: " + modelName);
        System.out.println("Item Type: " + itemType);
        System.out.println("Recommended Uses: " + recommendedUses);

        System.out.println("Output Wattage: " + outputWattage);
        System.out.println("Voltage: " + voltage);
        System.out.println("Control Method: " + controlMethod);
        System.out.println("Air Frying Technology: " + airFryingTechnology);

        System.out.println("Minimum Temperature: " + minTemperatureCelsius);
        System.out.println("Maximum Temperature: " + maxTemperatureCelsius);

        System.out.println("Special Features: " + specialFeatures);
        System.out.println("Included Components: " + includedComponents);
        System.out.println("Country Of Origin: " + countryOfOrigin);

        System.out.println("Manufacturer Address: " + manufacturerAddress);
        System.out.println("Warranty: " + warranty);
        System.out.println("ASIN: " + asin);
        System.out.println("Rating: " + rating);
        System.out.println("Unit Count: " + unitCount);
    }
}