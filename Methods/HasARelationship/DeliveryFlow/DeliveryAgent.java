class DeliveryAgent {
    public static void reachDoorStep() {
        System.out.println("DeliveryAgent: Reached customer doorstep");
        SignaturePortal.collectESign();
    }
}