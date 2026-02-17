class GlassGlobe {

    // ===== STATIC VARIABLES (Class Level) =====
    static String brandName = "GLOBE DADDY";
    static String itemType = "Crystal Glass Globe";
    static String colour = "Crystal Gold";
    static String mapType = "World Map";
    static String baseMaterial = "Metal";
    static String finishType = "Glass";
    static String size = "50 mm";

    static int itemWeightGrams = 350;
    static int unitCount = 1;

    static String manufacturerAddress =
            "Globe Daddy Decorative Products Manufacturer";

    static String asin = "B0CVS6Y4B7";
    static double rating = 3.6;


    public static void main(String[] args) {

        // ===== LOCAL VARIABLES (Method Level) =====
        String brandName = "Local Globe";
        String itemType = "Plastic Globe";
        String colour = "Blue";
        String mapType = "Political Map";
        String baseMaterial = "Wood";
        String finishType = "Matte";
        String size = "70 mm";

        int itemWeightGrams = 420;
        int unitCount = 2;

        String manufacturerAddress = "Bangalore Decorative Store";

        String asin = "LOCALGLOBE123";
        double rating = 4.0;


        // ===== PRINT STATIC VARIABLES =====
        System.out.println("------ STATIC VARIABLES ------");
        System.out.println("Brand Name: " + GlassGlobe.brandName);
        System.out.println("Item Type: " + GlassGlobe.itemType);
        System.out.println("Colour: " + GlassGlobe.colour);
        System.out.println("Map Type: " + GlassGlobe.mapType);
        System.out.println("Base Material: " + GlassGlobe.baseMaterial);
        System.out.println("Finish Type: " + GlassGlobe.finishType);
        System.out.println("Size: " + GlassGlobe.size);
        System.out.println("Item Weight: " + GlassGlobe.itemWeightGrams);
        System.out.println("Unit Count: " + GlassGlobe.unitCount);
        System.out.println("Manufacturer Address: " + GlassGlobe.manufacturerAddress);
        System.out.println("ASIN: " + GlassGlobe.asin);
        System.out.println("Rating: " + GlassGlobe.rating);


        // ===== PRINT LOCAL VARIABLES =====
        System.out.println("\n------ LOCAL VARIABLES ------");
        System.out.println("Brand Name: " + brandName);
        System.out.println("Item Type: " + itemType);
        System.out.println("Colour: " + colour);
        System.out.println("Map Type: " + mapType);
        System.out.println("Base Material: " + baseMaterial);
        System.out.println("Finish Type: " + finishType);
        System.out.println("Size: " + size);
        System.out.println("Item Weight: " + itemWeightGrams);
        System.out.println("Unit Count: " + unitCount);
        System.out.println("Manufacturer Address: " + manufacturerAddress);
        System.out.println("ASIN: " + asin);
        System.out.println("Rating: " + rating);
    }
}