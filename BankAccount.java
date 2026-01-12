class BankAccounts{
    // instance variable
    int accountNumber;
    double balance;
    static String bankname = "SBI Bank.";

    // constructor 
    BankAccounts(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // using method
    void showAccount(){
        // using local variable 
        int year = 2026;


        System.out.println("Bank Name: "+BankAccounts.bankname);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Current balance: "+balance);
        System.out.println("Current Year: "+year);
    }
}

public class BankAccount {
    public static void main(String[] args){
        BankAccounts c1 = new BankAccounts(123, 10000.0);
        BankAccounts c2 = new BankAccounts(1245, 20000.450);

        c1.showAccount();
        System.out.println("========================");
        c2.showAccount();
        
    }
}
