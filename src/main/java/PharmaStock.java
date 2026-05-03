



package com.mycompany.groupproject;
import java.time.LocalDate;
import java.util.ArrayList;

public class PharmaStock {

    private ArrayList<Medicine> products;

    //Static counter shared by all PharmaStock objects
    private static int nextId = 1;

    public PharmaStock() {
        products = new ArrayList<>();
    }
    public void add(Medicine m) {
        if (m != null) products.add(m);
    }
    public Medicine findMedicine(String name) {
        for (Medicine m : products) {
            if (m.getMedicineName().equalsIgnoreCase(name))  {
                return m;
            }
        }
        return null;
    }
    public String findExpensive() {
        if (products.isEmpty()) return null;

        Medicine expensive = products.get(0);
        for (Medicine m : products) {
            if (m.getUnitCostPrice() > expensive.getUnitCostPrice()) {
                expensive = m;
            }
        }
        return expensive.getMedicineName();

    }

    public Medicine findCheapest() {
        if (products.isEmpty()) return null;

        Medicine cheapest = products.get(0);
        for (Medicine m : products) {
            if (m.getUnitCostPrice() < cheapest.getUnitCostPrice()) {
                cheapest = m;
            }
        }
        return cheapest;
    }

    public ArrayList<PharmaOrder> createOrders () {
        ArrayList<PharmaOrder> orders = new ArrayList<>();

        for (Medicine m : products) {
            if (!m.isOnOrderFlag() && m.getQuantityInStock() <= m.getReorderLevel()) {

                String id = "ORD" + nextId;   // use static counter
                nextId++;                     // increase share counter

                PharmaOrder order = new PharmaOrder(m, LocalDate.now(), m.getReorderQuantity(), id);
                orders.add(order);

                m.setOnOrderFlag(true);
            }
        }
        return orders;
    }

    public displayByName() {

    }

    public displayByQty() {

    }

    public createSupplierMap() {

    }
}
