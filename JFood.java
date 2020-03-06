
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
        
        
        Location location2 = new Location ("Curup", "Bengkulu", "daerah");
        Seller seller2 = new Seller (2, "Muhammad Ilham Akbar", "muhilham@gmail.com", "085803324064",location2);
        Food food2 = new Food (1,"Nasi Goreng", seller2, 45000, FoodCategory.RICE);
        
        Customer customer2 = new Customer (1, "Timothy", "timothy@gmail.com", "123","2020-01-01"); 
        Invoice invoice = new Invoice (food2.getId(),1, "2020-01-01", customer2, food2.getPrice(), InvoiceStatus.FINISHED);
        invoice.printData();
       
        //food2.printData();
        
       //for (FoodCategory i : FoodCategory.values()){
        //   System.out.println("coba 1 : " + i + " coba 2 :" + i.name());
        //}
        
       //DatabaseFood.addFood(food2);
       
        
        
        
       
    }
}
