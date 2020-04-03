import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
//       Location location2 = new Location ("Curup", "Bengkulu", "daerah");
//       Seller seller2 = new Seller (2, "Zafran", "zafran@gmail.com", "085803324064",location2);
//       //Customer customer2 = new Customer (1, "Ilham", "ilham@gmail.com", "123","2020-01-01");
//       Promo promo2 = new Promo (1, "123", 5000, 20000, true);
//       Food food1 = new Food (1,"Nasi Ayam", seller2, 15000, FoodCategory.RICE);
//       Food food2 = new Food (1,"Nasi Goreng", seller2, 45000, FoodCategory.RICE);
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
       
//       Calendar cal1 = new  GregorianCalendar(2020,3,19);
//
//       Customer customer1 = new Customer (1, "ilham", ".ilham@gmail.com", "123456", cal1);
//       Customer customer2 = new Customer (2, "Muhlis", "muhlis@gmail.com", "M12345m", new  GregorianCalendar(2020,3,19));
//       Customer customer3 = new Customer (3, "Fahmi", "fahmi@gmail.com", "3M2345m");
//
//       CashInvoice  invoice4 = new  CashInvoice(4, food1, customer2, InvoiceStatus.FINISHED, 1000);
//       CashlessInvoice  invoice5 = new  CashlessInvoice(5, food2, customer2, InvoiceStatus.FINISHED, promo2);
//
//       invoice4.setTotalPrice();
//       invoice5.setTotalPrice();
//       System.out.println(invoice4.toString());
//       System.out.println(invoice5.toString());



        Location lokasi1 = new Location("Kebumen", "Jateng", "Jawa");
        Location lokasi2 = new Location("Curup", "Bengkulu", "Sumatra");
        DatabasePromo.addPromo((new Promo(1, "123", 2000, 3000, false)));
        DatabasePromo.addPromo((new Promo(1, "123", 2000, 3000, true)));


        DatabaseSeller.addSeller(new Seller(1, "akbar", "akbar@gmail.com", "0811111", lokasi1));
        DatabaseSeller.addSeller(new Seller(2, "muhammad", "muhamad@gmail.com", "0822222", lokasi2));

        DatabaseFood.addFood(new Food(1, "Kopi hitam", DatabaseSeller.getSellerById(1), 6000, FoodCategory.COFFEE));
        DatabaseFood.addFood(new Food(2, "Mochacino", DatabaseSeller.getSellerById(2), 4000, FoodCategory.COFFEE));
        DatabaseFood.addFood(new Food(3, "Mie ayam", DatabaseSeller.getSellerById(3), 17000, FoodCategory.NOODLES));

        DatabaseCustomer.addCustomer(new Customer(1,"ilham","ilham@gmail.com", "aA345678"));
        DatabaseCustomer.addCustomer(new Customer(2,"ilham","ilham@gmail.com", "12345678"));
        DatabaseCustomer.addCustomer(new Customer(3,"Gilang","gilang@gmail.com", "1234567"));


      // CashlessInvoice invoice1 = new CashlessInvoice(1, DatabaseFood.getFoodDatabase(), DatabaseCustomer.getCustomerById(1), InvoiceStatus.ONGOING, DatabasePromo.getPromoById(1));
       // CashInvoice invoice2 = new CashInvoice(1, DatabaseFood.getFoodDatabase(), DatabaseCustomer.getCustomerById(2), InvoiceStatus.ONGOING, 2000);
       // CashInvoice invoice3 = new CashInvoice(2, DatabaseFood.getFoodDatabase(), DatabaseCustomer.getCustomerById(2), InvoiceStatus.ONGOING, 3000);

//        for (int i=0; i<DatabaseCustomer.getCustomerDatabase().size();i++){
//
//            System.out.println(DatabaseCustomer.getCustomerById(i).getName());
//        }
//
//        for ( int i=0 ; i<DatabaseFood.getFoodByCategory(FoodCategory.COFFEE).size(); i++){
//
//            System.out.println(DatabaseFood.getFoodByCategory(FoodCategory.COFFEE).get(i).getName());
//        }

//        for (Customer i: DatabaseCustomer.getCustomerDatabase()){
//
//            System.out.println(i);
//        }
//
//        for ( Food i : DatabaseFood.getFoodByCategory(FoodCategory.COFFEE)){
//
//            System.out.println(i);
//        }
        ArrayList<Food> food1 = new ArrayList();
        ArrayList<Food> food2 = new ArrayList();
        DatabaseInvoice.addInvoice(new CashInvoice(2, DatabaseFood.getFoodDatabase(), DatabaseCustomer.getCustomerById(2), 2000));

        for (Promo i: DatabasePromo.getPromoDatabase()){

            System.out.println(i);
        }




    }



}
