
/**
 * <h1>JFood Program based on Object Oriented Programming<h1>
 * This Costumer Class used to precessing costumer data
 * <p>
 * @author Muhammad Ilham Akbar
 * @version 2020-02-27
 */
public class Customer
{
    // Instance variables in Costumer Class
    private int id; // Customer id
    private String name; // Customer name
    private String email; // Customer email
    private String password; // Customer password 
    private String joinDate;  // Customer joinDate

    /**
     * This is constructor for object of class Customer 
     * <p>
     * Updates or changes id, name, email, password, and joindate when create objects
     * @param id - first parameter value of constructor, which becomes Costumer identifier
     * @param name - second parameter value of constructor, which becomes costumer name
     * @param email - third parameter value of constructor, which becomes costumer email 
     * @param password - fourth parameter value of constructor, which becomes costumer password
     * @param joinDate - fifth paramter value of constructor, display costumer join date
     */
    public Customer(int id, String name, String email, String password, String joinDate)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
    }

    /**
     * This is getId method that used to return id value
     * @return id, return costumer id value
     */
    public int getId()
    {
        return id;
    }
    
     /**
     * This is getName method that used to return name value
     * @return name, return costumer name value
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * This is getEMail method that used to return email value
     * @return email, return costumer email value
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * This is getPassword method that used to return password value
     * @return password, return costumer password value
     */
    public String getPassword()
    {
        return password;
    }
    
    /**
     * This is getJoinDtae method that used to return joinDate value
     * @return joinDate, return join date value
     */
    public String getJoinDate()
    {
        return joinDate;
    }
    
    /**
     * This is setId method that used to set id value, that id is instance variable
     * @param id, set id value in integer
     */
    public void setId(int id)
    {
        this.id = id;
    }
    
    /**
     * This is setName method that used to set name value, that name is instance variable
     * @param name, set name value in string
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * This is setEmail method that used to set email value, that email is instance variable
     * @param email, set email value in string
     */
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    /**
     * This is setPassword method that used to set password value, that password is instance variable
     * @param password, set password value in string
     */
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    /**
     * This is setJoinDate method that used to set password value, that password is instance variable
     * @param joinDate, set join date value in string
     */
    public void setJoinDate(String joinDate)
    {
        this.joinDate = joinDate;
    }
    
    /**
     * This is printData method that used to print getName()
     */
    public void printData()
    {
        System.out.println(getName());
    }
    
}
