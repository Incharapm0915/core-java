class WashingMachine {

    // ===== STATIC VARIABLES =====
    static String brand = "Samsung";
    static String model = "WA65A4002VS";
    static String type = "Top Load";
    static String colour = "Silver";

    static int capacityKg = 6;
    static int spinSpeedRPM = 680;
    static boolean inverterMotor = true;

    static int washPrograms = 6;
    static boolean childLock = true;
    static boolean autoRestart = true;

    static String drumMaterial = "Stainless Steel";
    static String controlType = "Fully Automatic";

    static int voltage = 230;
    static double weightKg = 28.5;

    static String warranty = "2 Years Product + 10 Years Motor";
    static String countryOfOrigin = "India";
    static double rating = 4.3;


    public static void main(String[] args) {

        // ===== LOCAL VARIABLES =====
        String brand = "Local Washer";
        String model = "WashPro 5";
        String type = "Semi Automatic";
        String colour = "White";

        int capacityKg = 5;
        int spinSpeedRPM = 500;
        boolean inverterMotor = false;

        int washPrograms = 3;
        boolean childLock = false;
        boolean autoRestart = false;

        String drumMaterial = "Plastic";
        String controlType = "Manual";

        int voltage = 220;
        double weightKg = 24.0;

        String warranty = "1 Year";
        String countryOfOrigin = "China";
        double rating = 3.7;


        // ===== STATIC PRINT =====
        System.out.println("---- STATIC VARIABLES ----");
        System.out.println("Brand: " + WashingMachine.brand);
        System.out.println("Model: " + WashingMachine.model);
        System.out.println("Type: " + WashingMachine.type);
        System.out.println("Colour: " + WashingMachine.colour);
        System.out.println("Capacity: " + WashingMachine.capacityKg);
        System.out.println("Spin Speed: " + WashingMachine.spinSpeedRPM);
        System.out.println("Inverter Motor: " + WashingMachine.inverterMotor);
        System.out.println("Wash Programs: " + WashingMachine.washPrograms);
        System.out.println("Child Lock: " + WashingMachine.childLock);
        System.out.println("Auto Restart: " + WashingMachine.autoRestart);
        System.out.println("Drum Material: " + WashingMachine.drumMaterial);
        System.out.println("Control Type: " + WashingMachine.controlType);
        System.out.println("Voltage: " + WashingMachine.voltage);
        System.out.println("Weight: " + WashingMachine.weightKg);
        System.out.println("Warranty: " + WashingMachine.warranty);
        System.out.println("Country: " + WashingMachine.countryOfOrigin);
        System.out.println("Rating: " + WashingMachine.rating);


        // ===== LOCAL PRINT =====
        System.out.println("\n---- LOCAL VARIABLES ----");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Colour: " + colour);
        System.out.println("Capacity: " + capacityKg);
        System.out.println("Spin Speed: " + spinSpeedRPM);
        System.out.println("Inverter Motor: " + inverterMotor);
        System.out.println("Wash Programs: " + washPrograms);
        System.out.println("Child Lock: " + childLock);
        System.out.println("Auto Restart: " + autoRestart);
        System.out.println("Drum Material: " + drumMaterial);
        System.out.println("Control Type: " + controlType);
        System.out.println("Voltage: " + voltage);
        System.out.println("Weight: " + weightKg);
        System.out.println("Warranty: " + warranty);
        System.out.println("Country: " + countryOfOrigin);
        System.out.println("Rating: " + rating);
    }
}