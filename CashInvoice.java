
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
            String print;
            print  = "Customer:\n"+
                   "ID = "+super.getId()+"\n"+
                   "Food = "+super.getFood().getName()+"\n"+
                   "Date = "+super.getDate()+"\n"+
                   "Customer = "+super.getCustomer().getName()+"\n"+
                   "Delivery Fee = "+deliveryFee+"\n"+
                   "Total Price = "+super.totalPrice+"\n"+
                   "Status : " + super.getInvoiceStatus()+"\n"+
                    "Payment Type : "+ PAYMENT_TYPE+"\n";
                    System.out.println(print);
                    return print;      
                   
            //System.out.println("============INOVOICE===========");
           
        
    }
    
    
}
