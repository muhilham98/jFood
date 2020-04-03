

import java.util.*;
import java.text.*;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * <h1>JFood Program based on Object Oriented Programming<h1>
 * This Invoice Class used to precessing Invoice data
 * <p>
 * @author Muhammad Ilham Akbar
 * @version 2020-02-27
 */
public abstract class Invoice
{
    // Instance variables in Invoice Class
    //private int id;//invoice id
    //private int idFood;//invoice idFood
    //private String date;//invoice date
    //private int totalPrice;//invoice total price value
    //private Customer customer;
    //private PaymentType paymentType;
    //private InvoiceStatus status;
    private int id;
    ArrayList<Food> foods = new ArrayList();
    //private Food food;
    private Calendar date;
    protected int totalPrice;
    private Customer customer;
    private InvoiceStatus invoiceStatus;

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
    public Invoice(int id, ArrayList<Food> foods, Customer customer)
    {
        this.id = id;
        this.foods = foods;
        this.customer = customer;
        this.invoiceStatus = InvoiceStatus.ONGOING;
        this.date = Calendar.getInstance();
        
    }

    /**
     * This is getId method that used to return id value
     * @return id, return invoice id value
     */
    public int getId() {
        return id;
    }
    
    /**
     * This is getIdFood method that used to return id value
     * @return idFood, return idFood value
     */
    public ArrayList<Food> getFoods()
    {
        return foods;
    }
    
    /**
     * This is getDate method that used to return id value
     * @return date, return date value
     */
    public Calendar getDate()
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
    
    public abstract PaymentType getPaymentType();
    
    public InvoiceStatus getInvoiceStatus() 
    {
        return invoiceStatus;
    }
    /**
     * This is setId method that used to set id value, that id is instance variable
     * @param id, set id in integer
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * This is setIdFood method that used to set idFood value, that idFood is instance variable
     * @param idFood, set idFood in integer
     */
    public void setFood(ArrayList<Food> foods) {
        this.foods = foods;
    }
    
    /**
     * This is setDate method that used to set date value, that date is instance variable
     * @param date, set date in string
     */
    public void setDate(Calendar date)
    {
        this.date = date;
    }
    
    public void setDate (int year, int month, int dayOfMonth)
    {
        this.date = new GregorianCalendar (year, month-1, dayOfMonth);
    }
    
    /**
     * This is setTotalPrice method that used to set totalPrice value, that totalPrice is instance variable
     * @param totalPrice, set total price in integer
     */
    public abstract void setTotalPrice();
    
    /**
     * This is setCustomer method that used to set customer value, that customer is instance variable
     * @param id, set customer that data type is object customer
     */
    public void setCustomer (Customer customer)
    {
        this.customer = customer;
    }
    //public void setPaymentType (PaymentType paymentType)
    //{
      //  this.paymentType = paymentType;
    //}
    
    public void setInvoiceStatus(InvoiceStatus invoiceStatus)
    {
        this.invoiceStatus = invoiceStatus;
    }
    /**
     * This is printData method that used to print data
     */
    
    public abstract String toString();
    
}
