class GamingLaptop {

    // ===== STATIC VARIABLES (Class Level) =====
    static String brandName = "Dell";
    static String modelName = "G15 5530";
    static String colour = "Dark Shadow Gray";
    static String operatingSystem = "Windows 11 Home";

    static String processorBrand = "Intel";
    static String graphicsProcessor = "NVIDIA GeForce RTX 3050";
    static int graphicsRamGB = 6;
    static String graphicsRamType = "GDDR6";

    static int storageTB = 1;
    static String storageType = "SSD";
    static String specialFeatures = "Backlit Keyboard";
    static String usage = "Gaming";

    static boolean webcamAvailable = true;
    static int itemWeightGrams = 2600;
    static String videoOutput = "HDMI 2.1";

    static String warrantyType =
            "1 Year Basic Onsite Service after remote diagnosis with Hardware-Only Support";


    public static void main(String[] args) {

        // ===== LOCAL VARIABLES (Method Level) =====
        String brandName = "Local Brand";
        String modelName = "Predator X";
        String colour = "Black";
        String operatingSystem = "Windows 10";

        String processorBrand = "AMD Ryzen";
        String graphicsProcessor = "RTX 3060";
        int graphicsRamGB = 8;
        String graphicsRamType = "GDDR6";

        int storageTB = 2;
        String storageType = "NVMe SSD";
        String specialFeatures = "RGB Keyboard";
        String usage = "Heavy Gaming";

        boolean webcamAvailable = false;
        int itemWeightGrams = 2400;
        String videoOutput = "HDMI 2.0";

        String warrantyType = "2 Years Carry-in Warranty";


        // ===== PRINT STATIC VARIABLES =====
        System.out.println("------ STATIC VARIABLES ------");
        System.out.println("Brand Name: " + GamingLaptop.brandName);
        System.out.println("Model Name: " + GamingLaptop.modelName);
        System.out.println("Colour: " + GamingLaptop.colour);
        System.out.println("Operating System: " + GamingLaptop.operatingSystem);

        System.out.println("Processor Brand: " + GamingLaptop.processorBrand);
        System.out.println("Graphics Processor: " + GamingLaptop.graphicsProcessor);
        System.out.println("Graphics RAM: " + GamingLaptop.graphicsRamGB);
        System.out.println("Graphics RAM Type: " + GamingLaptop.graphicsRamType);

        System.out.println("Storage Capacity: " + GamingLaptop.storageTB);
        System.out.println("Storage Type: " + GamingLaptop.storageType);
        System.out.println("Special Features: " + GamingLaptop.specialFeatures);
        System.out.println("Usage: " + GamingLaptop.usage);

        System.out.println("Webcam Available: " + GamingLaptop.webcamAvailable);
        System.out.println("Item Weight: " + GamingLaptop.itemWeightGrams);
        System.out.println("Video Output: " + GamingLaptop.videoOutput);
        System.out.println("Warranty Type: " + GamingLaptop.warrantyType);


        // ===== PRINT LOCAL VARIABLES =====
        System.out.println("\n------ LOCAL VARIABLES ------");
        System.out.println("Brand Name: " + brandName);
        System.out.println("Model Name: " + modelName);
        System.out.println("Colour: " + colour);
        System.out.println("Operating System: " + operatingSystem);

        System.out.println("Processor Brand: " + processorBrand);
        System.out.println("Graphics Processor: " + graphicsProcessor);
        System.out.println("Graphics RAM: " + graphicsRamGB);
        System.out.println("Graphics RAM Type: " + graphicsRamType);

        System.out.println("Storage Capacity: " + storageTB);
        System.out.println("Storage Type: " + storageType);
        System.out.println("Special Features: " + specialFeatures);
        System.out.println("Usage: " + usage);

        System.out.println("Webcam Available: " + webcamAvailable);
        System.out.println("Item Weight: " + itemWeightGrams);
        System.out.println("Video Output: " + videoOutput);
        System.out.println("Warranty Type: " + warrantyType);
    }
}