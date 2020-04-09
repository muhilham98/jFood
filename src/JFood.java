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
public class JFood extends Thread
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



//        Location lokasi1 = new Location("Kebumen", "Jateng", "Jawa");
//        Location lokasi2 = new Location("Curup", "Bengkulu", "Sumatra");
        //DatabasePromo.addPromo((new Promo(1, "123", 2000, 3000, false)));
        //DatabasePromo.addPromo((new Promo(1, "123", 2000, 3000, true)));


//        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId()+1, "akbar", "akbar@gmail.com", "0811111", lokasi1));
//        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId()+1, "muhammad", "muhamad@gmail.com", "0822222", lokasi2));
//
//        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1, "Kopi hitam", DatabaseSeller.getSellerById(1), 10000, FoodCategory.COFFEE));
//        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1, "Mochacino", DatabaseSeller.getSellerById(2), 17000, FoodCategory.COFFEE));
//        //DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1, "Latte", DatabaseSeller.getSellerById(2), 4000, FoodCategory.COFFEE));
//        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1, "Mie ayam", DatabaseSeller.getSellerById(3), 17000, FoodCategory.NOODLES));
//
//        DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId()+1,"ilham","ilham@gmail.com", "aA345678"));
//        DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId()+1,"ilham","ilham@gmail.com", "12345678"));
//        DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId()+1,"Gilang","gilang@gmail.com", "Ab1234567"));


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

        //==========================================POST TEST==================================================
//        DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId()+1, "123", 5000, 15000, false));
//        DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId()+1, "123", 5000, 15000, false));
//
//        for (Promo p: DatabasePromo.getPromoDatabase())
//        {
//            System.out.println(p);
//        }
//
//        ArrayList<Food> listPertama = new ArrayList<Food>();
//        listPertama.add(DatabaseFood.getFoodById(1));
//
//        ArrayList<Food> listKedua = new ArrayList<Food>();
//        listKedua.add(DatabaseFood.getFoodById(2));
//
//        DatabaseInvoice.addInvoice( new CashInvoice (DatabaseInvoice.getLastId()+1, listKedua, DatabaseCustomer.getCustomerById(1),5000));
//        for (Invoice i : DatabaseInvoice.getInvoiceByCustomer(1))
//        {
//            if(i.getId() == DatabaseInvoice.getLastId())
//            {
//                i.setTotalPrice();
//            }
//        }
//
//        DatabaseInvoice.addInvoice( new CashlessInvoice (DatabaseInvoice.getLastId()+1, listPertama, DatabaseCustomer.getCustomerById(1),DatabasePromo.getPromoById(1)));
//        for (Invoice i : DatabaseInvoice.getInvoiceByCustomer(1))
//        {
//            if(i.getId() == DatabaseInvoice.getLastId())
//            {
//                i.setTotalPrice();
//            }
//        }
//
//        for ( Invoice i : DatabaseInvoice.getInvoiceDatabase()) // no 8
//        {
//            System.out.println(i);
//        }
//
//        DatabaseInvoice.changeInvoiceStatus(DatabaseInvoice.getLastId(), InvoiceStatus.FINISHED); // no 9
//        DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId()+1,
//                listKedua, DatabaseCustomer.getCustomerById(2), DatabasePromo.getPromoById(1)));
//        DatabasePromo.activePromo(1); // no 11
//        for ( Invoice i : DatabaseInvoice.getInvoiceDatabase())
//        {
//            i.setTotalPrice();
//        }
//
//        for ( Invoice i : DatabaseInvoice.getInvoiceDatabase()) // no 13
//        {
//            System.out.println(i);
//        }


        //=======================Case Study 7==========================
        Location lokasi1 = new Location("Kebumen", "Jateng", "Jawa");
        Location lokasi2 = new Location("Curup", "Bengkulu", "Sumatra");

        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId()+1, "akbar", "akbar@gmail.com", "0811111", lokasi1));
        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId()+1, "muhammad", "muhamad@gmail.com", "0822222", lokasi2));
        try
        {
            DatabaseSeller.getSellerById(200);
        }
        catch (SellerNotFoundException a)
        {
            System.out.println(a.getMessage());
        }
        try
        {
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId()+1,"ilham","ilham@gmail.com", "aA345678"));
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId()+1,"ilham","ilham@gmail.com", "aA345678"));
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId()+1,"Wafid","wafid@gmail.com", "aA345610"));
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId()+1,"ilham","ilham@gmail.com", "aA345678"));
            DatabaseCustomer.getCustomerById(200);
        }
        catch (EmailAlreadyExistsException a)
        {
            System.out.println(a.getMessage());
        }
        catch (CustomerNotFoundException a)
        {
            System.out.println(a.getMessage());
        }

        try
        {
            DatabasePromo.addPromo((new Promo(DatabasePromo.getLastId()+1, "123", 2000, 3000, true)));
            DatabasePromo.addPromo((new Promo(DatabasePromo.getLastId()+1, "123", 2300, 4000, true)));
            DatabasePromo.getPromoById(200);
        }
        catch (PromoCodeAlreadyExistsException a)
        {
            System.out.println(a.getMessage());
        }
        catch (PromoNotFoundException a)
        {
            System.out.println(a.getMessage());
        }

        try
        {
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1, "Kopi hitam", DatabaseSeller.getSellerById(1), 10000, FoodCategory.COFFEE));
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1, "Mochacino", DatabaseSeller.getSellerById(2), 17000, FoodCategory.COFFEE));
            DatabaseFood.getFoodById(200);
        }
        catch (FoodNotFoundException a)
        {
            System.out.println(a.getMessage());
        }
        catch (SellerNotFoundException a)
        {
            System.out.println(a.getMessage());
        }

        //===nomor 9===

        ArrayList<Food> listPertama = new ArrayList<Food>();
        try
        {
            listPertama.add(DatabaseFood.getFoodById(1));
        }

        catch (FoodNotFoundException a)
        {
            System.out.println(a.getMessage());
        }
        ArrayList<Food> listKedua = new ArrayList<Food>();
        try
        {
            listKedua.add(DatabaseFood.getFoodById(2));
        }
        catch (FoodNotFoundException a)
        {
            System.out.println(a.getMessage());
        }
        try
        {
            DatabaseInvoice.addInvoice(new CashInvoice(DatabaseInvoice.getLastId() + 1, listKedua, DatabaseCustomer.getCustomerById(1), 5000));
        }
        catch (CustomerNotFoundException a)
        {
            System.out.println(a.getMessage());
        }
        try
        {
            DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId() + 1, listPertama, DatabaseCustomer.getCustomerById(1), DatabasePromo.getPromoById(1)));
        }
        catch (PromoNotFoundException a)
        {
            System.out.println(a.getMessage());
        }
        catch (CustomerNotFoundException a)
        {
            System.out.println(a.getMessage());
        }
//        PriceCalculator t1=new PriceCalculator();
//        t1.run();
        // DatabaseInvoice.addInvoice(new Invoice ())


    }



}
