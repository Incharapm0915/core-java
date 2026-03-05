class Gym {
     static String equipmentNames[]={"Treadmill","Dumbbells","Bench Press","Squat Rack","Leg Press","Lat Pulldown","Cable Machine","Exercise Bike","Rowing Machine","Kettlebells"};
     public static void getEquipmentNames() {
          System.out.println("List of Gym Equipment:");
          for (String equipmentName : equipmentNames) {
               System.out.println(equipmentName);
          }
          System.out.println("end of getEquipmentNames");
     }    
}