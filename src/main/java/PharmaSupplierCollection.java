package com.mycompany.groupproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Comparator;

public class PharmaSupplierCollection {

           private ArrayList<PharmaSupplier> suppliers;
            public PharmaSupplierCollection() {
                suppliers = new ArrayList<>();
            }

           public PharmaSupplierCollection(String fileName) {
               suppliers = new ArrayList<>();
               add(fileName);
           }

        public boolean add(PharmaSupplier supplier){
            if (supplier != null) {
                return suppliers.add(supplier);
            } else {
                return false;
            }
        }

        public boolean add(String fileName) {

            if (fileName == null || fileName.isBlank()) {
                return false;
            }

            try (BufferedWriter clear = new BufferedWriter(new FileWriter("invalidSupplier.txt"))) {

            } catch (IOException e) {

            }

            try (BufferedReader br = new BufferedReader(new FileReader(fileName));
                 BufferedReader invalidOut = new BufferedWriter(new FileWriter("invalidSupplier.txt", true))) {

                String line;

                while ((line = br.readLine()) != null) {

                    if (line.trim.isEmpty()) {
                        writeInvalid(invalidOut, line, "Blank line");
                        continue;
                    }

                    String[] parts = line.split(",");

                    if (parts.length != 4) {
                        writeInvalid(invalidOut, line, "Missing name or address");
                        continue;
                    }

                    double owed;
                    double limit;

                    try {
                        owed = Double.parseDouble(owedStr);
                        limit = Double.parseDouble(limitStr);
                    } catch (numberFormatException e) {
                        writeInvalid(invalidOut, line, "Invalid number format");
                        continue;
                    }

                    if (owed < 0) {
                        writeInvalid(invalidOut, line, "amountOwed cannot be negative");
                        continue;
                    }

                    if (limit < 0) {
                        writeInvalid(invalidOut, line, "amountOwed cannot be negative");
                        continue;
                    }

                    if (owed < 0) {
                        writeInvalid(invalidOut, line, "amountOwed cannot be negative");
                        continue;
                    }

                    if (owed > limit) {
                        writeInvalid(invalidOut, line, "amountOwed exceeds creditLimit");
                        continue;
                    }

                    PharmaSupplier supplier = new PharmaSupplier(name, address, owed, limit);
                    suppliers.add(supplier);
                }

                return true;

            } catch (IOException e) {
                return false;
            }
        }

        public void displayAll() {
            suppliers.stream()
                    .sorted(Comparator.comparing(
                            PharmaSupplier::getSupplierName,
                            String.CASE_INSENSITIVE_ORDER))
                    .forEach(System.out::println);
        }

        public void displayCreditors() {
            suppliers.stream()
                    .sorted(Comparator.comparing(
                            PharmaSupplier::getAmountOwed).reserved())
                    .forEach(System.out::println);
        }

        public boolean storeSuppliers(String fileName) {

            if (fileName == null || fileName.isBlank()) {
                return false;
            }

            try (BufferedWriter out = new BufferedWriter(new FileWriter(fileName)) {

                for (PharmaSupplier : suppliers) {
                    out.write(s.getSupplierName() + "," +
                                    s.getSupplierAddress() + "," +
                                    s.getAmountOwed() + "," +
                                    s.getCreditLimit() + "," +
                    out.newLine();
                }

                return true;

            } catch (IOException e)  {
                return false;
            }
        }

        private void writeInvalid(BufferedWriter writer, String record, String reason) throws IOException {
            writer.write("INVALID RECORD: " + record);
            writer.newLine();
            writer.write("REASON" + reason);
            writer.newLine();
            writer.newLine();
        }
}
