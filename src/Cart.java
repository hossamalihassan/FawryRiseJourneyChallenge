import java.util.ArrayList;

public class Cart {
    ArrayList<Product> productsInCart;

    Cart() {
        ArrayList<Product> productsInCart = new ArrayList<>();
    }

    public void add(Product product, int quantity) {
        product.decreaseQuantity(quantity);
        productsInCart.add(product);
    }
}
