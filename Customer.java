
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String password;
    private String joinDate; 

    /**
     * Constructor for objects of class Customer
     */
    public Customer(int id, String name, String email, String password, String joinDate)
    {
        id = 0;
        name = "oke";
        email = "oke";
        password = "oke";
        joinDate = "oke";
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
    
    public String getEmail()
    {
        return email;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public String getJoinDate()
    {
        return joinDate;
    }
    
    public void setId(int idNew)
    {
        this.id = idNew;
    }
    
    public void setName(String nameNew)
    {
        this.name = nameNew;
    }
    
    public void setEmail(String emailNew)
    {
        this.email = emailNew;
    }
    
    public void setPassword(String passwordNew)
    {
        this.password = passwordNew;
    }
    
    public void setJoinDate(String joinDateNew)
    {
        this.joinDate = joinDateNew;
    }
    
    public void printData()
    {
        System.out.println(getName());
    }
    
}
