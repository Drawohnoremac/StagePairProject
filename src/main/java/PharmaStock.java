import java.util.ArrayList;
public class PharmaStock {

    private Medicine[] products;
    private boolean onOrderFlag;
    private int quantityInStock;
    private int reorderLevel;

    //No Argument Constructor
    public PharmaStock(Medicine[] products) {
        this.products = products;
        this.onOrderFlag = false;
        this.quantityInStock = 0;
        this.reorderLevel = 0;
    }
    public static void add(Medicine[] products) {

    }
    findMedicine(medicine[] products) {

    }

    findExpensive() {

    }

    findCheapest() {

    }

    abstract class createOrders (boolean onOrderFlag, int quantityInStock, int reorderLevel) {
        if (onOrderFlag == false && quantityInStock <= reorderLevel) {
            return false;
        }
    }
}
