class WorldCup {

    static String groupA[]={"India","Australia","Pakistan","New Zealand","Sri Lanka"};
    static String groupB[]={"England","South Africa","Bangladesh","Afghanistan","Netherlands"};
    static String groupC[]={"West Indies","Ireland","Zimbabwe","Scotland","UAE"};
    static String groupD[]={"Nepal","Namibia","Oman","USA","Canada"};

    public static void main(String[] args){

        System.out.println("Cricket World Cup Teams");

        getGroupA();
        getGroupB();
        getGroupC();
        getGroupD();
    }

    static void getGroupA(){
        System.out.println("\nGroup A:");
        for(String team : groupA) System.out.println(team);
    }

    static void getGroupB(){
        System.out.println("\nGroup B:");
        for(String team : groupB) System.out.println(team);
    }

    static void getGroupC(){
        System.out.println("\nGroup C:");
        for(String team : groupC) System.out.println(team);
    }

    static void getGroupD(){
        System.out.println("\nGroup D:");
        for(String team : groupD) System.out.println(team);
    }
}