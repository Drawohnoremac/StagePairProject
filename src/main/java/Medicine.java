package com.mycompany.groupproject;

public class Medicine {
    private String medicineName;
    private String medicineCode;
    private int quantityInStock;
    private int reorderLevel;
    private int reorderQuantity;
    private double unitCostPrice;
    private PharmaSupplier supplierRef;
    private boolean onOrderFlag;

    // No argument constructor
    public Medicine() {
        medicineName = "";
        medicineCode = "";
        quantityInStock = 0;
        reorderLevel = 0;
        reorderQuantity = 0;
        unitCostPrice = 0.0;
        supplierRef = null;
        onOrderFlag = false;
    }

    // Constructor with parameters
    public Medicine(String medicineName, String medicineCode, int quantityInStock,
                    int reorderLevel, int reorderQuantity, double unitCostPrice,
                    PharmaSupplier supplierRef, boolean onOrderFlag) {

        this.medicineName = medicineName;
        this.medicineCode = medicineCode;
        this.quantityInStock = quantityInStock;
        this.reorderLevel = reorderLevel;
        this.reorderQuantity = reorderQuantity;
        this.unitCostPrice = unitCostPrice;
        this.supplierRef = supplierRef;
        this.onOrderFlag = onOrderFlag;
    }

    // getter and setters
    public String getMedicineName() {
        return medicineName;
    }

    public String getMedicineCode() {
        return medicineCode;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public int getReorderQuantity() {
        return reorderQuantity;
    }

    public double getUnitCostPrice() {
        return unitCostPrice;
    }

    public PharmaSupplier getSupplierRef() {
        return supplierRef;
    }

    public boolean isOnOrderFlag() {
        return onOrderFlag;
    }
    public void setOnOrderFlag(boolean value) {
        onOrderFlag = value;
    }

    // Increase Stock
    public boolean increaseStock(int quantity) {
        if (quantity <= 0) return false;

        quantityInStock += quantity;
        return true;
    }

//Decrease stock
public boolean decreaseStock(int quantity) {
    if (quantity <= 0) return false;
    if(quantityInStock - quantity < 0) return false;

    quantityInStock -= quantity;
    return true;
}

public String toString() {
    String s = (SupplierRef != null) ? supplierRef.getSupplierName() : "None";

    return "Medicine: " + medicineName +
            ", Code: " + medicineCode +
            ", Stock: " + quantityInStock +
            ", Unit Cost: " + unitCostPrice +
            ", Supplier: " + s;
}
}
