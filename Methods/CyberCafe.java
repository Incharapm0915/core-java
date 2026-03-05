class CyberCafe{

    static String teaNames[]={"Masala Chaha","Ginger Chaha","Lemon Chaha","Green Chaha","Black Chaha","Milk Chaha","Cardamom Chaha","Elaichi Chaha"};
    static String coffeeNames[]={"Espresso","Americano","Latte","Cappuccino","Frappe","Black Coffee"};
    static String snacks[]={"Samosa","Vada Pav","Pav Bhaji","Dhokla","Kachori","Spring Rolls","Sandwich","French Fries","Burger","Pizza","Hot Dog"};

    public static void main(String[] cafe) {   

    //Datatype refName = refValue;
    String cafeName = "Reeola Cafe";
    System.out.println("Cafe Name: " + cafeName);

    getteaNames();
    getcoffeeNames();
    getsnacks();
    }
    static void getteaNames(){
    System.out.println("List of Different Tea Names available:");
    for(String tea: teaNames){
        System.out.println(tea);
    }
    }
    static void getcoffeeNames(){
    System.out.println("List of Different Coffee Names available:");
    for(String coffee: coffeeNames){
        System.out.println(coffee);
    }
    }   
    static void getsnacks(){
    System.out.println("List of Different Snacks available:");
    for(String snack: snacks){
        System.out.println(snack);
    
    }
    
    }
}