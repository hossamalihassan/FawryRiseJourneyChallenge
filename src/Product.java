public class Product {
    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getQuantity() { return this.quantity; }
    public String getName() { return this.name; }
    public double getPrice() { return this.price; }
    public boolean decreaseQuantity(int amount) {
        if(this.quantity < amount) { return false; }

        quantity -= amount;
        return true;
    }
}
