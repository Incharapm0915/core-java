class Inchara{
    public static void main(String[] human) {
         String karnataka="Karnataka";
            String kerala="Kerala"; 
            String tamilNadu="Tamil Nadu";
         String properties[]={karnataka,kerala,tamilNadu};

         
       // String properties[]={"Karnataka","Kerala","Tamil Nadu"};
       // not possible as it is not a statement properties[]={"kr puram"};

//for each loop.   external reference variable:property, array name:properties
        for(String property:properties)
            System.out.println(property);

        // for(int anyThing=0;anyThing<properties.length;anyThing++){
            // System.out.println(properties[anyThing]);
    }
}