import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Driver {

	  
		public static void main(String[] args) throws MadeupException {
	        PharmacyManagementSystem pharmacySystem = new PharmacyManagementSystem();
	        Scanner scanner = new Scanner(System.in);
	        
	        
	        String admin = "Senor Kazi Escobar";
	        int pass1 = 1122;
	        int pass2;
	        System.out.println(admin+ "\n "
	        		+ "Enter Password or YOU SHALL NOT PASS!");
	        pass2 = scanner.nextInt();
	        if(pass1==pass2) {
	        
	        
	        int choice;

	        do {
	            System.out.println("\nWelcome To Ecobar's Management System Menu:");
	            System.out.println("1. Add Medicine");
	            System.out.println("2. Purchase Non Addictive Drugs");
	            System.out.println("3. Display Medicines");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice from above mentioned no.: ");

	            choice = scanner.nextInt();
	            scanner.nextLine();
	            try {
	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Medicine Name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter Available Quantity: ");
	                    int quantity = scanner.nextInt();
	                    System.out.print("Enter Price: ");
	                    double price = scanner.nextDouble();

	                    Medicine newMedicine = new Medicine(name, quantity, price);
	                    pharmacySystem.addMedicine(newMedicine);
	                    break;

	                case 2:
	                    System.out.print("Enter Medicine Name to Purchase: ");
	                    String medicineNameToUpdate = scanner.nextLine();
	                    System.out.print("Enter Quantity of Purchase");
	                    int quantityChange = scanner.nextInt();
	                    pharmacySystem.purchase(medicineNameToUpdate, quantityChange);
	                    break;

	                case 3:
	                    pharmacySystem.displayMedicines();
	                    break;
	                case 4:
	                    System.out.println("Exiting Pharmacy Management System. Goodbye!");
	                    break;


	            }
	            handleInput(choice);
	            scanner.close();
	        }catch(MadeupException e){
                System.out.println(e.getMessage());
            }catch(InputMismatchException e){
                System.out.println(e.getMessage());
            }

	        } while (choice != 4);
	        scanner.close();

	      
	    }
		else
		{System.out.println("Access Denied!\nIm not saying anything without my lawyer present!");
	}
	        
		}



		 public static void handleInput(Integer choice) throws MadeupException {
		        if (choice!=1 || choice!=2 || choice!=3 || choice!=4 ) {
		            throw new MadeupException("Invalid number input. Please input from the mentioned numbers"); 
		        }  
		    }

}


