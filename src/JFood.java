
import java.util.*;
import java.text.SimpleDateFormat;
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
        
        
        //Location location2 = new Location ("Curup", "Bengkulu", "daerah");
        //Seller seller2 = new Seller (2, "Muhammad Ilham Akbar", "muhilham@gmail.com", "085803324064",location2);
        //Food food2 = new Food (1,"Nasi Goreng", seller2, 45000, FoodCategory.RICE);
        
        
       // Invoice invoice = new Invoice (1,food2.getId(), "2020-01-01", customer2, food2.getPrice(), InvoiceStatus.FINISHED);
        //invoice.printData();
       
       // food2.printData();
        
       //for (FoodCategory i : FoodCategory.values()){
        //   System.out.println("coba 1 : " + i + " coba 2 :" + i.name());
        //}
        
       //DatabaseFood.addFood(food2);
       Location location2 = new Location ("Curup", "Bengkulu", "daerah");
       Seller seller2 = new Seller (2, "Zafran", "zafran@gmail.com", "085803324064",location2);
       //Customer customer2 = new Customer (1, "Ilham", "ilham@gmail.com", "123","2020-01-01"); 
       Promo promo2 = new Promo (1, "123", 5000, 20000, true); 
       Food food1 = new Food (1,"Nasi Ayam", seller2, 15000, FoodCategory.RICE);
       Food food2 = new Food (1,"Nasi Goreng", seller2, 45000, FoodCategory.RICE);
       //Food food3 = new Food (1,"Nasi Putih", seller2, 20000, FoodCategory.RICE);
       //CashlessInvoice invoice1 = new  CashlessInvoice (1, food1, "2020-01-01", customer2, InvoiceStatus.ONGOING);
       //CashlessInvoice invoice2 = new  CashlessInvoice (1, food2, "2020-01-01", customer2, InvoiceStatus.ONGOING, promo2);
       //CashlessInvoice invoice3 = new  CashlessInvoice (1, food3, "2020-01-01", customer2, InvoiceStatus.ONGOING, promo2);
       
       //invoice1.setTotalPrice();
       //invoice2.setTotalPrice();
       //invoice3.setTotalPrice();
       //invoice1.printData();
       //invoice2.printData();
       //invoice3.printData();
       
       
       
       
       //invoice4.setTotalPrice();
       //invoice5.setTotalPrice();
       //invoice4.printData();
       //invoice5.printData();
       
       Calendar cal1 = new  GregorianCalendar(2020,3,19);
       
       Customer customer1 = new Customer (1, "ilham", ".ilham@gmail.com", "123456", cal1);
       Customer customer2 = new Customer (2, "Muhlis", "muhlis@gmail.com", "M12345m", new  GregorianCalendar(2020,3,19));
       Customer customer3 = new Customer (3, "Fahmi", "fahmi@gmail.com", "3M2345m");
       
       CashInvoice  invoice4 = new  CashInvoice(4, food1, customer2, InvoiceStatus.FINISHED, 1000);
       CashlessInvoice  invoice5 = new  CashlessInvoice(5, food2, customer2, InvoiceStatus.FINISHED, promo2);
       
       invoice4.setTotalPrice();
       invoice5.setTotalPrice();
       System.out.println(invoice4.toString());
       System.out.println(invoice5.toString());
      
       
       
       
        
        
        
       
    }
}
