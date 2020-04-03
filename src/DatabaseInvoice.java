import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DatabaseInvoice {

    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    public DatabaseInvoice()
    {
        // initialise instance variables
    }
    public static ArrayList<Invoice> getInvoiceDatabase()
    {
        return INVOICE_DATABASE;
    }
    public static int getlastId()
    {
        return lastId;
    }

    public static Invoice getInvoiceById(int id)
    {
        boolean checker = false;
        for(int i=0;i<INVOICE_DATABASE.size();i++){
            if(INVOICE_DATABASE.get(i).getId() == id){
                checker = true;
                return INVOICE_DATABASE.get(i);
            }
        }
        return null;
    }

    public static ArrayList<Invoice> getInvoiceByCustomer (int customerId)
    {
        ArrayList<Invoice> i = new ArrayList<>();
        for (Invoice invoice : INVOICE_DATABASE){
            if(invoice.getCustomer().getId() == customerId){
                i.add(invoice);
            }
        }
        return i;
    }

    public static boolean addInvoice(Invoice invoice)
    {
        if (INVOICE_DATABASE.add(invoice)) {
            INVOICE_DATABASE.indexOf(invoice);
            return true;
        }
        return false;
    }

//    public static boolean changeInvoiceStatus (int id, InvoiceStatus invoiceStatus)
//    {
//
//    }

    public static boolean removeInvoice(int id)
    {
        Invoice invoice1 = INVOICE_DATABASE.get(id);
        if (invoice1 != null) {
            INVOICE_DATABASE.remove(invoice1);
            return true;
        }
        return false;
    }
}
