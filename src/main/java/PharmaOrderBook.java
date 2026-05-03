package com.mycompany.groupproject;
import java.util.ArrayList;

public class PharmaOrderBook {
    private ArrayList<PharmaOrder> orders;


    public PharmaOrderBook() {
        orders = new ArrayList<>();
    }

    public void add(PharmaOrder order) {
        if (order != null) {
            orders.add(order);
        }
    }

    public void add(ArrayList<PharmaOrder> list) {
        if (list != null) {
            orders.addAll(list);
        }
    }

    public String toString() {
        String text= "";
        for (PharmaOrder o : orders) {
            text += o.String() + "\n";
        }
    return text;
    }

    public double calcOrderCost (String orderId, double unitCostPrice) {
        if  (unitCostPrice >= orderValueForDiscount) {
            unitCostPrice
            return unitCostPrice;
        }

        else {
            return unitCostPrice;
        }
    }
}