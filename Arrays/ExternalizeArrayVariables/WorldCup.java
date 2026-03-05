class WorldCup {

    public static void main(String[] args){
        String india="India";
        String australia="Australia";
        String pakistan="Pakistan";
        String newZealand="New Zealand";
        String sriLanka="Sri Lanka";
        String groupA[]={india,australia,pakistan,newZealand,sriLanka};
        
        String england="England";
        String southAfrica="South Africa";
        String bangladesh="Bangladesh";
        String afghanistan="Afghanistan";
        String netherlands="Netherlands";
        String groupB[]={england,southAfrica,bangladesh,afghanistan,netherlands};
        
        String westIndies="West Indies";
        String ireland="Ireland";
        String zimbabwe="Zimbabwe";
        String scotland="Scotland";
        String uae="UAE";
        String groupC[]={westIndies,ireland,zimbabwe,scotland,uae};
 
        String nepal="Nepal";
        String namibia="Namibia";
        String oman="Oman";
        String usa="USA";
        String canada="Canada";
        String groupD[]={nepal,namibia,oman,usa,canada};

        System.out.println("Group A:");
        for(String team : groupA){
            System.out.println(team);
        }

        System.out.println("\nGroup B:");
        for(String team : groupB){
            System.out.println(team);
        }

        System.out.println("\nGroup C:");
        for(String team : groupC){
            System.out.println(team);
        }

        System.out.println("\nGroup D:");
        for(String team : groupD){
            System.out.println(team);
        }
    }
}