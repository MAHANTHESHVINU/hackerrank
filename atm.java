import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class atm {
    static String correctPassword = "1234";
    static double balance = 5000.0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        login(sc);
        sc.close();
    }

    static void login(Scanner sc) {
        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        if (password.equals(correctPassword)) {
            System.out.println("Login successful!");
            showMenu(sc);
        } else {
            System.out.println("Incorrect password.");
        }
    }

    static void showMenu(Scanner sc) {
        System.out.println("\nChoose an option:");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Find Duplicate Numbers");
        System.out.println("5. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            checkBalance();
        } else if (choice == 2) {
            withdraw(sc);
        } else if (choice == 3) {
            deposit(sc);
        } else if (choice == 4) {
            findDuplicateNumbers(sc);
        } else if (choice == 5) {
            System.out.println("Thank you! Goodbye.");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    static void checkBalance() {
        System.out.println("Your balance is: " + balance);
    }

    static void findDuplicateNumbers(Scanner sc) {
        System.out.print("Enter the number of values to input: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number of values.");
            return;
        }

        int[] values = new int[n];
        System.out.println("Enter " + n + " integer values:");
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new LinkedHashSet<>();
        for (int value : values) {
            if (!seen.add(value)) {
                duplicates.add(value);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicate values found.");
        } else {
            System.out.println("Duplicate values found: " + duplicates);
        }
    }

    static void withdraw(Scanner sc) {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdraw successful.");
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    static void deposit(Scanner sc) {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        balance = balance + amount;
        System.out.println("Deposit successful.");
        System.out.println("Updated balance: " + balance);
    }
}
