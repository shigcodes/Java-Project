package polymorphismFinalExam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter patient's blood type: ");
        String patientBloodType = scanner.nextLine();
        
        BloodType patientType;
        
        switch (patientBloodType.toUpperCase()) {
            case "A+":
                patientType = new APositiveBloodType();
                break;
            case "A-":
                patientType = new ANegativeBloodType();
                break;
            case "B+":
                patientType = new BPositiveBloodType();
                break;
            case "B-":
                patientType = new BNegativeBloodType();
                break;
            case "AB+":
                patientType = new ABPositiveBloodType();
                break;
            case "AB-":
                patientType = new ABNegativeBloodType();
                break;
            case "O+":
                patientType = new OPositiveBloodType();
                break;
            case "O-":
                patientType = new ONegativeBloodType();
                break;
            default:
                System.out.println("Invalid blood type entered.");
                return;
        }
        
        System.out.println("Patient's blood type: " + patientType.getType());
        
        System.out.println("Enter donor's blood type: ");
        String donorBloodType = scanner.nextLine();
        
        BloodType donorType;
        
        switch (donorBloodType.toUpperCase()) {
            case "A+":
                donorType = new APositiveBloodType();
                break;
            case "A-":
                donorType = new ANegativeBloodType();
                break;
            case "B+":
                donorType = new BPositiveBloodType();
                break;
            case "B-":
                donorType = new BNegativeBloodType();
                break;
            case "AB+":
                donorType = new ABPositiveBloodType();
                break;
            case "AB-":
                donorType = new ABNegativeBloodType();
                break;
            case "O+":
                donorType = new OPositiveBloodType();
                break;
            case "O-":
                donorType = new ONegativeBloodType();
                break;
            default:
                System.out.println("Invalid blood type entered.");
                return;
        }
        
        System.out.println("Donor's blood type: " + donorType.getType());
        
        boolean compatibility = patientType.isCompatibleWith(donorType);
        
        if (compatibility) {
        	System.out.println("-------------------------------------------------------");
            System.out.println("The patient and donor blood types are compatible.");
        	System.out.println("-------------------------------------------------------");
        } else {
        	System.out.println("-------------------------------------------------------");
            System.out.println("The patient and donor blood types are not compatible.");
        	System.out.println("-------------------------------------------------------");
        }
        
        scanner.close();
    }
}

