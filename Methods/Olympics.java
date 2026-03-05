class Olympics {
     static String sportNames[]={"Basketball", "Football", "Swimming", "Athletics", "Tennis", "Boxing", "Gymnastics", "Volleyball", "Wrestling", "Cycling"};
     public static void getSportNames() {
          System.out.println("List of Sports in Olympics:");
          for (String sportName : sportNames) {
               System.out.println(sportName);
          }
          System.out.println("end of getSportNames");
     }    
}
