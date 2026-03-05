class MicrowaveOven {

    // ===== STATIC VARIABLES =====
    static String brand = "IFB";
    static String model = "20SC2";
    static String type = "Convection";
    static String colour = "Black";

    static int capacityLitres = 20;
    static int powerWatts = 800;
    static int autoCookMenus = 24;

    static boolean childLock = true;
    static boolean timerAvailable = true;
    static boolean defrostFunction = true;

    static String controlType = "Touch Keypad";
    static String turntableMaterial = "Glass";

    static int voltage = 230;
    static double weightKg = 12.5;

    static String countryOfOrigin = "India";
    static String warranty = "1 Year Product + 3 Years Magnetron";
    static double rating = 4.2;


    public static void main(String[] args) {

        // ===== LOCAL VARIABLES =====
        String brand = "Local Oven";
        String model = "HeatX";
        String type = "Solo";
        String colour = "White";

        int capacityLitres = 17;
        int powerWatts = 700;
        int autoCookMenus = 10;

        boolean childLock = false;
        boolean timerAvailable = true;
        boolean defrostFunction = false;

        String controlType = "Knob";
        String turntableMaterial = "Plastic";

        int voltage = 220;
        double weightKg = 10.0;

        String countryOfOrigin = "China";
        String warranty = "1 Year";
        double rating = 3.6;


        // ===== STATIC PRINT =====
        System.out.println("---- STATIC VARIABLES ----");
        System.out.println("Brand: " + MicrowaveOven.brand);
        System.out.println("Model: " + MicrowaveOven.model);
        System.out.println("Type: " + MicrowaveOven.type);
        System.out.println("Colour: " + MicrowaveOven.colour);
        System.out.println("Capacity: " + MicrowaveOven.capacityLitres);
        System.out.println("Power: " + MicrowaveOven.powerWatts);
        System.out.println("Auto Cook Menus: " + MicrowaveOven.autoCookMenus);
        System.out.println("Child Lock: " + MicrowaveOven.childLock);
        System.out.println("Timer: " + MicrowaveOven.timerAvailable);
        System.out.println("Defrost: " + MicrowaveOven.defrostFunction);
        System.out.println("Control Type: " + MicrowaveOven.controlType);
        System.out.println("Turntable: " + MicrowaveOven.turntableMaterial);
        System.out.println("Voltage: " + MicrowaveOven.voltage);
        System.out.println("Weight: " + MicrowaveOven.weightKg);
        System.out.println("Country: " + MicrowaveOven.countryOfOrigin);
        System.out.println("Warranty: " + MicrowaveOven.warranty);
        System.out.println("Rating: " + MicrowaveOven.rating);


        // ===== LOCAL PRINT =====
        System.out.println("\n---- LOCAL VARIABLES ----");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Colour: " + colour);
        System.out.println("Capacity: " + capacityLitres);
        System.out.println("Power: " + powerWatts);
        System.out.println("Auto Cook Menus: " + autoCookMenus);
        System.out.println("Child Lock: " + childLock);
        System.out.println("Timer: " + timerAvailable);
        System.out.println("Defrost: " + defrostFunction);
        System.out.println("Control Type: " + controlType);
        System.out.println("Turntable: " + turntableMaterial);
        System.out.println("Voltage: " + voltage);
        System.out.println("Weight: " + weightKg);
        System.out.println("Country: " + countryOfOrigin);
        System.out.println("Warranty: " + warranty);
        System.out.println("Rating: " + rating);
    }
}