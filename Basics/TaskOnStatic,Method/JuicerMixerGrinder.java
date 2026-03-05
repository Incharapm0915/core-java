class JuicerMixerGrinder {

    // ===== STATIC VARIABLES (Class Level) =====
    static String brandName = "NutriPro";
    static String itemType = "Mixer Grinder";
    static String includedComponents = "Mixers";
    static String recommendedUses = "Grinding, Juices";

    static int wattage = 500;
    static int numberOfSpeeds = 2;
    static int voltage = 230;
    static String powerSource = "Corded Electric";

    static String specialFeatures = "Detachable Attachment";
    static String countryOfOrigin = "India";

    static String manufacturerAddress =
            "Cookwell Domestic Appliances Pvt Ltd, Bhiwandi - 421302, Maharashtra, India. "
          + "Customer Care Number: 90225 90225";

    static String warranty = "2 Year Pick & Drop Warranty";
    static String asin = "B09J2T124D";
    static double rating = 4.4;
    static int unitCount = 1;


    public static void main(String[] args) {

        // ===== LOCAL VARIABLES (Method Level) =====
        String brandName = "Local Grinder";
        String itemType = "Juicer";
        String includedComponents = "Jar + Blade";
        String recommendedUses = "Juice Only";

        int wattage = 750;
        int numberOfSpeeds = 3;
        int voltage = 220;
        String powerSource = "Electric";

        String specialFeatures = "Overload Protection";
        String countryOfOrigin = "China";

        String manufacturerAddress = "Bangalore Appliances Store";

        String warranty = "1 Year Warranty";
        String asin = "LOCALJMG123";
        double rating = 3.9;
        int unitCount = 1;


        // ===== PRINT STATIC VARIABLES =====
        System.out.println("------ STATIC VARIABLES ------");
        System.out.println("Brand Name: " + JuicerMixerGrinder.brandName);
        System.out.println("Item Type: " + JuicerMixerGrinder.itemType);
        System.out.println("Included Components: " + JuicerMixerGrinder.includedComponents);
        System.out.println("Recommended Uses: " + JuicerMixerGrinder.recommendedUses);

        System.out.println("Wattage: " + JuicerMixerGrinder.wattage);
        System.out.println("Number Of Speeds: " + JuicerMixerGrinder.numberOfSpeeds);
        System.out.println("Voltage: " + JuicerMixerGrinder.voltage);
        System.out.println("Power Source: " + JuicerMixerGrinder.powerSource);

        System.out.println("Special Features: " + JuicerMixerGrinder.specialFeatures);
        System.out.println("Country Of Origin: " + JuicerMixerGrinder.countryOfOrigin);

        System.out.println("Manufacturer Address: " + JuicerMixerGrinder.manufacturerAddress);
        System.out.println("Warranty: " + JuicerMixerGrinder.warranty);
        System.out.println("ASIN: " + JuicerMixerGrinder.asin);
        System.out.println("Rating: " + JuicerMixerGrinder.rating);
        System.out.println("Unit Count: " + JuicerMixerGrinder.unitCount);


        // ===== PRINT LOCAL VARIABLES =====
        System.out.println("\n------ LOCAL VARIABLES ------");
        System.out.println("Brand Name: " + brandName);
        System.out.println("Item Type: " + itemType);
        System.out.println("Included Components: " + includedComponents);
        System.out.println("Recommended Uses: " + recommendedUses);

        System.out.println("Wattage: " + wattage);
        System.out.println("Number Of Speeds: " + numberOfSpeeds);
        System.out.println("Voltage: " + voltage);
        System.out.println("Power Source: " + powerSource);

        System.out.println("Special Features: " + specialFeatures);
        System.out.println("Country Of Origin: " + countryOfOrigin);

        System.out.println("Manufacturer Address: " + manufacturerAddress);
        System.out.println("Warranty: " + warranty);
        System.out.println("ASIN: " + asin);
        System.out.println("Rating: " + rating);
        System.out.println("Unit Count: " + unitCount);
    }
}