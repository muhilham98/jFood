public class PriceCalculator implements Runnable{
    Invoice a;

    PriceCalculator(Invoice a){
        this.a = a;
    }
    public void run()
    {
        System.out.println("calculating invoice id: " + a.getId());
        a.setTotalPrice();
        System.out.println("finish calculating invoice id: " + a.getId());
    }
}
