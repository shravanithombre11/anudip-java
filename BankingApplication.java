
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}


class BankAccount {
    private double balance;

   
    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Current Balance: " + balance);
    }

   
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Withdrawal failed! Insufficient balance."
            );
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining Balance: " + balance);
        }
    }

    
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}


public class BankingApplication {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(5000);

        account.displayBalance();

        account.deposit(2000);

        try {
            account.withdraw(3000);   // valid withdrawal
            account.withdraw(5000);   // exceeds balance
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
