
/**
 * Write a description of class JFood here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JFood
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class JFood
     */
    public JFood()
    {
        
    }

   
    public static void main(String[] args)
    {
        Location location1 = new Location("Depok", "Jabar","daerah");
        Seller seller1 = new Seller(1, "ilham", "ilham@gmail.com", "085803", location1);
        Food nasi = new Food(1, "putih", seller1, 1000, "pokok");
        location1.printData();
        location1.setCity("Kebumen");
        System.out.println(location1.getCity());
        
        
       
    }
}
