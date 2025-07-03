import java.util.Date;

public class ExpirableShippableProduct extends ExpirableProduct implements Shippable {
    double weight;

    ExpirableShippableProduct(String name, double price, int quantity, Date expiryDate, double weight) {
        super(name,  price, quantity, expiryDate);
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }
}
