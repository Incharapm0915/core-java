class PowerBank {

    // ===== STATIC VARIABLES (Class Level) =====
    static String brandName = "Portronics";
    static String modelName = "Power Shutter";
    static String modelNumber = "POR-2265";
    static String itemType = "Power Bank";

    static int batteryCapacitymAh = 10000;
    static String connectorType = "USB Type C";
    static int numberOfPorts = 1;
    static String powerSource = "Type C";

    static String specialFeatures =
            "22.5W PD Output, Digital Display, In-Built Type C & 8 Pin Cable, Wireless Charging";

    static String compatibleDevices = "Smartphone";
    static String countryOfOrigin = "India";
    static String boxContents = "1 Powerbank, 1 Documentation, 1 Charging Cable";

    static String manufacturerAddress =
            "Portronics Digital Pvt. Ltd., First Floor, Property No D 8 Upper Basement, "
          + "Sector 8, Noida, Uttar Pradesh 201301";

    static String warranty = "1 Year";
    static String asin = "B0DKXPL1HS";
    static double rating = 4.0;


    public static void main(String[] args) {

        // ===== LOCAL VARIABLES (Method Level) =====
        String brandName = "Local Power";
        String modelName = "Fast Charge 20K";
        String modelNumber = "LP-20000";
        String itemType = "Portable Charger";

        int batteryCapacitymAh = 20000;
        String connectorType = "USB A";
        int numberOfPorts = 2;
        String powerSource = "Micro USB";

        String specialFeatures = "Fast Charging, LED Indicator";

        String compatibleDevices = "Mobile & Tablet";
        String countryOfOrigin = "China";
        String boxContents = "Powerbank + Cable";

        String manufacturerAddress = "Bangalore Electronics Store";

        String warranty = "6 Months";
        String asin = "LOCALPB123";
        double rating = 3.8;


        // ===== PRINT STATIC VARIABLES =====
        System.out.println("------ STATIC VARIABLES ------");
        System.out.println("Brand Name: " + PowerBank.brandName);
        System.out.println("Model Name: " + PowerBank.modelName);
        System.out.println("Model Number: " + PowerBank.modelNumber);
        System.out.println("Item Type: " + PowerBank.itemType);

        System.out.println("Battery Capacity: " + PowerBank.batteryCapacitymAh);
        System.out.println("Connector Type: " + PowerBank.connectorType);
        System.out.println("Number Of Ports: " + PowerBank.numberOfPorts);
        System.out.println("Power Source: " + PowerBank.powerSource);

        System.out.println("Special Features: " + PowerBank.specialFeatures);
        System.out.println("Compatible Devices: " + PowerBank.compatibleDevices);
        System.out.println("Country Of Origin: " + PowerBank.countryOfOrigin);
        System.out.println("Box Contents: " + PowerBank.boxContents);

        System.out.println("Manufacturer Address: " + PowerBank.manufacturerAddress);
        System.out.println("Warranty: " + PowerBank.warranty);
        System.out.println("ASIN: " + PowerBank.asin);
        System.out.println("Rating: " + PowerBank.rating);


        // ===== PRINT LOCAL VARIABLES =====
        System.out.println("\n------ LOCAL VARIABLES ------");
        System.out.println("Brand Name: " + brandName);
        System.out.println("Model Name: " + modelName);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Item Type: " + itemType);

        System.out.println("Battery Capacity: " + batteryCapacitymAh);
        System.out.println("Connector Type: " + connectorType);
        System.out.println("Number Of Ports: " + numberOfPorts);
        System.out.println("Power Source: " + powerSource);

        System.out.println("Special Features: " + specialFeatures);
        System.out.println("Compatible Devices: " + compatibleDevices);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Box Contents: " + boxContents);

        System.out.println("Manufacturer Address: " + manufacturerAddress);
        System.out.println("Warranty: " + warranty);
        System.out.println("ASIN: " + asin);
        System.out.println("Rating: " + rating);
    }
}