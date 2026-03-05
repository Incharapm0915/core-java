class BluetoothSpeaker {

    // ===== STATIC VARIABLES =====
    static String brand = "Boat";
    static String model = "Stone 350";
    static String colour = "Black";
    static String connectivity = "Bluetooth";

    static int batteryHours = 12;
    static int powerOutputWatts = 10;
    static boolean waterproof = true;

    static String compatibleDevices = "Mobile, Laptop";
    static double rating = 4.4;


    public static void main(String[] args) {

        // ===== LOCAL VARIABLES =====
        String brand = "Local Speaker";
        String model = "Sound X";
        String colour = "Red";
        String connectivity = "Aux";

        int batteryHours = 6;
        int powerOutputWatts = 5;
        boolean waterproof = false;

        String compatibleDevices = "Mobile Only";
        double rating = 3.7;


        // ===== STATIC PRINT =====
        System.out.println("---- STATIC VARIABLES ----");
        System.out.println("Brand: " + BluetoothSpeaker.brand);
        System.out.println("Model: " + BluetoothSpeaker.model);
        System.out.println("Colour: " + BluetoothSpeaker.colour);
        System.out.println("Connectivity: " + BluetoothSpeaker.connectivity);
        System.out.println("Battery Hours: " + BluetoothSpeaker.batteryHours);
        System.out.println("Power Output: " + BluetoothSpeaker.powerOutputWatts);
        System.out.println("Waterproof: " + BluetoothSpeaker.waterproof);
        System.out.println("Compatible Devices: " + BluetoothSpeaker.compatibleDevices);
        System.out.println("Rating: " + BluetoothSpeaker.rating);


        // ===== LOCAL PRINT =====
        System.out.println("\n---- LOCAL VARIABLES ----");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Colour: " + colour);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Battery Hours: " + batteryHours);
        System.out.println("Power Output: " + powerOutputWatts);
        System.out.println("Waterproof: " + waterproof);
        System.out.println("Compatible Devices: " + compatibleDevices);
        System.out.println("Rating: " + rating);
    }
}