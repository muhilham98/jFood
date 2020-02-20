
/**
 * Write a description of class Invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private int idFood;
    private String date;
    private int totalPrice;

    /**
     * Constructor for objects of class Invoice
     */
    public Invoice()
    {
        id = 0;
        idFood = 0;
        date = "oke";
        totalPrice = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getId()
    {
        return id;
    }
    
    public int getIdFood()
    {
        return idFood;
    }
    
    public String getDate()
    {
        return date;
    }
    
    public int getTotalPrice()
    {
        return totalPrice;
    }
    
    public void setId(int idNew)
    {
        this.id = idNew;
    }
    
    public void setIdFoods(int newIdFood)
    {
        this.idFood = newIdFood;
    }
    
    public void setDate(String newDate)
    {
        this.date = newDate;
    }
    
    public void setTotalPrice(int newTotalPrice)
    {
        this.totalPrice = newTotalPrice;
    }
    
}
