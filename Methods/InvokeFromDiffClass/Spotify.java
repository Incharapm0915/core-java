class Spotify {
     static String songNames[]={"Blinding Lights","Shape of You","Dance Monkey","Someone You Loved","Rockstar","Sunflower","Bad Guy","Sicko Mode","Old Town Road","Shallow"};
     public static void getSongNames() {
          System.out.println("List of Songs:");
          for (String songName : songNames) {
               System.out.println(songName);
          }
          System.out.println("end of getSongNames");
     }    
}
