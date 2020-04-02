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
    public static Promo getPromoById(int id)
    {
        Promo promo = PROMO_DATABASE.get(id);
        if (promo != null) {
            return promo;
        }
        return null;
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

    public static boolean addPromo(Promo promo)
    {
        // put your code here
        boolean samePromoCode = false;
        for (Promo i: PROMO_DATABASE) {
            if (promo.getCode() == i.getCode()) {
                samePromoCode = true;
            }
        }

        if (!samePromoCode) {
            PROMO_DATABASE.add(promo);
            lastId = PROMO_DATABASE.indexOf(promo);
        }
        return false;
    }

    public static boolean activePromo(int id)
    {
        Promo promo = PROMO_DATABASE.get(id);
        if (promo != null) {
            promo.setActive(true);
            return true;
        }
        return false;
    }
    public static boolean deactivePromo(int id)
    {
        Promo promo = PROMO_DATABASE.get(id);
        if (promo != null) {
            promo.setActive(false);
            return true;
        }
        return false;
    }

    public static boolean removePromo(int id)
    {
        Promo promo = PROMO_DATABASE.get(id);
        if (promo != null) {
            PROMO_DATABASE.remove(promo);
            return true;
        }
        return false;
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
