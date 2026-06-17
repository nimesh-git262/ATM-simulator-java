import java.util.ArrayList;

public class BankAccount{
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private ArrayList<String> transactions = new ArrayList<>();

    public BankAccount(int accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        transactions.add("Account Created with Balance: " + balance);
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public String getAccontHolderName(){
        return accountHolderName;
    }
    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
        transactions.add("Deposited: " + amount);
        System.out.println(amount + "deposited successfully");
    }

    public void withdraw(double amount){
        if(balance <= amount){
            balance -= amount;
            transactions.add("Withdraw: " + amount);
            System.out.println(amount + "withdraw successfully");
        }else{
            System.out.println("Insufficent balance");
        }
    }

    public void showTransactions(){
        System.out.println("Transaction History: ");
        for(String transaction : transactions){
            System.out.println(transaction);
        }    
    }

    public void displayAccount(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public void transfer(BankAccount receiver, double amount){
        if(amount <= balance){
            balance -= amount;
            receiver.balance += amount;

            transactions.add("Transferred " + amount + "to Account " + receiver.accountNumber);

            receiver.transactions.add("Received " + amount + "from Account " + accountNumber);
            System.out.println("Transfer successfull");
        }else{
            System.out.println("Insufficent balance");
        }
    }
}