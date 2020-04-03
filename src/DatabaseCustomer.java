import java.util.ArrayList;
/**
 * Write a description of class DatabaseCustomer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseCustomer {
    // instance variables - replace the example below with your own
    // private static String[] listFood;
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    /**
     * Constructor for objects of class DatabaseCustomer
     */
    public DatabaseCustomer() {
        // initialise instance variables

    }

    public static ArrayList<Customer> getCustomerDatabase() {
        return CUSTOMER_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Customer getCustomerById(int id) {
        Customer customer = CUSTOMER_DATABASE.get(id);
        if (customer != null) {
            return customer;
        }
        return null;
    }

    public static boolean addCustomer(Customer customer) {
        // initialise instance variables
        boolean sameEmail= false;
        for (Customer i : CUSTOMER_DATABASE) {
            if (customer.getEmail() == i.getEmail()) {
                sameEmail = true;
            }
        }

        if (!sameEmail) {
            CUSTOMER_DATABASE.add(customer);
            lastId = customer.getId();
            return true;
        }
        return false;
    }

    /**
     * An example of a method - replace this comment with your own
     * <p>
     * a sample parameter for a method
     *
     * @return the sum of x and y
     */
    public static boolean removeCustomer(int id) {
        // put your code here
        Customer customer = CUSTOMER_DATABASE.get(id);
        if (customer != null) {
            CUSTOMER_DATABASE.remove(customer);
            return true;
        }
        return false;
    }

    //public static Customer getCustomer()
//    {
//        return null;
//    }
//
//    public static String[] getListCustomer ()
//    {
//        return listFood;
//    }
}
