class Refrigerator {

    // ===== STATIC VARIABLES =====
    static String brand = "LG";
    static String model = "GL-S292RPZX";
    static String colour = "Shiny Steel";
    static String energyRating = "3 Star";

    static int capacityLitres = 260;
    static boolean inverterCompressor = true;
    static boolean frostFree = true;

    static int shelves = 3;
    static int doorBaskets = 4;
    static String coolingTechnology = "Smart Inverter";

    static int voltage = 230;
    static double weightKg = 52.5;

    static String warranty = "10 Years Compressor Warranty";
    static String countryOfOrigin = "India";
    static double rating = 4.4;


    public static void main(String[] args) {

        // ===== LOCAL VARIABLES =====
        String brand = "Local Fridge";
        String model = "CoolX 200";
        String colour = "Blue";
        String energyRating = "2 Star";

        int capacityLitres = 200;
        boolean inverterCompressor = false;
        boolean frostFree = false;

        int shelves = 2;
        int doorBaskets = 3;
        String coolingTechnology = "Direct Cool";

        int voltage = 220;
        double weightKg = 45.0;

        String warranty = "2 Years";
        String countryOfOrigin = "China";
        double rating = 3.8;


        // ===== STATIC PRINT =====
        System.out.println("---- STATIC VARIABLES ----");
        System.out.println("Brand: " + Refrigerator.brand);
        System.out.println("Model: " + Refrigerator.model);
        System.out.println("Colour: " + Refrigerator.colour);
        System.out.println("Energy Rating: " + Refrigerator.energyRating);
        System.out.println("Capacity: " + Refrigerator.capacityLitres);
        System.out.println("Inverter Compressor: " + Refrigerator.inverterCompressor);
        System.out.println("Frost Free: " + Refrigerator.frostFree);
        System.out.println("Shelves: " + Refrigerator.shelves);
        System.out.println("Door Baskets: " + Refrigerator.doorBaskets);
        System.out.println("Cooling Technology: " + Refrigerator.coolingTechnology);
        System.out.println("Voltage: " + Refrigerator.voltage);
        System.out.println("Weight: " + Refrigerator.weightKg);
        System.out.println("Warranty: " + Refrigerator.warranty);
        System.out.println("Country: " + Refrigerator.countryOfOrigin);
        System.out.println("Rating: " + Refrigerator.rating);


        // ===== LOCAL PRINT =====
        System.out.println("\n---- LOCAL VARIABLES ----");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Colour: " + colour);
        System.out.println("Energy Rating: " + energyRating);
        System.out.println("Capacity: " + capacityLitres);
        System.out.println("Inverter Compressor: " + inverterCompressor);
        System.out.println("Frost Free: " + frostFree);
        System.out.println("Shelves: " + shelves);
        System.out.println("Door Baskets: " + doorBaskets);
        System.out.println("Cooling Technology: " + coolingTechnology);
        System.out.println("Voltage: " + voltage);
        System.out.println("Weight: " + weightKg);
        System.out.println("Warranty: " + warranty);
        System.out.println("Country: " + countryOfOrigin);
        System.out.println("Rating: " + rating);
    }
}