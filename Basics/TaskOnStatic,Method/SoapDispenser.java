class SoapDispenser {

    // ===== STATIC VARIABLES (Class Level) =====
    static String brandName = "SWAPKART";
    static String itemType = "Soap Dispenser";
    static String colour = "White";
    static String shape = "Rectangular";

    static int numberOfSets = 1;
    static String countryOfOrigin = "India";
    static int itemHeightMM = 50;
    static int itemWeightGrams = 100;

    static String importer = "Oxygen Enterprise";
    static String manufacturerAddress = "Oxygen Enterprise, India";

    static int unitCount = 1;
    static String asin = "B0F9FQXX9W";
    static double rating = 4.1;


    public static void main(String[] args) {

        // ===== LOCAL VARIABLES (Method Level) =====
        String brandName = "Local Dispenser";
        String itemType = "Liquid Dispenser";
        String colour = "Black";
        String shape = "Square";

        int numberOfSets = 2;
        String countryOfOrigin = "China";
        int itemHeightMM = 80;
        int itemWeightGrams = 150;

        String importer = "Local Importer";
        String manufacturerAddress = "Bangalore Store";

        int unitCount = 1;
        String asin = "LOCALSD123";
        double rating = 3.9;


        // ===== PRINT STATIC VARIABLES =====
        System.out.println("------ STATIC VARIABLES ------");
        System.out.println("Brand Name: " + SoapDispenser.brandName);
        System.out.println("Item Type: " + SoapDispenser.itemType);
        System.out.println("Colour: " + SoapDispenser.colour);
        System.out.println("Shape: " + SoapDispenser.shape);

        System.out.println("Number Of Sets: " + SoapDispenser.numberOfSets);
        System.out.println("Country Of Origin: " + SoapDispenser.countryOfOrigin);
        System.out.println("Item Height: " + SoapDispenser.itemHeightMM);
        System.out.println("Item Weight: " + SoapDispenser.itemWeightGrams);

        System.out.println("Importer: " + SoapDispenser.importer);
        System.out.println("Manufacturer Address: " + SoapDispenser.manufacturerAddress);

        System.out.println("Unit Count: " + SoapDispenser.unitCount);
        System.out.println("ASIN: " + SoapDispenser.asin);
        System.out.println("Rating: " + SoapDispenser.rating);


        // ===== PRINT LOCAL VARIABLES =====
        System.out.println("\n------ LOCAL VARIABLES ------");
        System.out.println("Brand Name: " + brandName);
        System.out.println("Item Type: " + itemType);
        System.out.println("Colour: " + colour);
        System.out.println("Shape: " + shape);

        System.out.println("Number Of Sets: " + numberOfSets);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Item Height: " + itemHeightMM);
        System.out.println("Item Weight: " + itemWeightGrams);

        System.out.println("Importer: " + importer);
        System.out.println("Manufacturer Address: " + manufacturerAddress);

        System.out.println("Unit Count: " + unitCount);
        System.out.println("ASIN: " + asin);
        System.out.println("Rating: " + rating);
    }
}