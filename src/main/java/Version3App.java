package com.mycompany.groupproject;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;



public class Version3App {

    //No argument constructor
    com.mycompany.groupproject.PharmaSupplierCollection group1() {
        ArrayList<com.mycompany.groupproject.PharmaSupplierCollection> suppliers = new ArrayList<>();

    }

    //Parametrized Constructor
    com.mycompany.groupproject.PharmaSupplierCollection group2(com.mycompany.groupproject.PharmaSupplierCollection suppliers) {
        suppliers = new com.mycompany.groupproject.PharmaSupplierCollection("suppliers_out.txt");

    }

    public static void main(String[] args) {
        try (com.mycompany.groupproject.PharmaSupplierCollection suppliers = new com.mycompany.groupproject.PharmaSupplierCollection("suppliers.txt")) {
            suppliers = new ArrayList<>();
        }

        catch (Exception e) {

        }

        static void add() {
        System.out.println("suppliers.txt");
        }

        add();

        public displayAll()  {

        }
    }
}
