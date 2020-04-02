import java.util.*;
import java.util.regex.*;
import java.text.SimpleDateFormat;
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
    private Calendar joinDate;  // Customer joinDate

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
    public Customer(int id, String name, String email, String password, Calendar joinDate)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
        setPassword(password);
        setEmail(email);
    }
    
    public Customer(int id, String name, String email, String password, int year, int month, int dayOfMonth)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = new GregorianCalendar(year,month-1,dayOfMonth);
        setPassword(password);
        setEmail(email);
        
    }
    
    public Customer (int id, String name, String email, String password)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = Calendar.getInstance();
        setPassword(password);
        setEmail(email);
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
    public Calendar getJoinDate()
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
        String pattern =  "^[a-zA-Z0-9_+&*-]+(?:\\."+  
                            "[a-zA-Z0-9_+&*-]+)*@" +  
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +  
                            "A-Z]{2,7}$";
        Pattern a = Pattern.compile(pattern);
        Matcher b = a.matcher(email);
        if (!b.find()) {
            this.email = "";
        } else {
            this.email = email;
        }
    }
    
    /**
     * This is setPassword method that used to set password value, that password is instance variable
     * @param password, set password value in string
     */
    public void setPassword(String password)
    {
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
        Pattern a = Pattern.compile(pattern);
        Matcher b = a.matcher(password);
        if(!b.find()){
            this.password = "";
        }else{
            this.password = password;
        }
    }
    
    /**
     * This is setJoinDate method that used to set password value, that password is instance variable
     * @param joinDate, set join date value in string
     */
    public void setJoinDate(Calendar joinDate)
    {
        this.joinDate = joinDate;
    }
    
    public void setJoinDate (int year, int month, int dayOfMonth)
    {
        this.joinDate = new GregorianCalendar (year, month-1, dayOfMonth);
    }
    /**
     * This is printData method that used to print getName()
     */
    
    public String toString()
    {
        String print;
        if(joinDate!=null)
        {
            
            Date date = joinDate.getTime();             
            SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
            String date1 = format1.format(date);  
            print  = "Customer:\n"+
                   "ID = "+id+"\n"+
                   "Nama = "+name+"\n"+
                   "Email = "+email+"\n"+
                   "Password = "+password+"\n"+
                   "Join Date = "+date1+"\n";
        }
        else
        {    
            print = "Customer:\n"+
                   "ID = "+id+"\n"+
                   "Nama = "+name+"\n"+
                   "Email = "+email+"\n"+
                   "Password = "+password+"\n";
        }
        System.out.println(print);
        return print;
    }
    
    
}
