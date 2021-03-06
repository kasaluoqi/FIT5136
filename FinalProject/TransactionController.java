import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.List;

public class TransactionController {
    //For owner
    public static Order viewOrder(int index) {
        return Transaction.viewOrder(index);
    }

    //For customer
    public static Order viewOrder(Customer customer, int index) {
        return Transaction.viewOrder(customer, index);
    }

    //Show All
    public static List<Order> viewOrders(Customer customer) {
        return Transaction.viewOrders(customer);
    }

    public static List<Order> viewOrders() {
        return Transaction.viewOrders();
    }

    /**
     * Get the information from database
     * @throws FileNotFoundException
     * @throws ParseException
     */
    public static void readFile() throws FileNotFoundException, ParseException {
        Transaction.readFile();
    }

    /**
     * Save transaction information.
     * @throws FileNotFoundException
     */
    public static void writeFile() throws FileNotFoundException {
        Transaction.writeFile();
    }
}
