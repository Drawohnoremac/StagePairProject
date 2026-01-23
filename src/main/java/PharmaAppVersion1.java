package com.mycompany.groupproject;
import java.time.LocalDate;

public class PharmaAppVersion1 {
    public static void main(String[] args) {
        //Create suppliers
        PharmaSupplier  sup1 = new PharmaSupplier("Boots", "Dublin Road", 0, 450);
        PharmaSupplier  sup2 = new PharmaSupplier("Care Plues", "Shankhill Road", 2, 600);
        PharmaSupplier  sup3 = new PharmaSupplier("We Care", "Bridge Street", 1, 4251);

        //Create medicines
        Medicine m1 = new Medicine("Acetaminophen", "M001", 20, 30, 50, 0.15, sup1, false);
        Medicine m2 = new Medicine("Tylenol", "M002", 90, 20, 40, 0.25, sup1, false);
        Medicine m3 = new Medicine("Allopurinal", "M003", 100, 35, 45, 0.23, sup2, false);
        Medicine m4 = new Medicine("Metformin", "M004" 80, 20, 30, 0.15, sup3, false);
        Medicine m5 = new Medicine("Amlodipine:", "M005" 70, 25, 30, 0.35, sup2, false);

        //Create deliveries
        MedicineDelivery d1 = new MedicineDelivery(m1, LocalDate.now(), 50);
        MedicineDelivery d2 = new MedicineDelivery(m3, LocalDate.now(), 25);
        MedicineDelivery d3 = new MedicineDelivery(m5, LocalDate.now(), 30);

        //Show before delivery d1
        System.out.println("Before delivery:");
        System.out.println("Stock: " + m1.getQuantityInStock());
        System.out.println("Owed: " + sup1.getAmountOwed());

        //Process delivery d1
        m1.increaseStock(d1.getQuantityDelivered());
        sup1.increaseAmountOwed(d1.calculateDeliveryCost());

        System.out.println("Cost of delivery d1: " + d1.calculateDeliveryCost());

        // Show after delivery d1
        System.out.println("After delivery:");
        System.out.println("Stock: " +m1.getQuantityInStock());
        System.out.println("Owed: " + sup1.getAmountOwed());
    }
}