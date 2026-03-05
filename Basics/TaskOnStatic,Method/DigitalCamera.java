class DigitalCamera {

    // ===== STATIC VARIABLES =====
    static String brand = "Canon";
    static String model = "EOS 1500D";
    static String colour = "Black";
    static String cameraType = "DSLR";

    static int resolutionMP = 24;
    static int opticalZoomX = 3;
    static int digitalZoomX = 10;

    static String sensorType = "CMOS";
    static String lensMount = "EF-S";
    static boolean flashAvailable = true;

    static boolean wifi = true;
    static boolean bluetooth = false;
    static boolean videoRecording = true;

    static String videoResolution = "Full HD";
    static int batteryShots = 500;

    static double weightGrams = 475;
    static String countryOfOrigin = "Japan";
    static double rating = 4.6;


    public static void main(String[] args) {

        // ===== LOCAL VARIABLES =====
        String brand = "Local Cam";
        String model = "Snap 20";
        String colour = "Grey";
        String cameraType = "Compact";

        int resolutionMP = 16;
        int opticalZoomX = 2;
        int digitalZoomX = 4;

        String sensorType = "CCD";
        String lensMount = "Fixed";
        boolean flashAvailable = false;

        boolean wifi = false;
        boolean bluetooth = false;
        boolean videoRecording = true;

        String videoResolution = "HD";
        int batteryShots = 300;

        double weightGrams = 350;
        String countryOfOrigin = "China";
        double rating = 3.7;


        // ===== STATIC PRINT =====
        System.out.println("---- STATIC VARIABLES ----");
        System.out.println("Brand: " + DigitalCamera.brand);
        System.out.println("Model: " + DigitalCamera.model);
        System.out.println("Colour: " + DigitalCamera.colour);
        System.out.println("Camera Type: " + DigitalCamera.cameraType);
        System.out.println("Resolution: " + DigitalCamera.resolutionMP);
        System.out.println("Optical Zoom: " + DigitalCamera.opticalZoomX);
        System.out.println("Digital Zoom: " + DigitalCamera.digitalZoomX);
        System.out.println("Sensor: " + DigitalCamera.sensorType);
        System.out.println("Lens Mount: " + DigitalCamera.lensMount);
        System.out.println("Flash: " + DigitalCamera.flashAvailable);
        System.out.println("WiFi: " + DigitalCamera.wifi);
        System.out.println("Bluetooth: " + DigitalCamera.bluetooth);
        System.out.println("Video Recording: " + DigitalCamera.videoRecording);
        System.out.println("Video Resolution: " + DigitalCamera.videoResolution);
        System.out.println("Battery Shots: " + DigitalCamera.batteryShots);
        System.out.println("Weight: " + DigitalCamera.weightGrams);
        System.out.println("Country: " + DigitalCamera.countryOfOrigin);
        System.out.println("Rating: " + DigitalCamera.rating);


        // ===== LOCAL PRINT =====
        System.out.println("\n---- LOCAL VARIABLES ----");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Colour: " + colour);
        System.out.println("Camera Type: " + cameraType);
        System.out.println("Resolution: " + resolutionMP);
        System.out.println("Optical Zoom: " + opticalZoomX);
        System.out.println("Digital Zoom: " + digitalZoomX);
        System.out.println("Sensor: " + sensorType);
        System.out.println("Lens Mount: " + lensMount);
        System.out.println("Flash: " + flashAvailable);
        System.out.println("WiFi: " + wifi);
        System.out.println("Bluetooth: " + bluetooth);
        System.out.println("Video Recording: " + videoRecording);
        System.out.println("Video Resolution: " + videoResolution);
        System.out.println("Battery Shots: " + batteryShots);
        System.out.println("Weight: " + weightGrams);
        System.out.println("Country: " + countryOfOrigin);
        System.out.println("Rating: " + rating);
    }
}