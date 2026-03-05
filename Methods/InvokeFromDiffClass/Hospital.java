class Hospital{
     static String doctorNames[]={"Orthopedician","Cardiologist","Neurologist","Pediatrician","Dermatologist","Gynecologist","Psychiatrist","Oncologist","Radiologist","Anesthesiologist"};
     public static void getDoctorNames() {
          System.out.println("List of Doctors:");
          for (String doctorName : doctorNames) {
               System.out.println(doctorName);
          }
          System.out.println("end of getDoctorNames");
     }    
}