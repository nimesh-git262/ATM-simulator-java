import java.util.Scanner;

public class BankManagmentSystem {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while (true){
            System.out.println("===BANK MANAGMENT SYSTEM===");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Check Balance");
            System.out.println("5. View Account Details");
            System.out.println("6. Transfer Money");
            System.out.println("7. Transaction History");
            System.out.println("Exit");

            System.out.println("Enter Choice");
            int Choice = sc.nextInt();

            switch(Choice){
                case 1:
                    System.out.println("Enter Account Number");
                    int accNo = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Account Holder Name");
                    String name = sc.nextLine();

                    System.out.println("Enter Initial Balance");
                    double balance = sc.nextDouble();

                    BankAccount account = new BankAccount(accNo, name, balance);
                    bank.addAccount(account);
                break;
                case 2:
                    System.out.println("Enter Account Number");
                    accNo = sc.nextInt();

                    BankAccount account1 = bank.findAccount(accNo);
                    if(account1 != null){
                        System.out.println("Enter Amount");
                        double amount = sc.nextDouble();

                        account1.deposit(amount);
                    }else{
                        System.out.println("Account not found");
                    }
                break;
                case 3:
                    System.out.println("Enter Account Number");
                    accNo = sc.nextInt();
                    
                    BankAccount account2 = bank.findAccount(accNo);
                    if(account2 != null){
                        System.out.println("Enter Amount: ");
                        double amount = sc.nextDouble();

                        account2.withdraw(amount);
                    }else{
                        System.out.println("Account not found");
                    }
                break;
                case 4:
                    System.out.println("Enter Banl Account Number");
                    accNo = sc.nextInt();
                    
                    BankAccount account3 = bank.findAccount(accNo);
                    if(account3 != null){
                        System.out.println("Current Balance: "+ account3.getBalance());
                    }else{
                        System.out.println("Account not found");
                    }
                break;
                case 5:
                    System.out.println("Enter Banl Account Number");
                    accNo = sc.nextInt();
                    
                    BankAccount account4 = bank.findAccount(accNo);
                    if(account4 != null){
                        account4.displayAccount();
                    }else{
                        System.out.println("Account not found");
                    }
                break;
                case 6:
                    System.out.println("Sender Account Number");
                    int senderNo = sc.nextInt();

                    System.out.println("Receiver Account Number");
                    int receiverNo = sc.nextInt();

                    BankAccount sender = bank.findAccount(senderNo);
                    BankAccount receiver = bank.findAccount(receiverNo);

                    if(sender !=null && receiver != null){
                        System.out.println("Enter Amount");
                        double amount = sc.nextDouble();

                        sender.transfer(receiver, amount);
                    }else{
                        System.out.println("Invalid Account");
                    }
                case 7:
                    System.out.println("ThanK You For Using Our Bank");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");   
            }
        }
    }
}
