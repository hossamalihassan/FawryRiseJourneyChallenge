import java.util.Date;

public class ExpirableShippableProduct extends ShippableProduct implements Shippable {
    Date expiryDate;

    ExpirableShippableProduct(String name, double price, int quantity, Date expiryDate, double weight) {
        super(name, price, quantity, weight);
        this.expiryDate = expiryDate;
    }
}
