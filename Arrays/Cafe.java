class Cafe{

    public static void main(String[] cafe) {
        
    String masalaChaha="Masala Chaha";
    String gingerChaha="Ginger Chaha";
    String lemonChaha="Lemon Chaha";
    String greenChaha="Green Chaha";
    String blackChaha="Black Chaha";
    String milkChaha="Milk Chaha";
    String cardamomChaha="Cardamom Chaha";
    String elaichiChaha="Elaichi Chaha";

    String espresso="Espresso";
    String americano="Americano";
    String latte="Latte";
    String cappuccino="Cappuccino";
    String frappe="Frappe";
    String blackCoffee="Black Coffee";  

    String samosa="Samosa";
    String vadaPav="Vada Pav";
    String pavBhaji="Pav Bhaji";
    String dhokla="Dhokla";
    String kachori="Kachori";
    String springRolls="Spring Rolls";
    String sandwich="Sandwich";
    String frenchFries="French Fries";
    String burger="Burger";
    String pizza="Pizza";
    String hotDog="Hot Dog";    

    //Datatype refName = refValue;
    String cafeName = "Reeola Cafe";
    String teaNames[]={masalaChaha,gingerChaha,lemonChaha,greenChaha,blackChaha,milkChaha,cardamomChaha,elaichiChaha};
    String coffeeNames[]={espresso,americano,latte,cappuccino,frappe,blackCoffee};
    String snacks[]={samosa,vadaPav,pavBhaji,dhokla,kachori,springRolls,sandwich,frenchFries,burger,pizza,hotDog};
   
    System.out.println("Cafe Name: " + cafeName);
    System.out.println("List of Different Tea Names available:");
    for(String tea: teaNames){
        System.out.println(tea);
    }
    System.out.println("List of Different Coffee Names available:");
    for(String coffee: coffeeNames){
        System.out.println(coffee);
    }
    System.out.println("List of Different Snacks available:");
    for(String snack: snacks){
        System.out.println(snack);
    }
    
    
    String teaNames1[]={"Masala Chaha","Ginger Chaha","Lemon Chaha","Green Chaha","Black Chaha","Milk Chaha","Cardamom Chaha","Elaichi Chaha"};
    System.out.println(teaNames1[0]+"\n"+teaNames1[1]+"\n"+teaNames1[2]+"\n"+teaNames1[3]+"\n"+teaNames1[4]+"\n"+teaNames1[5]+"\n"+teaNames1[6]+"\n"+teaNames1[7]);

    String coffeeNames1[]={"Espresso","Americano","Latte","Cappuccino","Frappe","Black coffee"};
    System.out.println(coffeeNames1[0]+"\n"+coffeeNames1[1]+"\n"+coffeeNames1[2]+"\n"+coffeeNames1[3]+"\n"+coffeeNames1[4]+"\n"+coffeeNames1[5]);

    String snacks1[]={"Samosa","Vada Pav","Pav Bhaji","Dhokla","Kachori","Spring Rolls","Sandwich","French Fries","Burger","Pizza","Hot Dog"};
    System.out.println(snacks1[0]+"\n"+snacks1[1]+"\n"+snacks1[2]+"\n"+snacks1[3]+"\n"+snacks1[4]+"\n"+snacks1[5]+"\n"+snacks1[6]+"\n"+snacks1[7]+"\n"+snacks1[8]+"\n"+snacks1[9]+"\n"+snacks1[10]);

    
    }

}