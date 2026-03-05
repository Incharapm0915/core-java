class HeadsetExecutor{
    public static void main(String[] args) { 
    System.out.println("Main started");
    
    String brand = Headset.getBrand();
    System.out.println("The headset brand is " +brand);

    double price = Headset.getPrice();
    System.out.println("The headset price is " +price);

    String color = Headset.getColor();
    System.out.println("The headset color is " +color);

    }
    
}