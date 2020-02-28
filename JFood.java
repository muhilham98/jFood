
/**
 * <h1>JFood Program based on Object Oriented Programming<h1>
 * The JFood program implements an application that used to
 * order food and processing related data
 * <p>
 * @author Muhammad Ilham Akbar
 * @version 1.0
 * @since 2020-02-27
 */
public class JFood
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class JFood
     */
    public JFood()
    {
        
    }

   
    public static void main(String[] args)
    {
        Location location1 = new Location("Depok", "Jabar","daerah");
        Seller seller1 = new Seller(1, "ilham", "ilham@gmail.com", "085803", location1);
        Food nasi = new Food(1, "putih", seller1, 1000, "pokok");
        Customer customer1 = new Customer(1, "Ilham", "ilham@gmail.com", "123","12 Feb 2020");
        Invoice invoice1 = new Invoice(1,2, "12 Feb 2019", customer1,2000);
        location1.printData();
        location1.setCity("Kebumen");
        System.out.println(invoice1.getCustomer());
        
        
       
    }
}
