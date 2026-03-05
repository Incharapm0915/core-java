class HPDeskJet2331Executor {

    public static void main(String[] args) {

        System.out.println("Main started");

        String name = HPDeskJet2331.getProductName();
        System.out.println("Product Name: " + name);

        String brand = HPDeskJet2331.getBrand();
        System.out.println("Brand: " + brand);

        double price = HPDeskJet2331.getPrice();
        System.out.println("Price: ₹" + price);

        String color = HPDeskJet2331.getColor();
        System.out.println("Color: " + color);

        String functions = HPDeskJet2331.getFunctions();
        System.out.println("Functions: " + functions);

        String tech = HPDeskJet2331.getPrintTechnology();
        System.out.println("Print Technology: " + tech);

        String resolution = HPDeskJet2331.getPrintResolution();
        System.out.println("Print Resolution: " + resolution);

        String speed = HPDeskJet2331.getPrintSpeed();
        System.out.println("Print Speed: " + speed);

        String paper = HPDeskJet2331.getPaperSize();
        System.out.println("Supported Paper Size: " + paper);

        String connectivity = HPDeskJet2331.getConnectivity();
        System.out.println("Connectivity: " + connectivity);

        String ink = HPDeskJet2331.getCompatibleInk();
        System.out.println("Compatible Ink: " + ink);

        String warranty = HPDeskJet2331.getWarranty();
        System.out.println("Warranty: " + warranty);

        System.out.println("Main ended");
    }
}