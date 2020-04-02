import java.util.ArrayList;
/**
 * Write a description of class DatabaseSeller here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseSeller
{
    // instance variables - replace the example below with your own
    //private static String[] listSeller;
    private static ArrayList<Seller> SELLER_DATABASE = new ArrayList<Seller>();
    private static int lastId = 0;


    /**
     * Constructor for objects of class DatabaseSeller
     */
    public DatabaseSeller()
    {
       
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @return    the sum of x and y
     */
//    public static boolean addSeller(Seller seller)
//    {
//        return true;
//    }
//    public static boolean removeSeller(Seller seller)
//    {
//        return true;
//    }
//    public static Seller getSeller()
//    {
//        return null;
//    }
//    public static String[] getListSeller()
//    {
//        return listSeller;
//    }
//
    public static ArrayList<Seller> getSellerDatabase(){
        return SELLER_DATABASE;
    }
    public static int getLastId()
    {
        return lastId;
    }
    public static Seller getSellerById(int id)
    {
        Seller value = null;
        for(Seller seller : SELLER_DATABASE)
        {
            if(seller.getId()==lastId)
            {
                value=seller;
            }
            else
            {
                return value;
            }
        }

        return value;
    }
    public static boolean addSeller(Seller seller)
    {
        SELLER_DATABASE.add(seller);
        lastId = seller.getId();
        return true;
    }

    public static boolean removeSeller(int id) {
        Seller seller = SELLER_DATABASE.get(id);
        if (seller != null) {
            SELLER_DATABASE.remove(seller);
            return true;
        }
        return false;
    }

}
