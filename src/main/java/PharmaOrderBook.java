import java.util.ArrayList;
import java.util.Arrays;

ArrayList<String> orders = new ArrayList<>();
orders.add("Metformin");
orders.add("Sertraline");
orders.add("Lisinopril");
orders.add("Amlodipine");

public abstract class PharmaOrderBook {
    private PharmaSupplier supplierRef;
    private int orderDate;
    private int quantity;
    private double uniqueId;

    //No Argument Constructor
    public PharmaOrderBook(PharmaSupplier supplierRef, int orderDate, int quantity, double uniqueId) {
           this.supplierRef = supplierRef;
           this.orderDate = orderDate;
           this.quantity = quantity;
           this.uniqueId = uniqueId;
    }

}
