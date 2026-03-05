class GrillSandwichMaker {

    // ===== STATIC VARIABLES (Class Level) =====
    static String brandName = "MILTON";
    static String itemType = "Sandwich Maker";
    static String colour = "Black";
    static String productStyle = "Griller";

    static int wattage = 800;
    static int voltage = 230;

    static String specialFeatures = "Non Stick Coating";
    static String includedComponents =
            "Griller, Instruction Manual, Warranty Card";

    static String countryOfOrigin = "India";

    static String manufacturerAddress =
            "Hydro Valves, Customer Support Call @ 9355645866 or Email: info@miltonhomeappliances.com "
          + "(Monday to Saturday, 10:00 AM to 5:30 PM, Excluding National Holidays)";

    static int unitCount = 1;
    static String asin = "B0CGBWMK1";
    static double rating = 4.0;


    public static void main(String[] args) {

        // ===== LOCAL VARIABLES (Method Level) =====
        String brandName = "Local Grill";
        String itemType = "Toast Maker";
        String colour = "Silver";
        String productStyle = "Toaster";

        int wattage = 1000;
        int voltage = 220;

        String specialFeatures = "Auto Cut Off";
        String includedComponents = "Toaster + Manual";

        String countryOfOrigin = "China";

        String manufacturerAddress = "Bangalore Appliance Store";

        int unitCount = 1;
        String asin = "LOCALGSM123";
        double rating = 3.8;


        // ===== PRINT STATIC VARIABLES =====
        System.out.println("------ STATIC VARIABLES ------");
        System.out.println("Brand Name: " + GrillSandwichMaker.brandName);
        System.out.println("Item Type: " + GrillSandwichMaker.itemType);
        System.out.println("Colour: " + GrillSandwichMaker.colour);
        System.out.println("Product Style: " + GrillSandwichMaker.productStyle);

        System.out.println("Wattage: " + GrillSandwichMaker.wattage);
        System.out.println("Voltage: " + GrillSandwichMaker.voltage);

        System.out.println("Special Features: " + GrillSandwichMaker.specialFeatures);
        System.out.println("Included Components: " + GrillSandwichMaker.includedComponents);
        System.out.println("Country Of Origin: " + GrillSandwichMaker.countryOfOrigin);

        System.out.println("Manufacturer Address: " + GrillSandwichMaker.manufacturerAddress);
        System.out.println("Unit Count: " + GrillSandwichMaker.unitCount);
        System.out.println("ASIN: " + GrillSandwichMaker.asin);
        System.out.println("Rating: " + GrillSandwichMaker.rating);


        // ===== PRINT LOCAL VARIABLES =====
        System.out.println("\n------ LOCAL VARIABLES ------");
        System.out.println("Brand Name: " + brandName);
        System.out.println("Item Type: " + itemType);
        System.out.println("Colour: " + colour);
        System.out.println("Product Style: " + productStyle);

        System.out.println("Wattage: " + wattage);
        System.out.println("Voltage: " + voltage);

        System.out.println("Special Features: " + specialFeatures);
        System.out.println("Included Components: " + includedComponents);
        System.out.println("Country Of Origin: " + countryOfOrigin);

        System.out.println("Manufacturer Address: " + manufacturerAddress);
        System.out.println("Unit Count: " + unitCount);
        System.out.println("ASIN: " + asin);
        System.out.println("Rating: " + rating);
    }
}