class USBTypeCCable {

    // ===== STATIC VARIABLES (Class Level) =====
    static String brandName = "Ambrane";
    static String connectorType = "USB Type C";
    static String cableType = "USB";
    static String compatibleDevices =
            "Tablet, Laptop, Smartphone, Headphones, Charging Adapter, Android";
    static String specialFeatures =
            "Fast Charging, Tangle Free, Data Transfer, Data Sync, Flexible, Braided, Durable";

    static String compatiblePhoneModels = "All Smartphones";
    static String connectorGender = "Male to Male";
    static double dataTransferRateGbps = 0.48;
    static int numberOfPins = 24;
    static int maximumCurrentAmps = 3;

    static String connectivityTechnology = "USB";
    static String specificationMet = "Qualcomm";
    static String usage = "Indoor";

    static int unitCount = 2;
    static int itemWeightGrams = 140;
    static int numberOfItems = 2;


    public static void main(String[] args) {

        // ===== LOCAL VARIABLES (Method Level) =====
        String brandName = "Local Cable";
        String connectorType = "USB C to USB A";
        String cableType = "Charging Cable";
        String compatibleDevices = "Mobile Phones Only";
        String specialFeatures = "Fast Charging, Durable";

        String compatiblePhoneModels = "Android Only";
        String connectorGender = "Male to Female";
        double dataTransferRateGbps = 0.30;
        int numberOfPins = 16;
        int maximumCurrentAmps = 2;

        String connectivityTechnology = "USB 2.0";
        String specificationMet = "Standard";
        String usage = "Home";

        int unitCount = 1;
        int itemWeightGrams = 90;
        int numberOfItems = 1;


        // ===== PRINT STATIC VARIABLES =====
        System.out.println("------ STATIC VARIABLES ------");
        System.out.println("Brand Name: " + USBTypeCCable.brandName);
        System.out.println("Connector Type: " + USBTypeCCable.connectorType);
        System.out.println("Cable Type: " + USBTypeCCable.cableType);
        System.out.println("Compatible Devices: " + USBTypeCCable.compatibleDevices);
        System.out.println("Special Features: " + USBTypeCCable.specialFeatures);

        System.out.println("Compatible Phone Models: " + USBTypeCCable.compatiblePhoneModels);
        System.out.println("Connector Gender: " + USBTypeCCable.connectorGender);
        System.out.println("Data Transfer Rate: " + USBTypeCCable.dataTransferRateGbps);
        System.out.println("Number of Pins: " + USBTypeCCable.numberOfPins);
        System.out.println("Maximum Current: " + USBTypeCCable.maximumCurrentAmps);

        System.out.println("Connectivity Technology: " + USBTypeCCable.connectivityTechnology);
        System.out.println("Specification Met: " + USBTypeCCable.specificationMet);
        System.out.println("Usage: " + USBTypeCCable.usage);

        System.out.println("Unit Count: " + USBTypeCCable.unitCount);
        System.out.println("Item Weight: " + USBTypeCCable.itemWeightGrams);
        System.out.println("Number Of Items: " + USBTypeCCable.numberOfItems);


        // ===== PRINT LOCAL VARIABLES =====
        System.out.println("\n------ LOCAL VARIABLES ------");
        System.out.println("Brand Name: " + brandName);
        System.out.println("Connector Type: " + connectorType);
        System.out.println("Cable Type: " + cableType);
        System.out.println("Compatible Devices: " + compatibleDevices);
        System.out.println("Special Features: " + specialFeatures);

        System.out.println("Compatible Phone Models: " + compatiblePhoneModels);
        System.out.println("Connector Gender: " + connectorGender);
        System.out.println("Data Transfer Rate: " + dataTransferRateGbps);
        System.out.println("Number of Pins: " + numberOfPins);
        System.out.println("Maximum Current: " + maximumCurrentAmps);

        System.out.println("Connectivity Technology: " + connectivityTechnology);
        System.out.println("Specification Met: " + specificationMet);
        System.out.println("Usage: " + usage);

        System.out.println("Unit Count: " + unitCount);
        System.out.println("Item Weight: " + itemWeightGrams);
        System.out.println("Number Of Items: " + numberOfItems);
    }
}