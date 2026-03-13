class Hospital {
    public static void bookAppointment(String patientName, String symptom) {
        System.out.println("Hospital scheduled appointment");
        Nurse.basicCheck(patientName, symptom, 120, 90);
    }
}
