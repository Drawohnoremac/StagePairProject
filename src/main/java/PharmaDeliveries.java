package com.mycompany.groupproject;
import java.time.LocalDate;
import java.util.ArrayList;

public class PharmaDeliveries {
    private ArrayList<MedicineDelivery> inComing;

    //Constructor
    public PharmaDeliveries() {
        inComing = new ArrayList<>();
    }

    // Add a delivery
    public void addDelivery(MedicineDelivery d) {
        if (d!= null) inComing.add(d);
    }

    //Find deliveries by date
    public ArrayList<MedicineDelivery> findAllDeliveries(LocalDate date) {
        ArrayList<MedicineDelivery> deliveries = new ArrayList<>();
        for (MedicineDelivery d: inComing) {
            if (d.getDelivery().equals(date)) {
                list.add(d);
            }
        }
        return list;
    }

    //Find deliveries by medicine name
    public ArrayList<MedicineDelivery> findAllDeliveries(String name) {
        ArrayList<MedicineDelivery> list = new ArrayList<>();
        for (MedicineDelivery d : inComing) {
            if (d.getMedicineRef().getMedicineName().equalsIgnoreCase(name)) {
                list.add(d);
            }
        }
        return list;
    }

    //Delete deliveries from a supplier
    public int deleteDeliveries(String supplierName) {
        int count = 0;

        for (int i = 0; i < inComing.size(); i++) {
            MedicineDelivery d = inComing.get(i);
            String sName = d.getMedicineRef().getSupplierRef().getSupplierName;

            if (sName.equalsIgnoreCase(supplierName)) {
                inComing.remove(i);
                i--;
                count++;
            }
        }

        return count;
    }
}
