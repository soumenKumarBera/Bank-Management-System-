import service.BankService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        BankService services = new BankService();
        int choice;
        do{

            System.out.println("=================================");
            System.out.println("\t\t\tKB Bank");
            System.out.println("=================================");
            System.out.println("Welcome!\nChoose one of the following options : ");
            System.out.println("1. Create new bank account");
            System.out.println("2. Close account");
            System.out.println("3. Withdraw funds");
            System.out.println("4. Deposit funds");
            System.out.println("5. Transfer funds to another account");
            System.out.println("6. View transaction history");
            System.out.println("7. View bank account details");
            System.out.println("8. Update account holder's details");
            System.out.println("9. EXIT");
            System.out.println("=================================");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
           switch (choice){
               case 1:
                   System.out.println("For creating a bank account, please provide the following details of bank account holder: ");
                   System.out.print("First name : ");
                   String fname = sc.next();

                   System.out.print("Last name : ");
                   String lname = sc.next();
                   sc.nextLine();

                   System.out.print("email-id : ");
                   String email = sc.nextLine();

                   System.out.print("Phone number : ");
                   String  phoneNumber= sc.nextLine();

                   System.out.print("Address : ");
                   String address = sc.nextLine();

                   System.out.print("Aadhar number : ");
                   long adharNumber = sc.nextLong();
                   sc.nextLine();
                   System.out.print("PAN number : ");
                   String panNumber = sc.nextLine();

                   services.createAccount(fname, lname, email, phoneNumber,  address, adharNumber, panNumber);
                   break;
               case 2:
               case 3:
               case 4:
               case 5:
               case 6:
               case 7:
               case 8:
               case 9:break;
               default: System.out.println("Invalid option selected.\nKindly choose a valid option again.");
                break;


           }



        } while(choice != 9);

    }

}
