class Dmart{
        static String DmartItems[]={"Grocery", "Electronics", "Clothing", "Home Appliances", "Toys", "Furniture", "Stationery", "Footwear", "Sports Equipment", "Books"};
        public static void getDmartItems() {
             System.out.println("List of Items in Dmart:");
             for (String DmartItem : DmartItems) {
                  System.out.println(DmartItem);
             }
             System.out.println("end of getDmartItems");
        }   
}
