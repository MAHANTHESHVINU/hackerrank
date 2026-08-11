import java.util.Scanner;

public class atm1 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean mode = true;
        double balance = 5000.0;

        while (mode) {

            System.out.println("\nATM System - Please choose an action");
            System.out.println("1: Withdraw Money");
            System.out.println("2: Deposit Cash");
            System.out.println("3: Find duplicate values");
            System.out.println("0: Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter the amount you want to withdraw: ");
                    double amount = scanner.nextDouble();

                    if (amount <= 0) {
                        System.out.println("Invalid amount.");
                    } 
                    else if (amount > balance) {
                        System.out.println("Insufficient balance.");
                    } 
                    else {
                        balance = balance - amount;
                        System.out.println("Withdrawal successful!");
                        System.out.println("Amount withdrawn: " + amount);
                        System.out.println("Remaining balance: " + balance);
                    }

                    mode = false;
                    break;

                case 2:
                    System.out.print("Enter the amount of money to deposit: ");
                    double deposit = scanner.nextDouble();

                    if (deposit <= 0) {
                        System.out.println("Invalid amount.");
                    } 
                    else {
                        balance = balance + deposit;
                        System.out.println("Deposit successful!");
                        System.out.println("Amount deposited: " + deposit);
                        System.out.println("Current balance: " + balance);
                    }

                    mode = false;
                    break;

                case 3:
                    System.out.print("Enter how many values you want to input: ");
                    int size = scanner.nextInt();

                    if (size <= 0) {
                        System.out.println("Invalid number of values.");
                    } else {
                        int[] values = new int[size];
                        System.out.println("Enter " + size + " integers:");
                        for (int i = 0; i < size; i++) {
                            values[i] = scanner.nextInt();
                        }

                        for (int i = 0; i < size; i++) {
                            boolean alreadyCounted = false;
                            for (int k = 0; k < i; k++) {
                                if (values[k] == values[i]) {
                                    alreadyCounted = true;
                                    break;
                                }
                            }
                            if (alreadyCounted) {
                                continue;
                            }

                            int count = 1;
                            for (int j = i + 1; j < size; j++) {
                                if (values[i] == values[j]) {
                                    count++;
                                }
                            }

                            if (count > 1) {
                                System.out.println("Value " + values[i] + " appears " + count + " times.");
                            }
                        }
                    }

                    mode = false;
                    break;

                case 0:
                    mode = false;
                    break;

                default:
                    System.out.println(
                        "Invalid choice for ATM System. Enter 1, 2, 3, or 0."
                    );
            }
        }

        System.out.println("\nThank you for visiting our ATM!");

        scanner.close();
    }
}