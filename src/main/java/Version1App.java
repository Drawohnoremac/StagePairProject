package com.mycompany.groupproject;
import java.time.LocalDate;

public class Version1App {
    public static void main(String[] args) {
        //Create suppliers
        PharmaSupplier  sup1 = new PharmaSupplier("We Care", "Hill Street", 0, 5000);
        PharmaSupplier  sup2 = new PharmaSupplier("Boots", "Marshes Upper", 0, 7000);
        PharmaSupplier  sup3 = new PharmaSupplier("CarePlus", "Dublin Road", 0, 6000);

        //Create medicines
        Medicine m1 = new Medicine("Paracetamol", "M001", 100, 50, 200, 0.10, sup1, false);
        Medicine m2 = new Medicine("Ibuprofen", "M002", 80, 40, 150, 0.20, sup1, false);
        Medicine m3 = new Medicine("Amoxicillin", "M003", 30, 20, 100, 0.50, sup2, false);
        Medicine m4 = new Medicine("Vitamin C", "M004", 200, 100, 300, 0.15, sup3, false);
        Medicine m5 = new Medicine("Aspirin:", "M005", 60, 30, 150, 0.18, sup2, false);

        //Create deliveries
        MedicineDelivery d1 = new MedicineDelivery(m1, LocalDate.now(), 50);
        MedicineDelivery d2 = new MedicineDelivery(m3, LocalDate.now(), 40);
        MedicineDelivery d3 = new MedicineDelivery(m5, LocalDate.now(), 20);

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