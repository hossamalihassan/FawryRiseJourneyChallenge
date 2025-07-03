public class Customer {
    String name;
    String email;
    String address;
    double balance;

    Customer(String name, String email, String address,  double balance) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
