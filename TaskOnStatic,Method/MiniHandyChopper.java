class MiniHandyChopper {

    // ===== STATIC VARIABLES (Class Level) =====
    static String brandName = "Pigeon";
    static String itemTypeName = "Pigeon Mini Handy Chopper";
    static String recommendedUse = "Chop";
    static String colour = "Green";

    static String bladeMaterial = "Stainless Steel";
    static String enclosureMaterial = "Polypropylene";
    static String bladeShape = "Round";
    static String productCareInstructions = "Hand Wash Only";

    static String includedComponents = "1-Piece Handy Chopper";
    static String countryOfOrigin = "India";

    static String manufacturerAddress =
            "Stovekraft Limited, 81/1 Harohalli Industrial Area, Kanakapura Taluk, "
          + "Bangalore Kanakapura, Bengaluru, Karnataka 562112. "
          + "For any issues contact 080 26985800 or WhatsApp +91 63649 14202 "
          + "or mail to customercare@stovekraft.com";

    static int unitCount = 1;
    static String warrantyDescription = "30 days manufacturer's warranty";
    static String asin = "B01LWYDEQ7";
    static double rating = 3.9;


    public static void main(String[] args) {

        // ===== LOCAL VARIABLES (Method Level) =====
        String brandName = "Local Chopper";
        String itemTypeName = "Vegetable Cutter";
        String recommendedUse = "Cut Vegetables";
        String colour = "Blue";

        String bladeMaterial = "Carbon Steel";
        String enclosureMaterial = "Plastic";
        String bladeShape = "Straight";
        String productCareInstructions = "Wash with Water";

        String includedComponents = "Chopper + Container";
        String countryOfOrigin = "China";

        String manufacturerAddress = "Bangalore Kitchen Store";

        int unitCount = 1;
        String warrantyDescription = "7 Days Replacement";
        String asin = "LOCALMHC123";
        double rating = 4.1;


        // ===== PRINT STATIC VARIABLES =====
        System.out.println("------ STATIC VARIABLES ------");
        System.out.println("Brand Name: " + MiniHandyChopper.brandName);
        System.out.println("Item Type Name: " + MiniHandyChopper.itemTypeName);
        System.out.println("Recommended Use: " + MiniHandyChopper.recommendedUse);
        System.out.println("Colour: " + MiniHandyChopper.colour);

        System.out.println("Blade Material: " + MiniHandyChopper.bladeMaterial);
        System.out.println("Enclosure Material: " + MiniHandyChopper.enclosureMaterial);
        System.out.println("Blade Shape: " + MiniHandyChopper.bladeShape);
        System.out.println("Product Care Instructions: " + MiniHandyChopper.productCareInstructions);

        System.out.println("Included Components: " + MiniHandyChopper.includedComponents);
        System.out.println("Country Of Origin: " + MiniHandyChopper.countryOfOrigin);

        System.out.println("Manufacturer Address: " + MiniHandyChopper.manufacturerAddress);
        System.out.println("Unit Count: " + MiniHandyChopper.unitCount);
        System.out.println("Warranty Description: " + MiniHandyChopper.warrantyDescription);
        System.out.println("ASIN: " + MiniHandyChopper.asin);
        System.out.println("Rating: " + MiniHandyChopper.rating);


        // ===== PRINT LOCAL VARIABLES =====
        System.out.println("\n------ LOCAL VARIABLES ------");
        System.out.println("Brand Name: " + brandName);
        System.out.println("Item Type Name: " + itemTypeName);
        System.out.println("Recommended Use: " + recommendedUse);
        System.out.println("Colour: " + colour);

        System.out.println("Blade Material: " + bladeMaterial);
        System.out.println("Enclosure Material: " + enclosureMaterial);
        System.out.println("Blade Shape: " + bladeShape);
        System.out.println("Product Care Instructions: " + productCareInstructions);

        System.out.println("Included Components: " + includedComponents);
        System.out.println("Country Of Origin: " + countryOfOrigin);

        System.out.println("Manufacturer Address: " + manufacturerAddress);
        System.out.println("Unit Count: " + unitCount);
        System.out.println("Warranty Description: " + warrantyDescription);
        System.out.println("ASIN: " + asin);
        System.out.println("Rating: " + rating);
    }
}