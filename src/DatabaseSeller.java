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
        boolean check = false;
        for(int i=0;i<SELLER_DATABASE.size();i++){
            if(SELLER_DATABASE.get(i).getId() == id){
                check = true;
                return SELLER_DATABASE.get(i);

            }

        }

        return null;
    }
    public static boolean addSeller(Seller seller)
    {
        SELLER_DATABASE.add(seller);
        lastId = SELLER_DATABASE.indexOf(seller);
        return true;
    }

    public static boolean removeSeller(int id)
    {   boolean check = false;
        for(int i=0;i<SELLER_DATABASE.size();i++){
            if(SELLER_DATABASE.get(i).getId() == id){
                check = true;
                SELLER_DATABASE.remove(i);
                return true;

            }

        }

        return false;

    }

}
