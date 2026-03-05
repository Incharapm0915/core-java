class LEDTV {

    // ===== STATIC VARIABLES =====
    static String brand = "Samsung";
    static String screenSize = "43 Inch";
    static String displayType = "4K UHD";
    static String colour = "Black";

    static boolean smartTV = true;
    static int refreshRateHz = 60;
    static String soundTechnology = "Dolby Audio";

    static String connectivity = "WiFi, HDMI, USB";
    static double rating = 4.5;


    public static void main(String[] args) {

        // ===== LOCAL VARIABLES =====
        String brand = "Local TV";
        String screenSize = "32 Inch";
        String displayType = "HD Ready";
        String colour = "Grey";

        boolean smartTV = false;
        int refreshRateHz = 50;
        String soundTechnology = "Stereo Speakers";

        String connectivity = "HDMI Only";
        double rating = 3.9;


        // ===== STATIC PRINT =====
        System.out.println("---- STATIC VARIABLES ----");
        System.out.println("Brand: " + LEDTV.brand);
        System.out.println("Screen Size: " + LEDTV.screenSize);
        System.out.println("Display Type: " + LEDTV.displayType);
        System.out.println("Colour: " + LEDTV.colour);
        System.out.println("Smart TV: " + LEDTV.smartTV);
        System.out.println("Refresh Rate: " + LEDTV.refreshRateHz);
        System.out.println("Sound Technology: " + LEDTV.soundTechnology);
        System.out.println("Connectivity: " + LEDTV.connectivity);
        System.out.println("Rating: " + LEDTV.rating);


        // ===== LOCAL PRINT =====
        System.out.println("\n---- LOCAL VARIABLES ----");
        System.out.println("Brand: " + brand);
        System.out.println("Screen Size: " + screenSize);
        System.out.println("Display Type: " + displayType);
        System.out.println("Colour: " + colour);
        System.out.println("Smart TV: " + smartTV);
        System.out.println("Refresh Rate: " + refreshRateHz);
        System.out.println("Sound Technology: " + soundTechnology);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Rating: " + rating);
    }
}