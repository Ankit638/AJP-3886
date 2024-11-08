public class Bank {
    private double amount;

    public Bank(double initialAmount) {
        this.amount = initialAmount;
    }

    public void withdraw(double withdrawalAmount) {
        String message = (amount >= withdrawalAmount) 
                ? "Withdraw successful. New balance: " + (amount - withdrawalAmount) 
                : "Insufficient funds. Withdrawal failed.";
        
        if (amount >= withdrawalAmount) {
            amount -= withdrawalAmount;
        }

        System.out.println(message);
    }

    public void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("Deposit successful. New balance: " + amount);
    }

    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }

    public static void main(String[] args) {
        Bank bankAccount = new Bank(10000);
        bankAccount.withdraw(6000);
        bankAccount.deposit(5000);
        bankAccount.displayBalance();
    }
}
