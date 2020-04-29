package MuhammadIlhamAkbar.jfood.controller;
import MuhammadIlhamAkbar.jfood.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@CrossOrigin(origins = "*", allowedHeaders = "")
@RestController
public class SellerController
{
    @RequestMapping(value = "/seller", method = RequestMethod.GET)
    public ArrayList<Seller> getAllSeller()
    {
        ArrayList<Seller> seller = DatabaseSeller.getSellerDatabase();
        return seller;
    }

    @RequestMapping(value = "/seller/{id}", method = RequestMethod.GET)
    public Seller getSellerById(@PathVariable int id)
    {
        Seller seller = null;
        try{
            seller = DatabaseSeller.getSellerById(id);
        }
        catch (SellerNotFoundException e){
            System.out.println(e.getMessage());
            return null;
        }
        return seller;
    }

    @RequestMapping(value = "/seller", method = RequestMethod.POST)
    public Seller addSeller(@RequestParam(value = "name") String name,
                            @RequestParam(value = "email")String email,
                            @RequestParam(value = "phoneNumber")String phoneNumber,
                            @RequestParam(value = "province") String province,
                            @RequestParam(value = "description")String description,
                            @RequestParam(value = "city")String city )
    {
        Location loc1 = new Location(city, province, description);
        Seller seller = new Seller(DatabaseSeller.getLastId()+1, name, email, phoneNumber, loc1);
        DatabaseSeller.addSeller(seller);
        return seller;

    }
}
