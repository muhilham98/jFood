package MuhammadIlhamAkbar.jfood.controller;
import java.util.ArrayList;

import MuhammadIlhamAkbar.jfood.*;
import org.springframework.web.bind.annotation.*;


@RestController
public class InvoiceController {

    @RequestMapping(value = "/invoice", method = RequestMethod.GET)
    public ArrayList<Invoice> getAllInvoice()
    {
        ArrayList<Invoice> invoice = DatabaseInvoice.getInvoiceDatabase();
        return invoice;
    }

    @RequestMapping(value = "/invoice/{id}", method = RequestMethod.GET)
    public Invoice getInvoiceById(@PathVariable int id)
    {
        Invoice invoice= null;
        try {
            invoice = DatabaseInvoice.getInvoiceById(id);
        } catch (InvoiceNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return invoice;
    }

    @RequestMapping(value = "invoice/customer/{customerId}", method = RequestMethod.GET)
    public ArrayList<Invoice> getInvoiceByCustomer(@PathVariable int customerId)
    {
        ArrayList<Invoice> invoice= DatabaseInvoice.getInvoiceByCustomer(customerId);
        return invoice;
    }


    @RequestMapping(value = "invoice/invoiceStatus/{id}", method = RequestMethod.PUT)
    public Invoice changeInvoiceStatus(@PathVariable int id, @PathVariable InvoiceStatus status)
    {
       boolean i = DatabaseInvoice.changeInvoiceStatus(id,status);
       if(i){
           try {
               return DatabaseInvoice.getInvoiceById(id);
           }catch (InvoiceNotFoundException e){
               System.out.println(e.getMessage());
               //return null;
           }
       }
       return null;
    }

    @RequestMapping(value = "invoice/{id}", method = RequestMethod.DELETE)
    public Boolean removeInvoice(@PathVariable int id)
    {
        try{
            if(DatabaseInvoice.removeInvoice(id))
            {
                return true;
            }
        } catch (InvoiceNotFoundException e){
            System.out.println(e.getMessage());
            //return null;
        }
        return false;
    }
    @RequestMapping(value = "invoice/createCashInvoice", method = RequestMethod.POST)
    public Promo addCashInvoice( @RequestParam(value = "food") ArrayList<Integer> foodId,
                                 @RequestParam(value = "customer") int customerId,
                                 @RequestParam(value = "deliveryFee") int deliveryFee) //int id, String name, String email, String password, Calendar joinDate
    {
        ArrayList<Food> foodList = new ArrayList<>();
        Customer customer = null;
        for (Integer i: foodId) {
            try {
                foodList.add(DatabaseFood.getFoodById(i));
            } catch (FoodNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }

    @RequestMapping(value = "invoice/createCashlessInvoice", method = RequestMethod.POST)
    public Invoice addCashlessInvoice(@RequestParam(value = "foodIdList") ArrayList<Integer> foodId,
                                      @RequestParam(value = "customerId") int customerId,
                                      @RequestParam(value = "promoCode") String promoCode)
    {
        ArrayList<Food> foodList = new ArrayList<>();
        Customer customer = null;
        for (Integer i: foodId) {
            try {
                foodList.add(DatabaseFood.getFoodById(i));
            } catch (FoodNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }


//    @RequestMapping(value = "/cashinvoice", method = RequestMethod.POST)
//    public Promo addPromo(@RequestParam(value = "food") ArrayList<Food> food,
//                          @RequestParam(value = "customer") Customer customer,
//                          @RequestParam(value = "deliveryFee") int deliveryFee
//    ) //int id, String name, String email, String password, Calendar joinDate
//    {
//
//    }
//
//    @RequestMapping(value = "/cashlessinvoice", method = RequestMethod.POST)
//    public Promo addPromo(@RequestParam(value = "food")  ArrayList<Food> food,
//                          @RequestParam(value = "customer") Customer customer,
//                          @RequestParam(value = "promo") promo promo
//    )//int id, String code, int discount, int minPrice, boolean active
//    {
//
//    }

}