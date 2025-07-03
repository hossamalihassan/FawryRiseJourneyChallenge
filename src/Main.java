import java.util.Calendar;
import java.util.Date;


public class Main {

    public Date getCurrentDate() {
        // create an expiry date 5 days from now
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 7);
        return cal.getTime();
    }

    public static void main(String[] args) {
        Customer ahmed = new Customer(
                "Ahmed Ali", "ahmed_ali@store.com", "Smart Village", 1000
        );


    }
}