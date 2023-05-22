import java.util.Scanner;

public class ATM {
    private double balance;

    public ATM() {
        balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Current balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: $" + balance);
        } else {
            System.out.println("Insufficient funds. Current balance: $" + balance);
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM!");
        System.out.println("Please select an option:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");

        boolean exit = false;
        while (!exit) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 3:
                    double currentBalance = atm.getBalance();
                    System.out.println("Current balance: $" + currentBalance);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
