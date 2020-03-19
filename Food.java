
/**
 * <h1>JFood Program based on Object Oriented Programming<h1>
 * This Food Class used to precessing food data
 * <p>
 * @author Muhammad Ilham Akbar
 * @version 2020-02-27
 */
public class Food
{
    // Instance variables in Food Class
    private int id; // Food id
    private String name; // Food name 
    private Seller seller; // who is seller
    private int price; // Food price
    private FoodCategory category; // Food category

    /**
     * This is constructor for object of class Food
     * <p>
     * Update or changes id, name, seller, price, category
     * @param id - first parameter value of constructor, which becomes id identifier
     * @param name - second parameter value of constructor, which becomes food name
     * @param seller - third parameter value of constructor, which becomes food seller
     * @param price - fourth parameter value of constructor, which becomes food price
     * @param category - fifth parameter value of constructor, where is food category
     */
    public Food(int id, String name, Seller seller, int price, FoodCategory category)
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.seller = seller;
    }

    /**
     * This is getId method that used to return id value
     * @return id, return food id value
     */
    public int getId()
    {
       return id;
    }
    
    /**
     * This is getName method that used to return name value
     * @return name, return name value
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * This is getSeller method that used to return seller value
     * @return seller, return seller value
     */
    public Seller getSeller ()
    {
        return seller;
    }
    
    /**
     * This is getPrice method that used to return price value
     * @return price, return food price value
     */
    public int getPrice()
    {
        return price;
    }
    
    /**
     * This is getCategory method that used to return category value
     * @return category, return category value
     */
    public FoodCategory getCategory()
    {
        return category;
    }
    
    /**
     * This is setId method that used to set id value, that id is instance variable
     * @param id, set id value in integer
     */
    public void setId (int Id)
    {
        this.id = Id;
    }
    
    /**
     * This is setName method that used to set id value, that name is instance variable
     * @param name, set name value in string
     */
    public void setName (String name)
    {
        this.name = name;
    }
    
    /**
     * This is setSeller method that used to set seller value, that seller is instance variable
     * @param seller, set seller value that datatype is seller object
     */
    public void setSeller (Seller seller)
    {
        this.seller = seller;
    }
    
    /**
     * This is setPrice method that used to set price value, that price is instance variable
     * @param price, set price value in integer
     */
    public void setPrice (int price)
    {
        this.price = price;
    }
    
    /**
     * This is setCategory method that used to set category value, that category is instance variable
     * @param category, set category value in string
     */
    public void setCategory (FoodCategory category)
    {
        this.category = category;
    }
    
    /**
     * This is printData method that used to print 
     */
    public String toString()
    {
       return "FOOD\nId: "+id+"\nId: "+id+"\name: "+name+"\nSeller: "+seller+"/nPrice: "+ price+"\ncCategory: " + category;
    }
    
}
