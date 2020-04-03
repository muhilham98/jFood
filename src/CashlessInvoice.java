import java.text.SimpleDateFormat;
import java.util.*;
/**
 * Write a description of class CashlessInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CashlessInvoice extends Invoice
{
    // instance variables - replace the example below with your own
    private static PaymentType PAYMENT_TYPE = PaymentType.CASHLESS;
    private Promo promo;

    /**
     * Constructor for objects of class CashlessInvoice
     */
    public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer)
    {
        super(id, foods, customer);
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  id a sample parameter for a method
     * @return    the sum of x and y
     */
    public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer, Promo promo)
    {
        super(id, foods, customer);
        this.promo = promo;
        
    }
    
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }
    
    public Promo getPromo()
    {
        return promo;
    }
    
    public void setPromo (Promo promo)
    {
        this.promo = promo;
    }
    
    public void setTotalPrice()
    {
        int totalFoodPrice =0;
        for(int i=0;i<getFoods().size();i++){
            totalFoodPrice = totalFoodPrice+ getFoods().get(i).getPrice() ;
        }

        if( promo != null){
            if (promo.getActive() == true && totalFoodPrice >promo.getMinPrice()){
                super.totalPrice = (totalFoodPrice - promo.getDiscount() );
            }
            else{
                super.totalPrice = totalFoodPrice;
            }

        }
        else{
            super.totalPrice = totalFoodPrice;
        }
    }

    public String toString()
    {
        String food = " ";
        for(int i = 0; i < getFoods().size(); i++){
            food = food + getFoods().get(i).getName() + " ";
        }
        String b = "======INVOICE======\n" +
                    "FOOD :" + food;
        if(super.getDate() != null){
            b = b + "\nDate :" + super.getDate().get(Calendar.DAY_OF_MONTH) + "-" + super.getDate().get(Calendar.MONTH) + "-"+ super.getDate().get(Calendar.YEAR);
        }
        b = b + "\nCustomer :" + super.getCustomer().getName();

        if(promo != null){
            b = b+"\nPromo :" + promo.getCode();
        }
        b = b+ "\nTotal price :" + getTotalPrice()+
                "\nStatus :" + super.getInvoiceStatus() +
                "\nPayment Type :" + PAYMENT_TYPE;
        return b;
    }
    
//  public String toString()
//
//    {
//        String string="";
//        Date date = super.getDate().getTime();
//        SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
//        String date1 = format1.format(date);
//
//        int foodPrice=0;
//        for(int i = 0; i < super.getFoods().size(); i++){
//            foodPrice+=super.getFoods().get(i).getPrice();
//        }
//
//        if(promo!=null&&promo.getActive()==true&&foodPrice>promo.getMinPrice())
//        {
//            string= "ID: "+super.getId()+
//                            "\nFood: "+super.getFoods()+
//                            "\nDate: "+date1+
//                            "\nCustomer: "+super.getCustomer().getName()+
//                            "\nPromo: "+promo.getCode()+
//                            "\nTotal Price: "+super.totalPrice+
//                            "\nStatus: "+super.getInvoiceStatus()+
//                            "\nPaymentType: "+PAYMENT_TYPE+"\n\n";
//
//            System.out.println(string);
//        }
//        else
//        {
//            string= "ID: "+super.getId()+
//                            "\nFood: \n"+super.getFoods()+
//                            "\nDate: "+date1+
//                            "\nCustomer: "+super.getCustomer().getName()+
//                            "\nTotal Price: "+super.totalPrice+
//                            "\nStatus: "+super.getInvoiceStatus()+
//                            "\nPaymentType: "+PAYMENT_TYPE+"\n\n";
//
//            System.out.println(string);
//        }
//        return string;
//    }
    
    
}
