class WaterBottle {

    // ===== STATIC VARIABLES (Class Level) =====
    static String brandName = "4Mura";
    static String modelName = "4mu56f";
    static int manufactureYear = 2024;
    static String itemType = "Water Bottle";
    static String colour = "Green";
    static String shape = "Cylindrical";
    static String materialType = "Acrylonitrile Butadiene Styrene";
    static String careInstructions = "Hand Wash Only";

    static int itemWeightGrams = 499;
    static String includedComponents = "Water Bottle";
    static String manufacturer = "4Mura";
    static String countryOfOrigin = "India";

    static String manufacturerAddress =
            "4Mura Manufacturer Address, India";

    static String asin = "B0F262VBTZ";
    static double rating = 4.0;


    public static void main(String[] args) {

        // ===== LOCAL VARIABLES (Method Level) =====
        String brandName = "Local Bottle";
        String modelName = "LB100";
        int manufactureYear = 2023;
        String itemType = "Sports Bottle";
        String colour = "Blue";
        String shape = "Round";
        String materialType = "Steel";
        String careInstructions = "Dishwasher Safe";

        int itemWeightGrams = 350;
        String includedComponents = "Bottle + Cover";
        String manufacturer = "Local Manufacturer";
        String countryOfOrigin = "China";

        String manufacturerAddress = "Bangalore Supplier";

        String asin = "LOCALBOTTLE123";
        double rating = 4.3;


        // ===== PRINT STATIC VARIABLES =====
        System.out.println("------ STATIC VARIABLES ------");
        System.out.println("Brand Name: " + WaterBottle.brandName);
        System.out.println("Model Name: " + WaterBottle.modelName);
        System.out.println("Manufacture Year: " + WaterBottle.manufactureYear);
        System.out.println("Item Type: " + WaterBottle.itemType);
        System.out.println("Colour: " + WaterBottle.colour);
        System.out.println("Shape: " + WaterBottle.shape);
        System.out.println("Material Type: " + WaterBottle.materialType);
        System.out.println("Care Instructions: " + WaterBottle.careInstructions);
        System.out.println("Item Weight: " + WaterBottle.itemWeightGrams);
        System.out.println("Included Components: " + WaterBottle.includedComponents);
        System.out.println("Manufacturer: " + WaterBottle.manufacturer);
        System.out.println("Country Of Origin: " + WaterBottle.countryOfOrigin);
        System.out.println("Manufacturer Address: " + WaterBottle.manufacturerAddress);
        System.out.println("ASIN: " + WaterBottle.asin);
        System.out.println("Rating: " + WaterBottle.rating);


        // ===== PRINT LOCAL VARIABLES =====
        System.out.println("\n------ LOCAL VARIABLES ------");
        System.out.println("Brand Name: " + brandName);
        System.out.println("Model Name: " + modelName);
        System.out.println("Manufacture Year: " + manufactureYear);
        System.out.println("Item Type: " + itemType);
        System.out.println("Colour: " + colour);
        System.out.println("Shape: " + shape);
        System.out.println("Material Type: " + materialType);
        System.out.println("Care Instructions: " + careInstructions);
        System.out.println("Item Weight: " + itemWeightGrams);
        System.out.println("Included Components: " + includedComponents);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Manufacturer Address: " + manufacturerAddress);
        System.out.println("ASIN: " + asin);
        System.out.println("Rating: " + rating);
    }
}