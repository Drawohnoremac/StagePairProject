import java.util.ArrayList;

public class Version2App {
    private String medicineName;
    private String medicineCode;
    private int quantityInStock;
    private int reorderLevel;
    private int reorderQuantity;
    private double unitCostPrice;
    private PharmaSupplier supplierRef;
    private boolean onOrderFlag;
    private Medicine medicineRef;
    private LocalDate deliveryDate;
    private int quantityDelivered;
    private ArrayList<Medicine> medicine;
    private ArrayList<PharmaOrder> orders;
    private ArrayList<MedicineDelivery> medicineDeliveries;

    // Increase stock
    public boolean increaseStock(int quantity) {
        if (quantity <= 0) return false;

        quantityInStock += quantity;
        return true;
    }


    // Increase stock
    public boolean increaseStock(int quantity) {
        if (quantity <= 0) return false;

        unitCostPrice += quantity;
        return true;
    }


}
