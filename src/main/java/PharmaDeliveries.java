import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

ArrayList<String> inComing = new ArrayList<>();
inComing.add(16/01/2026);
inComing.add(17/02/2026);
inComing.add(31/12/2025);
inComing.add(01/01/2026);

public class PharmaDeliveries {

    private String medicineName;
    private Medicine medicineRef;
    private LocalDate deliveryDate;
    private int quantityDelivered;

    public static LocalDate addDelivery(LocalDate deliveryDate) {
        String newArray[] = medicineName + inComing;
        return newArray;
    }

    public static String findAllDeliveries() {
        return newArray.length;
    }

    public static String findAllDeliveries() {
        return inComing;
    }

    public static String deleteDeliveries() {
        String newArray[] = medicineName - inComing;
        return newArray;
    }
}
