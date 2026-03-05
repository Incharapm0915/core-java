class WardrobeFreshener {

    // ===== STATIC VARIABLES (Class Level) =====
    static String brandName = "Desam Organics";
    static String itemType = "Wardrobe Freshener";
    static String scent = "Patchouli";
    static String includedComponents =
            "Wax Bar, Wardrobe Freshener, Cupboard Freshener in Budget";
    static String countryOfOrigin = "India";
    static String manufacturer = "Desam Organics";

    static int unitWeightGrams = 100;
    static int itemWeightGrams = 80;

    static String manufacturerAddress =
            "Desam Organics Manufacturer, India";

    static String asin = "B09T3DJLRG";
    static double rating = 3.7;


    public static void main(String[] args) {

        // ===== LOCAL VARIABLES (Method Level) =====
        String brandName = "Local Freshener";
        String itemType = "Cupboard Freshener";
        String scent = "Lavender";
        String includedComponents = "Freshener Bar Only";
        String countryOfOrigin = "China";
        String manufacturer = "Local Manufacturer";

        int unitWeightGrams = 120;
        int itemWeightGrams = 90;

        String manufacturerAddress = "Bangalore Supplier";

        String asin = "LOCALFRESH123";
        double rating = 4.1;


        // ===== PRINT STATIC VARIABLES =====
        System.out.println("------ STATIC VARIABLES ------");
        System.out.println("Brand Name: " + WardrobeFreshener.brandName);
        System.out.println("Item Type: " + WardrobeFreshener.itemType);
        System.out.println("Scent: " + WardrobeFreshener.scent);
        System.out.println("Included Components: " + WardrobeFreshener.includedComponents);
        System.out.println("Country Of Origin: " + WardrobeFreshener.countryOfOrigin);
        System.out.println("Manufacturer: " + WardrobeFreshener.manufacturer);
        System.out.println("Unit Weight: " + WardrobeFreshener.unitWeightGrams);
        System.out.println("Item Weight: " + WardrobeFreshener.itemWeightGrams);
        System.out.println("Manufacturer Address: " + WardrobeFreshener.manufacturerAddress);
        System.out.println("ASIN: " + WardrobeFreshener.asin);
        System.out.println("Rating: " + WardrobeFreshener.rating);


        // ===== PRINT LOCAL VARIABLES =====
        System.out.println("\n------ LOCAL VARIABLES ------");
        System.out.println("Brand Name: " + brandName);
        System.out.println("Item Type: " + itemType);
        System.out.println("Scent: " + scent);
        System.out.println("Included Components: " + includedComponents);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Unit Weight: " + unitWeightGrams);
        System.out.println("Item Weight: " + itemWeightGrams);
        System.out.println("Manufacturer Address: " + manufacturerAddress);
        System.out.println("ASIN: " + asin);
        System.out.println("Rating: " + rating);
    }
}