
/**
 * <h1>JFood Program based on Object Oriented Programming<h1>
 * This Invoice Class used to precessing Invoice data
 * <p>
 * @author Muhammad Ilham Akbar
 * @version 2020-02-27
 */
public class Invoice
{
    // Instance variables in Invoice Class
    private int id;//invoice id
    private int idFood;//invoice idFood
    private String date;//invoice date
    private int totalPrice;//invoice total price value
    private Customer customer;
    private PaymentType paymentType;
    private InvoiceStatus status;

    /**
     * This is constructor for object of class Invoice
     * <p>
     * Updates or changes id, idFood, date, date, customer, totalPrice
     * @param id - first parameter value of constructor, which becomes invoice identifier
     * @param idFood - second parameter value of constructor, which becomes id food identifier
     * @param date - third parameter value of constructor, which becomes invoice date
     * @param customer - fourth parameter value of constructor, who received the invoice
     * @param totalPrice - fifth paramter value of constructor, total price value at that invoice
     */
    public Invoice(int id, int idFood, String date, Customer customer, int totalPrice, InvoiceStatus status)
    {
        this.id = id;
        this.idFood = idFood;
        this.date= date;
        this.customer = customer;
        this.totalPrice = totalPrice;
        this.status = status;
        
    }

    /**
     * This is getId method that used to return id value
     * @return id, return invoice id value
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * This is getIdFood method that used to return id value
     * @return idFood, return idFood value
     */
    public int getIdFood()
    {
        return idFood;
    }
    
    /**
     * This is getDate method that used to return id value
     * @return date, return date value
     */
    public String getDate()
    {
        return date;
    }
    
    /**
     * This is getTotalPrice method that used to return id value
     * @return totalPrice, return total price value
     */
    public int getTotalPrice()
    {
        return totalPrice;
    }
    
    /**
     * This is getCustomer method that used to return id value
     * @return customer, return costumer value that data type is object customer 
     */
    public Customer getCustomer()
    {
        return customer;
    }
    
    public PaymentType getPaymentType()
    {
        return paymentType;
    }
    
    public InvoiceStatus getInvoiceStatus() 
    {
        return status;
    }
    /**
     * This is setId method that used to set id value, that id is instance variable
     * @param id, set id in integer
     */
    public void setId(int id)
    {
        this.id = id;
    }
    
    /**
     * This is setIdFood method that used to set idFood value, that idFood is instance variable
     * @param idFood, set idFood in integer
     */
    public void setIdFood(int idFood)
    {
        this.idFood = idFood;
    }
    
    /**
     * This is setDate method that used to set date value, that date is instance variable
     * @param date, set date in string
     */
    public void setDate(String date)
    {
        this.date = date;
    }
    
    /**
     * This is setTotalPrice method that used to set totalPrice value, that totalPrice is instance variable
     * @param totalPrice, set total price in integer
     */
    public void setTotalPrice(int totalPrice)
    {
        this.totalPrice = totalPrice;
    }
    
    /**
     * This is setCustomer method that used to set customer value, that customer is instance variable
     * @param id, set customer that data type is object customer
     */
    public void setCustomer (Customer customer)
    {
        this.customer = customer;
    }
    public void setPaymentType (PaymentType paymentType)
    {
        this.paymentType = paymentType;
    }
    
    public void setInvoiceStatus(InvoiceStatus status)
    {
        this.status = status;
    }
    /**
     * This is printData method that used to print data
     */
    public void printData()
    {
       System.out.println("=========INVOICE=======");
       System.out.println("ID: " + getId());
       System.out.println("Food ID: " + getIdFood());
       System.out.println("Date: " + getDate());
       System.out.println("Costumer: " + customer.getName());
       System.out.println("Total Price: " + getTotalPrice());
       System.out.println("Status: " + getInvoiceStatus());
    }
    
}
