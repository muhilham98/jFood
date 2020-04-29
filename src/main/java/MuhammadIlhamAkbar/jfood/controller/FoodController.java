package MuhammadIlhamAkbar.jfood.controller;

import MuhammadIlhamAkbar.jfood.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@CrossOrigin(origins = "*", allowedHeaders = "")
@RestController
public class FoodController
{
    @RequestMapping(value = "/food", method = RequestMethod.GET)
    public ArrayList<Food> getAllFood()
    {
        ArrayList<Food> food = DatabaseFood.getFoodDatabase();
        return food;
    }

    @RequestMapping(value = "/food/{id}", method = RequestMethod.GET)
    public Food getFoodById(@PathVariable int id)
    {
        Food food= null;
        try {
            food = DatabaseFood.getFoodById(id);
        } catch (FoodNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return food;
    }

    @RequestMapping(value = "/food/seller/{sellerId}", method = RequestMethod.GET)
    public ArrayList<Food> getFoodBySeller(@PathVariable int sellerId)
    {
        ArrayList<Food> food = DatabaseFood.getFoodBySeller(sellerId);
        return food;
    }

    @RequestMapping(value = "/food/category/{category}", method = RequestMethod.GET)
    public ArrayList<Food> getFoodByCategory(@PathVariable FoodCategory category)
    {
        ArrayList<Food> foodCategory = DatabaseFood.getFoodByCategory(category);
        return foodCategory;
    }

    @RequestMapping(value = "/food",method = RequestMethod.POST)
    public Food addFood(@RequestParam(value = "name") String name,
                        @RequestParam(value = "price")int price,
                        @RequestParam(value = "category")FoodCategory category,
                        @RequestParam(value = "sellerId")int sellerId )
    {
        Food food = null;
        try{
            food = new Food(DatabaseFood.getLastId()+1, name,DatabaseSeller.getSellerById(sellerId),price,category);
        }catch(SellerNotFoundException e){
            System.out.println(e.getMessage());
        }
        DatabaseFood.addFood(food);
        return food;
    }
}
