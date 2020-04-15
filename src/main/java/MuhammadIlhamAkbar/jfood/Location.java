package MuhammadIlhamAkbar.jfood;
/**
 * <h1>JFood Program based on Object Oriented Programming<h1>
 * This Location Class used to precessing location data
 * <p>
 * @author Muhammad Ilham Akbar
 * @version 2020-02-27
 */
public class Location
{
    // Instance variables in Invoice Class
    private String province; //instance variable to store name of province 
    private String description; // instance variable to store description of location
    private String city; // instance variable to store city' name

   /**
     * This is constructor for object of class Invoice
     * <p>
     * Update or changes city, province, description
     * @param city - first parameter value of constructor, which becomes city name 
     * @param province - second parameter value of constructor, which becomes province name
     * @param description - third parameter value of constructor, description of location in String
     */
    public Location(String city, String province, String description)
    {
        // initialise instance variables
       this.city = city;
       this.province = province;
       this.description = description;
    }

    /**
     * This is getProvince method that used to return id value
     * @return province, return province location
     */
    public String getProvince()
    {
        // put your code here
        return province;
    }
    
    /**
     * This is getCity method that used to return city value
     * @return city, return city location
     */
    public String getCity()
    {
        return city;
    }
    
    /**
     * This is getDescription method that used to return description value
     * @return description, return location description
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * This is setProvince method that used to set province value, that province is instance variable
     * @param province, set province location in string
     */
    public void setProvince(String province)
    {
        this.province = province;
    }
    
    /**
     * This is setCity method that used to set city value, that city is instance variable
     * @param city, set city location in stirng
     */
    public void setCity(String city)
    {
        this.city = city;
    }
    
    /**
     * This is printData method that used to print getProvince()
     */
    public String toString()
    {
        return "\nProvince: "+province+"\nDescription: "+description+"\nCity: "+city;
    }
}
