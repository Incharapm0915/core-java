class Tourism {
     static String touristPlaces[]={"Taj Mahal", "Goa Beaches", "Kerala Backwaters", "Jaipur Palaces", "Rishikesh", "Mysore Palace", "Hampi Ruins", "Andaman Islands", "Varanasi Ghats", "Sikkim Monasteries"};
     public static void getTouristPlaces() {
          System.out.println("List of Tourist Places:");
          for (String touristPlace : touristPlaces) {
               System.out.println(touristPlace);
          }
          System.out.println("end of getTouristPlaces");
     }    
}