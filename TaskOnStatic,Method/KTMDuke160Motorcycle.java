class KTMDuke160Motorcycle {

    // ===== STATIC VARIABLES (Class Level) =====
    static String brand = "KTM";
    static String model = "Duke 160";
    static String colour = "Atlantic Blue";
    static String vehicleType = "Petrol Bike";
    static String countryOfOrigin = "India";

    static double engineDisplacement = 164.2;
    static int maxPowerPS = 19;
    static int maxPowerRPM = 9500;
    static double torqueNM = 15.5;
    static int torqueRPM = 7500;

    static double lengthMeters = 2.01;
    static double widthMeters = 0.77;
    static double heightMeters = 1.11;
    static int fuelTankCapacityLitres = 13;
    static int weightKg = 159;

    static String specialFeatures =
            "LCD speedometer, 6-speed manual transmission, liquid-cooled engine";

    static String manufacturerAddress = "KTM India Manufacturing Unit";

    static String asin = "B0FND45DX6";
    static double rating = 4.5;


    public static void main(String[] args) {

        // ===== LOCAL VARIABLES (Method Level) =====
        String brand = "Local KTM";
        String model = "Duke 125";
        String colour = "Black";
        String vehicleType = "Electric Bike";
        String countryOfOrigin = "Austria";

        double engineDisplacement = 124.7;
        int maxPowerPS = 14;
        int maxPowerRPM = 9000;
        double torqueNM = 12.0;
        int torqueRPM = 7000;

        double lengthMeters = 1.99;
        double widthMeters = 0.75;
        double heightMeters = 1.05;
        int fuelTankCapacityLitres = 11;
        int weightKg = 150;

        String specialFeatures = "Digital meter, 5-speed gearbox";

        String manufacturerAddress = "Local Dealer Address";

        String asin = "LOCALBIKE123";
        double rating = 3.9;


        // ===== PRINT STATIC VARIABLES =====
        System.out.println("------ STATIC VARIABLES ------");
        System.out.println("Brand: " + KTMDuke160Motorcycle.brand);
        System.out.println("Model: " + KTMDuke160Motorcycle.model);
        System.out.println("Colour: " + KTMDuke160Motorcycle.colour);
        System.out.println("Vehicle Type: " + KTMDuke160Motorcycle.vehicleType);
        System.out.println("Country Of Origin: " + KTMDuke160Motorcycle.countryOfOrigin);

        System.out.println("Engine Displacement: " + KTMDuke160Motorcycle.engineDisplacement);
        System.out.println("Max Power: " + KTMDuke160Motorcycle.maxPowerPS + " PS @ " + KTMDuke160Motorcycle.maxPowerRPM + " RPM");
        System.out.println("Torque: " + KTMDuke160Motorcycle.torqueNM + " Nm @ " + KTMDuke160Motorcycle.torqueRPM + " RPM");

        System.out.println("Length: " + KTMDuke160Motorcycle.lengthMeters);
        System.out.println("Width: " + KTMDuke160Motorcycle.widthMeters);
        System.out.println("Height: " + KTMDuke160Motorcycle.heightMeters);
        System.out.println("Fuel Tank Capacity: " + KTMDuke160Motorcycle.fuelTankCapacityLitres);
        System.out.println("Weight: " + KTMDuke160Motorcycle.weightKg);

        System.out.println("Special Features: " + KTMDuke160Motorcycle.specialFeatures);
        System.out.println("Manufacturer Address: " + KTMDuke160Motorcycle.manufacturerAddress);

        System.out.println("ASIN: " + KTMDuke160Motorcycle.asin);
        System.out.println("Rating: " + KTMDuke160Motorcycle.rating);


        // ===== PRINT LOCAL VARIABLES =====
        System.out.println("\n------ LOCAL VARIABLES ------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Colour: " + colour);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Country Of Origin: " + countryOfOrigin);

        System.out.println("Engine Displacement: " + engineDisplacement);
        System.out.println("Max Power: " + maxPowerPS + " PS @ " + maxPowerRPM + " RPM");
        System.out.println("Torque: " + torqueNM + " Nm @ " + torqueRPM + " RPM");

        System.out.println("Length: " + lengthMeters);
        System.out.println("Width: " + widthMeters);
        System.out.println("Height: " + heightMeters);
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacityLitres);
        System.out.println("Weight: " + weightKg);

        System.out.println("Special Features: " + specialFeatures);
        System.out.println("Manufacturer Address: " + manufacturerAddress);

        System.out.println("ASIN: " + asin);
        System.out.println("Rating: " + rating);
    }
}