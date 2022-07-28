import java.util.Scanner;
public class BankingApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean condition= true;
        int[] accountNumber=new int[100]; 
        double[] accountBalance = new double[100];
        String[] accountName = new String[100]; 
        int option, size = 0;
        System.out.println("Add Customer Menu");
        System.out.println("Enter Name: "); 
        String name=sc.nextLine(); 
        accountName[size] = name;
        System.out.println("Enter Account number: "); 
        int acc_number= sc.nextInt(); 
        accountNumber [size]=acc_number;
        System.out.println("Enter Opening Balance Amount: ");
        double amt= sc.nextDouble(); 
        accountBalance[size] = amt;
        System.out.println("Account created successfully. \n"); 
        System.out.println("Account Details:- \n ");
        System.out.println("Account Number: " + accountNumber[size]); 
        System.out.println("Account Name:" + accountName [size]);
        System.out.println("Account Balance: " + accountBalance[size]+" Rs \n");
        size =size+ 1;
        while (condition) {
            System.out.println("***** Select any one option ****** ");
            System.out.println("1 Add Customer"); 
            System.out.println("2 Change Name");
            System.out.println("3 Check Balance"); 
            System.out.println("4 Update Balance");
            System.out.println("5 Summary of Accounts"); 
            System.out.println("6 Quit");
            System.out.println("***********************************");
            System.out.print("Enter Selection: ");
            option= sc.nextInt();
            if(option == 1) {
                sc.nextLine();
                System.out.print("\nEnter Name: "); 
                name=sc.nextLine(); 
                accountName[size] = name;
                System.out.print ("\nEnter Account number: "); 
                acc_number= sc.nextInt(); 
                accountNumber [size]=acc_number;
                System.out.print("Enter Opening Balance Amount: ");
                amt= sc.nextDouble(); 
                accountBalance[size] = amt;
                System.out.println("Account created successfully. \n"); 
                System.out.println("Account Details:- \n ");
                System.out.println("Account Number: " + accountNumber[size]); 
                System.out.println("Account Name:" + accountName [size]);
                System.out.println("Account Balance: " + accountBalance[size]+" Rs \n");
            }else if (option== 2) {
                System.out.println("\nChange Name Menu"); 
                System.out.print("\nEnter your Account Number: ");
                int accountIndex;
                String temp;
                accountIndex = sc.nextInt();
                sc.nextLine();
                for(int i=0;i<size;i++){
                if (accountNumber[i] !=accountIndex && i==(size-1)) {
                    System.out.println("Account does not exist."); 
                    System.out.println("Escaping");
                } else {
                    temp = accountName[i];
                    System.out.print("Enter the new name: "); 
                    name = sc.nextLine();
                    accountName[i] = name;
                    System.out.println("Nane is successfully updated from " + temp + " to " + name );
                }}
            }else if (option == 3) {
                System.out.println("\nCheck Account Balance Menu"); 
                System.out.print("\nEnter your Account Number: ");
                int accountIndex; 
                accountIndex = sc.nextInt();
                for(int i=0;i<size;i++){
                if (accountNumber[i] !=accountIndex && i==(size-1)) {
                    System.out.println("Account does not exist."); 
                    System.out.println("Escaping");
                } else {
                    System.out.println(accountName[i]+" your balance is " + accountBalance[i]);
                } }
            }else if (option == 4) {
                System.out.println("\nUpdate Account Balance Menu "); 
                System.out.print("\nEnter your Account Number: ");
                int accountIndex; 
                accountIndex = sc.nextInt();
                for(int i=0;i<size;i++){
                if (accountNumber[i] !=accountIndex && i==(size-1)) {
                    System.out.println("Account does not exist."); 
                    System.out.println("Escaping");  
                } else {
                    System.out.println("Enter the amount to be deposited: "); 
                    amt= sc.nextDouble();
                    accountBalance[i] += amt;
                    System.out.println(accountName [i] + "your updated balance is: "+ accountBalance[i]+" RS. \n");
                } }
            }else if (option == 5) {
                for (int i=0; i< size; i++) { 
                    System.out.println("Account number: "+i+" Name: " + accountName [1]+", Balance is: "+ accountBalance[i] +"Rs. \n");
                }
            }else if (option== 6) {
                System.out.println("****EXIT****"); 
                System.exit(0);
            }else {
                System.out.println("\n Invalid input."); 
                System.out.println("****EXIT****"); 
                System.exit(0);
            }
        }
        sc.close();
    }
}