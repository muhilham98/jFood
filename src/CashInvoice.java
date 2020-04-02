





import java.util.Calendar; 
import java.text.SimpleDateFormat;

/**
 * Write a description of class CashInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CashInvoice extends Invoice
{
    // instance variables - replace the example below with your own
    private static PaymentType PAYMENT_TYPE = PaymentType.CASH;
    private int deliveryFee;

    /**
     * Constructor for objects of class CashInvoice
     */
    public CashInvoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus)
    {
        // initialise instance variables
        super (id, food, customer, invoiceStatus);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public CashInvoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus, int deliveryFee)
    {
        super (id, food, customer, invoiceStatus);
        this.deliveryFee = deliveryFee;
    }
    
    public PaymentType getPaymentType()
    {
         return PAYMENT_TYPE;
    }
    
    public int getDeliveryFee()
    {
        return deliveryFee;
    }
    
    public void setDeliveryFee(int deliveryFee)
    {
        this.deliveryFee = deliveryFee;
    }
    
     public void setTotalPrice()
    {
        if (getDeliveryFee()!= 0){
            super.totalPrice = getFood().getPrice() + getDeliveryFee();
        } else{
            super.totalPrice = getFood().getPrice();
        }
    }
    
    public String toString()
    {
            SimpleDateFormat format1 = new SimpleDateFormat("dd MMMM yyyy");
            String date1 = format1.format(getDate().getTime());
            String print;
            print  = "======INVOICE======"+
                   "\nID = "+super.getId()+
                   "\nFood = "+super.getFood().getName()+
                   "\nDate = "+date1+
                   "\nCustomer = "+super.getCustomer().getName()+
                   "\nDelivery Fee = "+deliveryFee+
                   "\nTotal Price = "+super.totalPrice+
                   "\nStatus : " + super.getInvoiceStatus()+
                   "\nPayment Type : "+ PAYMENT_TYPE;
            //System.out.println(print);
            return print;      
                  
           
        
    }
    
    
}
