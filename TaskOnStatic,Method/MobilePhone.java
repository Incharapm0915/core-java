class MobilePhone {

    // ===== STATIC VARIABLES (Class Level) =====
    static String brandName = "iQOO";
    static String modelName = "Z10R 5G";
    static String operatingSystem = "Funtouch OS 15 Based on Android 15";

    static int ramGB = 8;
    static int storageGB = 128;
    static double processorSpeedGHz = 2.6;

    static String colour = "Aquamarine";
    static String simSlot = "Dual SIM";
    static String connectorType = "USB Type C";
    static String formFactor = "Bar";

    static String biometricSecurity = "Fingerprint Recognition";
    static String simCardSize = "Nano";
    static String waterResistance = "Water Resistant";
    static String productFeatures = "Fast Charging Support, Water Resistant";

    static int frontCameraMP = 32;
    static int rearCameraMP = 50;
    static int numberOfRearCameras = 2;
    static int numberOfFrontCameras = 1;


    public static void main(String[] args) {

        // ===== LOCAL VARIABLES (Method Level) =====
        String brandName = "Local Phone";
        String modelName = "XPhone 12";
        String operatingSystem = "Android 13";

        int ramGB = 12;
        int storageGB = 256;
        double processorSpeedGHz = 3.0;

        String colour = "Black";
        String simSlot = "Single SIM";
        String connectorType = "USB C";
        String formFactor = "Slim Bar";

        String biometricSecurity = "Face Unlock";
        String simCardSize = "Nano";
        String waterResistance = "Not Water Resistant";
        String productFeatures = "Fast Charging";

        int frontCameraMP = 16;
        int rearCameraMP = 64;
        int numberOfRearCameras = 3;
        int numberOfFrontCameras = 1;


        // ===== PRINT STATIC VARIABLES =====
        System.out.println("------ STATIC VARIABLES ------");
        System.out.println("Brand Name: " + MobilePhone.brandName);
        System.out.println("Model Name: " + MobilePhone.modelName);
        System.out.println("Operating System: " + MobilePhone.operatingSystem);

        System.out.println("RAM: " + MobilePhone.ramGB);
        System.out.println("Storage: " + MobilePhone.storageGB);
        System.out.println("Processor Speed: " + MobilePhone.processorSpeedGHz);

        System.out.println("Colour: " + MobilePhone.colour);
        System.out.println("SIM Slot: " + MobilePhone.simSlot);
        System.out.println("Connector Type: " + MobilePhone.connectorType);
        System.out.println("Form Factor: " + MobilePhone.formFactor);

        System.out.println("Biometric Security: " + MobilePhone.biometricSecurity);
        System.out.println("SIM Card Size: " + MobilePhone.simCardSize);
        System.out.println("Water Resistance: " + MobilePhone.waterResistance);
        System.out.println("Product Features: " + MobilePhone.productFeatures);

        System.out.println("Front Camera: " + MobilePhone.frontCameraMP);
        System.out.println("Rear Camera: " + MobilePhone.rearCameraMP);
        System.out.println("Number Of Rear Cameras: " + MobilePhone.numberOfRearCameras);
        System.out.println("Number Of Front Cameras: " + MobilePhone.numberOfFrontCameras);


        // ===== PRINT LOCAL VARIABLES =====
        System.out.println("\n------ LOCAL VARIABLES ------");
        System.out.println("Brand Name: " + brandName);
        System.out.println("Model Name: " + modelName);
        System.out.println("Operating System: " + operatingSystem);

        System.out.println("RAM: " + ramGB);
        System.out.println("Storage: " + storageGB);
        System.out.println("Processor Speed: " + processorSpeedGHz);

        System.out.println("Colour: " + colour);
        System.out.println("SIM Slot: " + simSlot);
        System.out.println("Connector Type: " + connectorType);
        System.out.println("Form Factor: " + formFactor);

        System.out.println("Biometric Security: " + biometricSecurity);
        System.out.println("SIM Card Size: " + simCardSize);
        System.out.println("Water Resistance: " + waterResistance);
        System.out.println("Product Features: " + productFeatures);

        System.out.println("Front Camera: " + frontCameraMP);
        System.out.println("Rear Camera: " + rearCameraMP);
        System.out.println("Number Of Rear Cameras: " + numberOfRearCameras);
        System.out.println("Number Of Front Cameras: " + numberOfFrontCameras);
    }
}