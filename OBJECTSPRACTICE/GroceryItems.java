class GroceryItems {
    private String name;
    private int quantity;
    private double estimatedPrice;
    final private String category;

    public GroceryItems(String productName, int productQuantity, double productPrice, String productCategory) {
        this.name = productName;
        this.quantity = productQuantity;
        this.estimatedPrice = productPrice;
        this.category = productCategory;    
    }
    public int increaseQuantity(int amount) {
        quantity+= amount;
        return quantity;
    }
    public int decreaseQuantity(int amount) {
        quantity+= amount;
        return quantity; 
    }
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getCategory() {
        return category;
    }
    public double totalEstimatedPrice() {
        double totalEstimatedPrice = quantity * estimatedPrice;
        return totalEstimatedPrice;
    }
}
