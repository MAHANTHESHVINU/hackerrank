import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPassword = "1234";
        double balance = 5000.0;

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        if (password.equals(correctPassword)) {
            System.out.println("Login successful!");

            System.out.println("\nChoose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Your balance is: " + balance);
            } else if (choice == 2) {
                System.out.print("Enter amount to withdraw: ");
                double amount = sc.nextDouble();
                if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Withdraw successful.");
                    System.out.println("Remaining balance: " + balance);
                } else {
                    System.out.println("Insufficient balance.");
                }
            } else if (choice == 3) {
                System.out.print("Enter amount to deposit: ");
                double amount = sc.nextDouble();
                balance = balance + amount;
                System.out.println("Deposit successful.");
                System.out.println("Updated balance: " + balance);
            } else if (choice == 4) {
                System.out.println("Thank you! Goodbye.");
            } else {
                System.out.println("Invalid choice.");
            }
        } else {
            System.out.println("Incorrect password.");
        }

        sc.close();
    }
}
