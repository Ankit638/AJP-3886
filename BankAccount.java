// BankAccount class that manages balance and withdrawals
class BankAccount {
    private double balance;

    // Constructor to set the initial balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to check balance
    public double getBalance() {
        return this.balance;
    }

    // Method for withdrawing an amount
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > this.balance) {
            // Throw custom exception if amount exceeds balance
            throw new InsufficientFundsException("Error: Insufficient funds. You have only " + this.balance + " in your account.");
        } else {
            // Proceed with withdrawal
            this.balance -= amount;
            System.out.println("Withdrawal successful! New balance: $" + this.balance);
        }
    }
}
