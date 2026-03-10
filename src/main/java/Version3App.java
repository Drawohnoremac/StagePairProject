package com.mycompany.groupproject;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Version3App {

    //No argument constructor
    com.mycompany.groupproject.PharmaSupplierCollection group1() {

    }

    //Parametrized Constructor
    com.mycompany.groupproject.PharmaSupplierCollection group2(com.mycompany.groupproject.PharmaSupplierCollection suppliers) {
        suppliers = new com.mycompany.groupproject.PharmaSupplierCollection("suppliers_out.txt");

    }

    public static void main(String[] args) {
        try (com.mycompany.groupproject.PharmaSupplierCollection suppliers = new com.mycompany.groupproject.PharmaSupplierCollection("suppliers.txt")) {

            if {

            }

            else {

            }
        }

        catch (Exception e) {
             System.out.println("An error occurred.");
             e.printStackTrace();
        }
    }
}
