
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
    public CashlessInvoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus)
    {
        super(id, food, date, customer, invoiceStatus);
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public CashlessInvoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus, Promo promo)
    {
        super(id, food, date, customer, invoiceStatus);
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
    
    public void printData()
    {
        if (getPromo() == null || promo.getActive() == false ||getFood().getPrice()<promo.getMinPrice()){
            System.out.println(getId());
            System.out.println(getFood().getName());
            System.out.println(getDate());
            System.out.println(totalPrice);
            System.out.println(getCustomer().getName());
            System.out.println(getInvoiceStatus());
        }
        else{
            System.out.println(getId());
            System.out.println(getFood().getName());
            System.out.println(getDate());
            System.out.println(totalPrice);
            System.out.println(getCustomer().getName());
            System.out.println(getInvoiceStatus());
            System.out.println(promo.getCode());
        }
    }
    
    
}
