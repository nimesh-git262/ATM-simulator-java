import java.util.ArrayList;

public class Bank{
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount account){
        accounts.add(account);
        System.out.println("Accounts created successfully");
    }
    public BankAccount findAccount(int accountNumber){
        for(BankAccount account : accounts){
            if(account.getAccountNumber() == accountNumber){
                return account;
            }
        }
        return null;
    }
}