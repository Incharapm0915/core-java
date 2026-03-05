class Mall{
    static String mallNames[]={"Mantri Mall", "Orion Mall", "Dubai Mall", "Phoenix Mall of Asia", "Garuda Mall", "GT Mall", "LULU Mall"};

    public static void getMallNames() {
        System.out.println("List of Malls:");
        for (String mallName : mallNames) {
            System.out.println(mallName);
        }
        System.out.println("end of getMallNames");
    }
}