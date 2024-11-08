public class Bank {
    public static void main(String[] args) {
        // Create a bank account with an initial balance of $500
        BankAccount account = new BankAccount(500);

        // Try withdrawing an amount greater than the balance
        try {
            System.out.println("Attempting to withdraw $600...");
            account.withdraw(600);
        } catch (InsufficientFundsException e) {
            // Catch the custom exception and display the error message
            System.out.println(e.getMessage());
        }
        
        // Try withdrawing a valid amount
        try {
            System.out.println("Attempting to withdraw $300...");
            account.withdraw(300);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
