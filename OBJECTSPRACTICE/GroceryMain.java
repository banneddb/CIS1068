public class GroceryMain {
    public static void main(String[] args) {
        GroceryItems[] items = {
            new GroceryItems("Apple", 10, 0.99, "Fruit"),
            new GroceryItems("Banana", 15, 0.79, "Fruit"),
            new GroceryItems("Carrot", 8, 1.49, "Vegetable"),
            new GroceryItems("Spinach", 5, 2.99, "Vegetable"),
            new GroceryItems("Orange", 12, 1.29, "Fruit")
        };
        GroceryList groceryList = new GroceryList(items);
        String[] fruits = groceryList.itemsInCategory("Fruit");
        for (String item : fruits) {
            System.out.println(item);
        }
        items[0].increaseQuantity(5);
        items[0].decreaseQuantity(5);
        groceryList.totalEstimatedCost();
    }
}
