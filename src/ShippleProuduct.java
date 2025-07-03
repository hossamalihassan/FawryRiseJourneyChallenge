public class ShippleProuduct extends Product implements Shippable {
    double weight;

    ShippleProuduct(double weight, String name, double price, int quantity) {
        super(name, price, quantity);
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }
}
