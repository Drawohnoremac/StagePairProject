package.com.mycompany.groupproject;
import java.time.LocalDate;




public class PharmaOrder {
    private Medicine medicineRef;
    private LocalDate orderDate;
    private int quantity;
    private String uniqueId;

    public PharmaOrder(Medicine medicineRef, LocalDate orderDate, int quantity, String uniqueId) {
        this.medicineRef = medicineRef;
        this.orderDate = orderDate;
        this.quantity = quantity;
        this.uniqueId = uniqueId;
    }

    public PharmaSupplier getMedicineRef () {
         return medicineRef;
    }

    @Override
    public String toString () {
        return "Order " + uniqueId + " | " + medicineRef.getMedicineName() +
                " | Qty: " + quantity + " | Date: " + orderDate;
    }


}
