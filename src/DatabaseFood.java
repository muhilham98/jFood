
/**
 * <h1>JFood Program based on Object Oriented Programming<h1>
 * This DatabaseFood Class used to precessing database food data
 * <p>
 * @author Muhammad Ilham Akbar
 * @version 2020-02-27
 */
import java.util.ArrayList;
public class DatabaseFood
{
    // Instance variables in Seller Class
   // private static String[] listFood;
    private static ArrayList<Food> FOOD_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    /**
     * This is constructor for object of class DataBase
     */
    public DatabaseFood()
    {
        // initialise instance variables
    }

    /**
     * This is addFood method that used to return true value
     * @return true, boolen return
     */
    public static ArrayList<Food> getFoodDatabase()
    {
        return FOOD_DATABASE;
    }

    public static int getlastId()
    {
        return lastId;
    }

    public static Food getFoodById(int id)
    {
        Food food = FOOD_DATABASE.get(id);
        if (food != null) {
            return food;
        }
        return null;
    }

    public static ArrayList<Food> getFoodBySeller (int sellerId)
    {
        ArrayList<Food> i = new ArrayList<>();
        for (Food food: FOOD_DATABASE) {
            if (food.getSeller().getId() == sellerId) {
                i.add(food);
            }
        }
        return i;
    }

    public static ArrayList<Food> getFoodByCategory(FoodCategory category)
    {
        ArrayList<Food> i = new ArrayList<>();
        for (Food food: FOOD_DATABASE) {
            if (food.getCategory() == category) {
                i.add(food);
            }
        }
        return i;
    }

    public static boolean addFood(Food food)
    {
        // put your code here
        if (FOOD_DATABASE.add(food)) {
            FOOD_DATABASE.indexOf(food);
            return true;
        }
        return false;
    }
    
    /**
     * This is removeFood method that used to return true value
     * @return true, boolen return
     */

    public static boolean removeFood(int id) {
        Food food = FOOD_DATABASE.get(id);
        if (food != null) {
            FOOD_DATABASE.remove(food);
            return true;
        }
        return false;
    }
    /**
     * This is removeFood method that used to return true value
     * @return listFood, to display list of food
     */
   // public static String[] getListFood()
//    {
//        return listFood;
//    }
    
}
