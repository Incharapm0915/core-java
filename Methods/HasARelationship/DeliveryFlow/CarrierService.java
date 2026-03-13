class CarrierService {
    public static void pickUpPackage() {
        System.out.println("CarrierService: Package picked up");
        HubRouter.sortToZipCode();
    }
}