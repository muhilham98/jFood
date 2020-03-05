
/**
 * Enumeration class PaymentType - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum PaymentType
{
    Cashless ("Cashless"), 
    Cash("Cash");
    
    private String typePayment;
    
    private PaymentType (String typePayment)
    {
        this.typePayment = typePayment;
    }
    
    public String toSring()
    {
        return typePayment;
    }
    
    
    
}
