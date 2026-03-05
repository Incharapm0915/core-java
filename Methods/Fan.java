class Fan{
    String brand; //property/field/state/variable/reference

    //method
    void giveAir() //braces indicates method
    {
        //body of method
        System.out.println("Fan is giving air");
    }

    public static void main(String[] args) {
        Fan myFan = new Fan();
        myFan.giveAir();
    }
}
