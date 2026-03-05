class Salon{
     static String salonNames[]={"Lakme", "VLCC", "Shahnaz Husain", "Jawed Habib", "Naturals", "Green Trends", "BBlunt", "Enrich", "Toni&Guy", "Jean-Claude Biguine"};
     public static void getSalonNames() {
          System.out.println("List of Salons:");
          for (String salonName : salonNames) {
               System.out.println(salonName);
          }
          System.out.println("end of getSalonNames");
     }    
}