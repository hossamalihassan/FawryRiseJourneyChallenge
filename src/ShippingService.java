import java.util.ArrayList;

public class ShippingService {
    ArrayList<ShippableProduct> shippableProducts;
    double shippingFee;
    double maxWeight;

    ShippingService(double shippingFee, double maxWeight) {
        this.shippingFee = shippingFee;
        this.maxWeight = maxWeight;
    }

    boolean ship(ArrayList<ShippableProduct> shippableProducts) {
        return true;
    }

    public double getShippingFee() {
        return shippingFee;
    }

    public double getMaxWeight() {
        return maxWeight;
    }
}
