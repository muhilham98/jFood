import java.util.*;
import java.util.regex.*;
import java.text.SimpleDateFormat;
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
    public CashlessInvoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus)
    {
        super(id, food, customer, invoiceStatus);
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public CashlessInvoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus, Promo promo)
    {
        super(id, food, customer, invoiceStatus);
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
        if (getPromo()!= null &&promo.getActive() == true && getFood().getPrice()>promo.getMinPrice()){
            super.totalPrice = getFood().getPrice() - promo.getDiscount();
        }
        else{
            super.totalPrice = getFood().getPrice();
        }
    }
    
  public String toString()
   
    {
        if (getPromo() == null || promo.getActive() == false ||getFood().getPrice()<promo.getMinPrice()){
            System.out.println("============INOVOICE===========");
            System.out.println("ID       : " + getId());
            System.out.println("Food     : " + getFood().getName());
            System.out.println("Date     : " + getDate());
            System.out.println("Costumer : " + getCustomer().getName());
            System.out.println("Total Price : " + totalPrice);
            System.out.println("Status : " + getInvoiceStatus());
            System.out.println("Payment Type : "+ PAYMENT_TYPE);
        }
        else{
            System.out.println("============INOVOICE===========");
            System.out.println("ID       : " + getId());
            System.out.println("Food     : " + getFood().getName());
            System.out.println("Date     : " + getDate());
            System.out.println("Costumer : " + getCustomer().getName());
            System.out.println("Promo : " + promo.getCode());
            System.out.println("Total Price : " + totalPrice);
            System.out.println("Status : " + getInvoiceStatus());
            System.out.println("Payment Type : "+ PAYMENT_TYPE);
        }
        
        String print;
        if (getPromo() == null || promo.getActive() == false ||getFood().getPrice()<promo.getMinPrice()){
            
            //Date date1 = date.getTime();             
            //SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
            //String date2 = format1.format(date);  
            print  = "Customer:\n"+
                   "ID = "+getId()+"\n"+
                   "Food = "+getFood().getName()+"\n"+
                   "Date = "+getDate()+"\n"+
                   "Costumer = "+getCustomer().getName()+"\n"+
                   "Promo = "+promo.getCode()+"\n"+
                   "Total price = "+getCustomer().getName()+"\n"+
                   "Status = "+promo.getCode()+"\n"+
                    "Payment Type = "+PAYMENT_TYPE+"\n";
        }
        else
        {    
             print  = "Customer:\n"+
                   "ID = "+getId()+"\n"+
                   "Food = "+getFood().getName()+"\n"+
                   "Date = "+getDate()+"\n"+
                   "Costumer = "+getCustomer().getName()+"\n";
        }
        System.out.println(print);
        return print;
    }
    
    
}
