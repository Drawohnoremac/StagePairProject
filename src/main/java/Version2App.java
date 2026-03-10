



package com.mycompany.groupproject;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;





public class Version2App {
    public static void main(String[] args) {

        PharmaStock stock = new PharmaStock();
        PharmaDeliveries deliveries = new PharmaDeliveries();

        PharmaSupplier sup1 = new PharmaSupplier("Adam Smith", "Main St", 0, 5000);
        PharmaSupplier sup2 = new PharmaSupplier("Beta Pharma", "Park Road", 0, 8000);

        Medicine m1 = new Medecine("Paracetemol", "M001", 20, 50, 100, 0.10, sup1, false);
        Medicine m2 = new Medecine("Ibuprofen", "M002", 10, 40, 80, 0.20, sup1, false);
        Medicine m3 = new Medecine("Amoxicilian", "M003", 15, 20, 50, 0.50, sup2, false);
        Medicine m4 = new Medecine("Paracetemol", "M001", 20, 50, 100, 0.10, sup1, false);

        stock.add(m1);
        stock.add(m2);
        stock.add(m3);
        stock.add(m4);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 deliveries:");

        for (int i = 0; i < 3; i++) {

            System.out.println("Medicine name: " );
            String name = sc.nextLine();

            System.out.println("Quantity delivered: " );
            int qty = Integer.parseInt(sc.nextLine());

            Medicine med = stock.findMedicine(name);

            if (med == null) {
                System.out.println("Medicine not found");
                continue;
            }

            MedicineDelivery d = new MedicineDelivery(med, LocalDate.now(), qty);
            deliveries.addDelivery(d);
            med.increaseStock(qty);

            double cost = qty * med.getUnitCostPrice();
            med.getSupplierRef().increaseAmountOwed(cost);

            med.setOnOrderFalse(false);

            System.out.println("Delivery added.");
        }

        PharmaOrder orderBook = stock.createOrders();

        ArrayList<PharmaOrders> orders = stock.CreateOrders();
        orderBook.add(orders);

        System.out.println("\nOrders created:");
        System.out.println(orderBook);

        int deleted = deliveries.deleteDeliveries("Adam Smith");
        System.out.println("Deliveries deleted: " + deleted);

        System.out.println("\nCheapest:");
        System.out.println(stock.findCheapest());

        String expName = sc.findExpensive();
        Medicine expMed = stock.findMedicine(expName);
        System.out.println("\nMost expensive:);
        System.out.println(expMed);

        System.out.println("\nDeliveries of Paracetemol:");
        ArrayList<MedicineDelivery> list = deliveries.findAllDeliveries("Paracetemol");
        for (MedicineDelivery d : list) {
             System.out.println(d);
        }
    }

}
