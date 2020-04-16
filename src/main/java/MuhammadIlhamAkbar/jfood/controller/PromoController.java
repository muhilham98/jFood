package MuhammadIlhamAkbar.jfood.controller;
import MuhammadIlhamAkbar.jfood.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
public class PromoController
{
    @RequestMapping(value = "/promo", method = RequestMethod.GET)
    public ArrayList<Promo> getAllPromo()
    {
        ArrayList<Promo> promo = DatabasePromo.getPromoDatabase();
        return promo;
    }

    @RequestMapping(value = "/promo/{code}", method = RequestMethod.GET)
    public Promo getPromoByCode(@PathVariable String code)
    {
        Promo promo = DatabasePromo.getPromoByCode(code);
        return promo;
    }

    @RequestMapping(value = "/promo", method = RequestMethod.POST)
    public Promo addPromo(@RequestParam(value = "code") String code,
                          @RequestParam(value = "discount") int discount,
                          @RequestParam(value = "minPrice") int minPrice,
                          @RequestParam(value = "active") boolean active) {
        try {
            if (DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId() + 1, code, discount, minPrice, active))) {
                Promo promo = null;
                try {
                    promo = DatabasePromo.getPromoById(DatabasePromo.getLastId());
                } catch (PromoNotFoundException e) {
                    System.out.println(e.getMessage());
                }
                return promo;
            }
        } catch (PromoCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}

