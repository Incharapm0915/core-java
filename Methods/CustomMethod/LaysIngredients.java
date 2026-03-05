class LaysIngredients {

    // Static variables
    static String laysName = "American Style Cream";

    static String ingredients[] = {
        "Potatoes",
        "Edible Vegetable Oil",
        "Palmolein Oil",
        "Salt",
        "Sugar",
        "Spices",
        "Onion Powder",
        "Garlic Powder",
        "Chilli Powder",
        "Black Pepper",
        "Cheese Powder",
        "Milk Solids",
        "Corn Flour",
        "Wheat Flour",
        "Starch",
        "Maltodextrin",
        "Flavour Enhancers",
        "Acidity Regulator",
        "Antioxidant",
        "Natural Flavours",
        "Artificial Flavours",
        "Yeast Extract",
        "Tomato Powder",
        "Citric Acid",
        "Food Colour"
    };

    public static void main(String[] arg){
        System.out.println("Lays name is: " + laysName);
        getIngredients();
    }

    // Method to print ingredients
    static void getIngredients(){
        System.out.println("Ingredients List:");
        for(String item : ingredients){
            System.out.println(item);
        }
    }
}