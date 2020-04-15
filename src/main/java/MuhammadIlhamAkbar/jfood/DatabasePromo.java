package MuhammadIlhamAkbar.jfood;
import java.util.ArrayList;
/**
 * Write a description of class DatabasePromo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabasePromo
{
    // instance variables - replace the example below with your own
   // private static String[] listPromo;
    private static ArrayList<Promo> PROMO_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    /**
     * Constructor for objects of class DatabasePromo
     */
    public DatabasePromo()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     *

     * @return    the sum of x and y
     */
    public static ArrayList<Promo>  getPromoDatabase()
    {
        return PROMO_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }
    public static Promo getPromoById(int id) throws PromoNotFoundException
    {
        for(Promo i : PROMO_DATABASE)
        {
            if(i.getId() == id)
            {
                return i;
            }
        }
        throw new PromoNotFoundException(id);
        //return null;
    }

    public static Promo getPromoByCode(String code)
    {
        for (Promo promo: PROMO_DATABASE) {
            if (promo.getCode().equals(code)) {
                return promo;
            }
        }
        return null;
    }

    public static boolean addPromo(Promo promo) throws PromoCodeAlreadyExistsException
    {
        for (Promo i : PROMO_DATABASE)
        {
            if(i.getCode().equals(promo.getCode()))
            {
                throw new PromoCodeAlreadyExistsException(promo);
                //return false;
            }
        }
        PROMO_DATABASE.add(promo);
        lastId = promo.getId();
        return true;
    }

    public static boolean activePromo(int id)
    {
        for(Promo promo : PROMO_DATABASE)
        {
            if (promo.getId() == id)
            {
                promo.setActive(true);
                return true;
            }
        }
        return false;
    }
    public static boolean deactivePromo(int id)
    {
        for (Promo promo : PROMO_DATABASE)
        {
            if (promo.getId() == id)
            {
                promo.setActive(false);
                return true;
            }
        }
        return false;
    }

    public static boolean removePromo(int id) throws PromoNotFoundException
    {
        for (Promo promo : PROMO_DATABASE)
        {
            if (promo.getId() == id)
            {
                PROMO_DATABASE.remove(promo);
                return true;
            }
        }
        throw new PromoNotFoundException(id);
       // return false;
    }
    
//    public static Promo getPromo()
//    {
//        return null;
//    }
//
//    public static String[] getListPromo()
//    {
//        return listPromo;
//    }
    
}
