class Nurse {
    public static void basicCheck(String patientName, String symptom, int bp, int sugar) {
        System.out.println("Nurse checking BP and Sugar");
        Doctor.treat(patientName, symptom);
    }
}