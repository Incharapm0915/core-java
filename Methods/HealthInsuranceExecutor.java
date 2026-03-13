public class HealthInsuranceExecutor {
    public static void main(String[] health) {
        double premium = HealthInsurance.searchInsurancePremium("SBI");
        System.out.println("Premium: " + premium);
    }
}