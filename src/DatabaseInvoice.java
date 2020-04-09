import java.util.ArrayList;

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
    public static int getLastId()
    {
        return lastId;
    }

    public static Invoice getInvoiceById(int id)
    {
        for (Invoice invoice : INVOICE_DATABASE)
        {
            if (invoice.getId() == id)
            {
                return invoice;
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
        for (Invoice i : INVOICE_DATABASE)
        {
            if(i.getCustomer().equals(invoice.getCustomer()) && invoice.getInvoiceStatus().equals(InvoiceStatus.ONGOING))
            {
                return false;
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    public static boolean changeInvoiceStatus (int id, InvoiceStatus invoiceStatus)
    {
        for (Invoice i : INVOICE_DATABASE)
        {
            if(i.getId() == id && i.getInvoiceStatus().equals(InvoiceStatus.ONGOING))
            {
                i.setInvoiceStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }

    public static boolean removeInvoice(int id)
    {
        for (Invoice i : INVOICE_DATABASE)
        {
            if(i.getId() == id)
            {
                INVOICE_DATABASE.remove(i);
                return true;
            }
        }
        return false;
    }
}
