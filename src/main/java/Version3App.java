package com.mycompany.groupproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Version3App {
    public static void main(String[] args) throws IOException {

    PharmaSupplierCollection group1 = new PharmaSupplierCollection();

        boolean loaded = group1.add("suppliers.txt");

        System.out.println("suppliers.txt processed: " + loaded);

        System.out.println("\n All Suppliers");
        group1.displayAll();

        System.out.println("\n creditors");
        group1.displayCreditors();

        System.out.println("\n Invalid records");
        displayInvalidRecords("invalidSupplier.txt");

        boolean stored = group1.storeSuppliers("suppliers_out.txt");

        System.out.println("\nStored Suppliers: " + stored);

        PharmaSupplierCollection group2 = PharmaSupplierCollection("suppliers_out.txt");

        System.out.println("\nSuppliers");
        group2.displayAll();
    }
    public static void displayInvalidRecords(String filename) {

        if (fileName == null || fileName.isBlank()) {
            System.out.println("Invalid file name.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = br.readLine() != null)) {
                System.out.println(line);
            }
        } catch (IOException e){
            System.out.println("No valid records found.")

        }
    }
}
