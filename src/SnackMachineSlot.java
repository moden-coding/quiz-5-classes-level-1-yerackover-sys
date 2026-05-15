public class SnackMachineSlot {
    private String snack;
    private double price;
    private int quantity;
    private int itemsSold;

    public SnackMachineSlot(String givenItemName, double initialPrice, int initialQuantity) {
        this.snack = givenItemName;
        if (initialPrice < 0) {
            this.price = 0.0;
        } else {
            this.price = initialPrice;
        }
        if (initialQuantity < 0) {
            this.quantity = 0;
        } else {
            this.quantity = initialQuantity;
        }
        itemsSold = 0;
    }

    public void purchaseOne() {
        if (quantity > 0) {
            quantity = quantity - 1;
            itemsSold = itemsSold + 1;
        }
    }

    public String toString() {
        return "Item: " + snack + ", Price: " + price + ", In Stock: " + quantity;
    }

    public double getRevenue() {
        return itemsSold * price;
    }

}
