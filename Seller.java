
/**
 * Write a description of class Seller here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Seller
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String phoneNumber;

    /**
     * Constructor for objects of class Seller
     */
    public Seller()
    {
        id = 0;
        name = "oke";
        email = "oke";
        phoneNumber = "oke";
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getId()
    {
        // put your code here
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    public void setId(int newId)
    {
        this.id = newId;
    }
    
    public void setName(String newName)
    {
        this.name = newName;
    }
    
    public void setEmail(String newEmail)
    {
        this.email = newEmail;
    }
    public void setPhoneNumber(String newPhoneNumber)
    {
        this.phoneNumber = newPhoneNumber;
    }
}
