package nikkijava;

public class BankAccountTest {
    
    public static void main(String[] args){
        BankAccount account = new BankAccount();
        account.deposit("checking", 500);
        account.deposit("savings", 2000);
        account.withdraw("checking", 25);
        account.getBalances();
    }
}