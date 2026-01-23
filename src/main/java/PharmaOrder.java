public class PharmaOrder {
    private PharmaSupplier supplierRef;
    private int orderDate;
    private int quantity;
    private double uniqueId;

    //No Argument Constructor
    public PharmaOrder () {
        supplierRef = "";
        orderDate = 0;
        quantity = 0;
        uniqueId = 0;
    }
    // Constructor
    public PharmaOrder(PharmaSupplier supplierRef, int orderDate, int quantity, double uniqueId) {
        this.supplierRef = supplierRef;
        this.orderDate = orderDate;
        this.quantity = quantity;
        this.uniqueId = uniqueId;
    }

    public PharmaSupplier getSupplierRef () {
         return supplierRef;
    }
    public void setSupplierRef (PharmaSupplier supplierRef) {
        this.supplierRef = supplierRef;
    }
    public int getOrderDate () {
        return orderDate;
    }
    public void setOrderDate (int orderDate) {
        this.orderDate = orderDate;
    }
    public int getQuantity () {
        return quantity;
    }
    public void setQuantity (int quantity) {
        this.quantity = quantity;
    }
    public double getUniqueId () {
        return uniqueId;
    }
    public void setUniqueId (double uniqueId) {
        this.uniqueId = uniqueId;
    }
    @Override
    public String toString () {
        'supplierRef:' + supplierRef +
        'orderDate:' + orderDate +
        'quantity:' + quantity +
        'uniqueId:' + uniqueId;
    }


}
