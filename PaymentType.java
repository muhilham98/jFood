
/**
 * Enumeration class PaymentType - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum PaymentType
{
    CASHLESS ("Cashless"), 
    CASH ("Cash");
    
    private String payment;
    
    private PaymentType (String payment)
    {
        this.payment = payment;
    }
    
    public String toString()
    {
        return payment;
    }
    
    
    
}
