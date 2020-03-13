
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
    public CashInvoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus)
    {
        // initialise instance variables
        super (id, food, date, customer, invoiceStatus);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public CashInvoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus, int deliveryFee)
    {
        super (id, food, date, customer, invoiceStatus);
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
    
    public void printData()
    {
            System.out.println("============INOVOICE===========");
            System.out.println("ID       : " + super.getId());
            System.out.println("Food     : " + super.getFood().getName());
            System.out.println("Date     : " + super.getDate());
            System.out.println("Costumer : " + super.getCustomer().getName());
            System.out.println("Delivery Fee : " + deliveryFee);
            System.out.println("Total Price : " + super.totalPrice);
            System.out.println("Status : " + super.getInvoiceStatus());
            System.out.println("Payment Type : "+ PAYMENT_TYPE);
        
    }
    
    
}
