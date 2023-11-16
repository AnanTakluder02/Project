import java.util.ArrayList;
import java.util.List;



public class PharmacyManagementSystem {
    private List<Medicine> medicines;

    public PharmacyManagementSystem() {
        this.medicines = new ArrayList<>();
    }

    public void addMedicine(Medicine medicine) {
        if (medicines.size() < 4) {
            medicines.add(medicine);
            System.out.println("Medicine added successfully!");
        } else {
            System.out.println("Cannot add more than 4 medicines.");
        }
    }

    public void purchase(String medicineName, int quantity) {
        for (Medicine medicine : medicines) {
            if (medicine.getName().equals(medicineName) && ((medicine.getAvailableQuantity()>quantity)) )
            {
                int newQuantity = medicine.getAvailableQuantity() - quantity;
                medicine.setAvailableQuantity(newQuantity);
                System.out.println("Puchase Successfull!");
                
            }else {
        
        System.out.println("Error!.");}
            
    }
    }

    public void displayMedicines() {
        System.out.println("Medicine Inventory:");
        for (Medicine medicine : medicines) {
            System.out.println(medicine.getName() +
                    " - Available Quantity: " + medicine.getAvailableQuantity() +
                    ", Price: $" + medicine.getPrice());
        }
    }


}