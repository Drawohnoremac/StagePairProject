public class PharmaSupplier {
    private String supplierName;
    private String supplierAddress;
    private double amountOwed;
    private double creditLimit;

    //No Argument Constructor
    public PharmaSupplier() {
        supplierName = "";
        supplierAddress = "";
        amountOwed = 0.0;
        creditLimit = 0.0;
    }

    //Constructor with parameters
    public PharmaSupplier(String supplierName, String supplierAddress, double amountOwed, double creditLimit) {
        this.supplierName = supplierName;
        this.supplierAddress = supplierAddress;
        this.amountOwed = amountOwed;
        this.creditLimit = creditLimit;
    }

    //Getters and Setters
    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public double getAmountOwed() {
        return amountOwed;
    }

    public void setAmountOwed(double amountOwed) {
        this.amountOwed = amountOwed;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    //Increase amount owed
    public boolean increaseAmountOwed(double amount) {
        if (amount <= 0) return false;

        double newAmount =  amountOwed + amount;

        if (newAmount <= creditLimit) {
            amountOwed = newAmount;
            return true;
        }
        return false;
    }

    public boolean decreaseAmountOwed(double amount) {

        if (amount <= 0) return false;

        double newAmount =  amountOwed - amount;

        if(newAmount <= creditLimit) {
            amountOwed = newAmount;
            return true;
        }
        return false;
    }

    //Display supplier details
    public String toString() {
        return "Supplier: " + supplierName + "\n" +
                ", Address: " + supplierAddress +
                ", Amount Owed: " + amountOwed +
                ", Credit Limit: " + creditLimit;
    }
}


