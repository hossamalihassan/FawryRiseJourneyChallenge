import java.util.Calendar;
import java.util.Date;


public class Main {

    public static Date getDate(int numOfDays) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, numOfDays);
        return cal.getTime();
    }

    public static void checkout(Customer customer, Cart cart) {
        // if cart is empty
        if(cart.getProductsInCart().isEmpty()) {
            System.out.println("There are no products in this cart.");
        }

        // if any product is expired of out-of-stock

        // check if the customer's balance is insufficient

    }

    public static void main(String[] args) {
        // customer logged-in
        Customer ahmed = new Customer(
                "Ahmed Ali", "ahmed_ali@store.com", "Smart Village", 1000
        );

        // in-stock and not expired products
        // create an expiry date 5 days from now
        Date expiryDate = getDate(7);
        ExpirableShippableProduct cheese = new ExpirableShippableProduct("Cheese", 20.0, 5, expiryDate, 1.5);
        ExpirableProduct biscuits = new ExpirableProduct("Biscuits", 5.0, 10, expiryDate);
        ShippableProduct tv = new ShippableProduct("TV", 300.0, 2, 15.0);
        Product mobile = new Product("Mobile", 500.0, 3);
        Product scratchCard = new Product("Mobile Scratch Card", 10.0, 20);

        // out-of-stock products and expired
        // create an expiry date from previous two days
        Date expiredDate = getDate(-2);
        ExpirableProduct milk = new ExpirableProduct("Milk", 3.5, 0, expiredDate);
        Product laptop = new Product("Mobile", 500.0, 0);

        // create a cart
        Cart cart = new Cart();
        cart.add(cheese, 3);
        cart.add(tv, 3);
        cart.add(scratchCard, 1);

    }
}