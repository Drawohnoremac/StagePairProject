package com.mycompany.groupproject;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class PharmaSupplierCollection {

            com.mycompany.groupproject.PharmaSupplierCollection suppliers;

            PharmaSupplierCollection() {
                ArrayList<com.mycompany.groupproject.PharmaSupplierCollection> suppliers = new ArrayList<>();

        public boolean add (com.mycompany.groupproject.PharmaSupplier suppliers, ArrayList<com.mycompany.groupproject.PharmaSupplierCollection> suppliers){
            suppliers.add(new suppliers("Pfizer", "400 Park Street", 250, 530));
            suppliers.add(new suppliers("Johnson & Johnson", "20 Green Street", 30, 67));
            suppliers.add(new suppliers("AbbVie", "160 Phillips Street", 600, 420));
            suppliers.add(new suppliers("Novartis", "126 Red Street", 42, 326));
            suppliers.add(new suppliers(2, "Takeda MSD", "23 Brown Street", 12, 460));

            if (suppliers == null) {
                return false;
            } else {
                return true;
            }
        }

        public String add(String fileName) {
            return fileName;
        }

        public<ArrayList> displayAll() {
         ArrayList.displayAll();
         return suppliers;
        }
        public String storeSuppliers(String fileName) {
            return fileName;
        }

}
