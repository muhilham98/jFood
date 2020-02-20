
/**
 * Write a description of class Food here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Food
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private int price;
    private String category;

    /**
     * Constructor for objects of class Food
     */
    public Food()
    {
        id = 0;
        name = "oke";
        price = 0;
        category = "oke";
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
    
    public String getName()
    {
        return name;
    }
    
    public int getPrice()
    {
        return price;
    }
    
    public String getCategory()
    {
        return category;
    }
    
    public void setId (int newId)
    {
        this.id = newId;
    }
    
    public void setName (String newName)
    {
        this.name = newName;
    }
    
    public void setPrice (int newPrice)
    {
        this.price = newPrice;
    }
    
    public void setCategory (String newCategory)
    {
        this.category = newCategory;
    }
    
}
