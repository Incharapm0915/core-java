class SmartWatch {

    // ===== STATIC VARIABLES =====
    static String brand = "Noise";
    static String model = "ColorFit Pro";
    static String displayType = "AMOLED";
    static String colour = "Black";

    static int batteryLifeDays = 7;
    static boolean bluetoothCalling = true;
    static boolean waterResistant = true;

    static String compatibleOS = "Android & iOS";
    static double rating = 4.2;


    public static void main(String[] args) {

        // ===== LOCAL VARIABLES =====
        String brand = "Local Watch";
        String model = "Fit X";
        String displayType = "LCD";
        String colour = "Blue";

        int batteryLifeDays = 5;
        boolean bluetoothCalling = false;
        boolean waterResistant = false;

        String compatibleOS = "Android Only";
        double rating = 3.8;


        // ===== STATIC PRINT =====
        System.out.println("---- STATIC VARIABLES ----");
        System.out.println("Brand: " + SmartWatch.brand);
        System.out.println("Model: " + SmartWatch.model);
        System.out.println("Display: " + SmartWatch.displayType);
        System.out.println("Colour: " + SmartWatch.colour);
        System.out.println("Battery Life: " + SmartWatch.batteryLifeDays);
        System.out.println("Bluetooth Calling: " + SmartWatch.bluetoothCalling);
        System.out.println("Water Resistant: " + SmartWatch.waterResistant);
        System.out.println("Compatible OS: " + SmartWatch.compatibleOS);
        System.out.println("Rating: " + SmartWatch.rating);


        // ===== LOCAL PRINT =====
        System.out.println("\n---- LOCAL VARIABLES ----");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Display: " + displayType);
        System.out.println("Colour: " + colour);
        System.out.println("Battery Life: " + batteryLifeDays);
        System.out.println("Bluetooth Calling: " + bluetoothCalling);
        System.out.println("Water Resistant: " + waterResistant);
        System.out.println("Compatible OS: " + compatibleOS);
        System.out.println("Rating: " + rating);
    }
}