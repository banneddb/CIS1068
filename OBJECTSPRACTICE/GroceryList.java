import java.util.Arrays;

class GroceryList {
    private GroceryItems[] items;
    private int numItems;
    private final int INITIAL_CAPACITY = 10;

    public GroceryList() {
        items = new GroceryItems[INITIAL_CAPACITY];
        numItems = 0;
    }

    public void addItem(GroceryItems newItem) {
        if (numItems >= items.length) {
            items = Arrays.copyOf(items, items.length * 2); 
        }
        items[numItems] = newItem;
        numItems++;
    }
    public String toString() {
        String printedList = "";
        for (int i = 0; i < numItems; i++) {
            printedList += items[i];
        }
        return printedList;
    }
    public int find(String itemSeach) {
        for (int i = 0; i < numItems; i++) {
            if (itemSeach.equalsIgnoreCase(items[i].getName())) {
                return i;
            }
        }
        return -1;
    }
    public GroceryItems getItem(int index) {
        for (int i=0; i< numItems; i++) {
            if (index == i) {
                return items[i];
            }
        }
        return null;
    }
    public void removeItem(int index) {
        for (int i = index; i < numItems -1; i++) {
            items[i] = items[i+1];
        }
    items[numItems - 1] = null;
    }
    public int totalQuantity() {
        int totalQuantity = 0;
        for (int i = 0; i<numItems; i++) {
            totalQuantity += items[i].getQuantity();
        }
        return totalQuantity;
    }
    public double totalEstimatedCost() {
        double totalEstimatedCost = 0;
        for (int i = 0; i<numItems; i++) {
            totalEstimatedCost += items[i].totalEstimatedPrice();
        }
        return totalEstimatedCost;
    }
    public String[] itemsInCategory(String category) {
        int arrayLength = 0;
        for (int i = 0; i < numItems; i++) {
            if (items[i].getCategory().equalsIgnoreCase(category)) arrayLength++;
        }
    
        String[] itemsInCategory = new String[arrayLength];
        int index = 0;
        for (int i = 0; i < numItems; i++) {
            if (items[i].getCategory().equalsIgnoreCase(category)) {
                itemsInCategory[index++] = items[i].getName();
            }
        }
        return itemsInCategory;
    }
}
    
    
    
    
    
    
    
