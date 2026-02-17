class InsulatedLunchBox {

    // ===== STATIC VARIABLES (Class Level) =====
    static String brand = "daiDokoro";
    static String itemTypeName = "Lunch Boxes";
    static String ageRange = "Adult";
    static String colour = "Berry Blue";

    static String theme = "Sport";
    static String pattern = "Solid";
    static String style = "Modern";
    static String shape = "Round";
    static String itemForm = "Box";

    static String countryOfOrigin = "China";
    static long upc = 700512758085L;

    static String includedComponents =
            "1 Cutlery Set, 1 Thermal Insulated Bag, 4 Lunch Box Container";

    static String manufacturerAddress =
            "The D7 Store, Brand Name: daiDokoro, A404, Indraprastha Apt, "
          + "Behind Ayyappa Temple, Baba Sitarm Marg, Mira Road (East), "
          + "Thane - 401107, India.";

    static String asin = "B0CXY9W4KT";
    static double rating = 3.8;


    public static void main(String[] args) {

        // ===== LOCAL VARIABLES (Method Level) =====
        String brand = "Local LunchBox";
        String itemTypeName = "Food Container";
        String ageRange = "Kids";
        String colour = "Red";

        String theme = "School";
        String pattern = "Printed";
        String style = "Casual";
        String shape = "Square";
        String itemForm = "Container";

        String countryOfOrigin = "India";
        long upc = 123456789012L;

        String includedComponents = "2 Containers + Spoon";

        String manufacturerAddress = "Bangalore Kitchen Store";

        String asin = "LOCALILB123";
        double rating = 4.0;


        // ===== PRINT STATIC VARIABLES =====
        System.out.println("------ STATIC VARIABLES ------");
        System.out.println("Brand: " + InsulatedLunchBox.brand);
        System.out.println("Item Type Name: " + InsulatedLunchBox.itemTypeName);
        System.out.println("Age Range: " + InsulatedLunchBox.ageRange);
        System.out.println("Colour: " + InsulatedLunchBox.colour);

        System.out.println("Theme: " + InsulatedLunchBox.theme);
        System.out.println("Pattern: " + InsulatedLunchBox.pattern);
        System.out.println("Style: " + InsulatedLunchBox.style);
        System.out.println("Shape: " + InsulatedLunchBox.shape);
        System.out.println("Item Form: " + InsulatedLunchBox.itemForm);

        System.out.println("Country Of Origin: " + InsulatedLunchBox.countryOfOrigin);
        System.out.println("UPC: " + InsulatedLunchBox.upc);
        System.out.println("Included Components: " + InsulatedLunchBox.includedComponents);

        System.out.println("Manufacturer Address: " + InsulatedLunchBox.manufacturerAddress);
        System.out.println("ASIN: " + InsulatedLunchBox.asin);
        System.out.println("Rating: " + InsulatedLunchBox.rating);


        // ===== PRINT LOCAL VARIABLES =====
        System.out.println("\n------ LOCAL VARIABLES ------");
        System.out.println("Brand: " + brand);
        System.out.println("Item Type Name: " + itemTypeName);
        System.out.println("Age Range: " + ageRange);
        System.out.println("Colour: " + colour);

        System.out.println("Theme: " + theme);
        System.out.println("Pattern: " + pattern);
        System.out.println("Style: " + style);
        System.out.println("Shape: " + shape);
        System.out.println("Item Form: " + itemForm);

        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("UPC: " + upc);
        System.out.println("Included Components: " + includedComponents);

        System.out.println("Manufacturer Address: " + manufacturerAddress);
        System.out.println("ASIN: " + asin);
        System.out.println("Rating: " + rating);
    }
}