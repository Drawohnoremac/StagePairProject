package com.mycompany.groupproject;
import java.time.LocalDate;

public class MedicineDelivery {

    private Medicine medicineRef;
    private LocalDate deliveryDate;
    private int quantityDelivered;

    //No argument constructor
    public MedicineDelivery {
        medicineRef = null;
        deliveryDate = LocalDate.now();
        quantityDelivered = 0;
    }

    //Constructor with parameters
    public MedicineDelivery(Medicine medicineRef, LocalDate deliveryDate, int quantityDelivered) {
        this.medicineRef =  medicineRef;
        this.deliveryDate = deliveryDate;
        this.quantityDelivered = quantityDelivered;
    }

    public Medicine getMedicineRef() {
        return medicineRef;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public int getQuantityDelivered() {
        return quantityDelivered;
    }

    // Calculate cost
    public double calculateDeliveryCost() {
        if (medicineRef = null) return 0;
        return quantityDelivered * medicineRef.getUnitCostPrice();
    }

    //Override the toString() method
    @Override
    public String toString() {
        return "Delivery of " +  medicineRef.getMedicineName() +
               " on " + deliveryDate +
               "Qty: " + quantityDelivered +
                "Cost: " + calculateDeliveryCost();
    }
}




