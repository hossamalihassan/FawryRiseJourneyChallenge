import java.util.ArrayList;
import java.util.HashMap;

public class Cart {
    HashMap<Product, Integer> productsInCart;

    Cart() {
        this.productsInCart = new HashMap<>();
    }

    public void add(Product product, int quantity) {
        productsInCart.put(product, quantity);
    }

    public HashMap<Product, Integer> getProductsInCart() {
        return productsInCart;
    }
}
