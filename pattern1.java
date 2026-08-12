import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int rows = scanner.nextInt();

            for (int i = 1; i <= rows; i++) {
                // Print spaces
                for (int j = 1; j < i; j++) {
                    System.out.print("  ");
                }

                // Print star
                System.out.println("*");
            }

            scanner.close();
        }
    }
}