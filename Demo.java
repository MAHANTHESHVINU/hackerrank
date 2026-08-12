public class Demo {

    public static void main(String[] args) {

        // 1. ArithmeticException
        System.out.println("1. ArithmeticException");

        try {
            int a = 10;
            int b = 0;
            int result = a / b;

            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

        System.out.println();


        // 2. ArrayIndexOutOfBoundsException
        System.out.println("2. ArrayIndexOutOfBoundsException");

        try {
            int[] numbers = {10, 20, 30};

            System.out.println(numbers[5]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of range.");
        }

        System.out.println();


        // 3. NumberFormatException
        System.out.println("3. NumberFormatException");

        try {
            String str = "ABC";
            int number = Integer.parseInt(str);

            System.out.println("Number: " + number);
        } 
        catch (NumberFormatException e) {
            System.out.println("String cannot be converted into a number.");
        }

        System.out.println();


        // 4. NullPointerException
        System.out.println("4. NullPointerException");

        try {
            String name = null;

            System.out.println(name.length());
        } 
        catch (NullPointerException e) {
            System.out.println("Cannot access a method using a null object.");
        }

        System.out.println();


        // 5. Multiple catch blocks
        System.out.println("5. Multiple Catch Blocks");

        try {
            int[] arr = {1, 2, 3};

            int result = 10 / 0;
            System.out.println(arr[5]);
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error occurred.");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error occurred.");
        }

        System.out.println();


        // 6. finally block
        System.out.println("6. Finally Block");

        try {
            int x = 10 / 2;
            System.out.println("Result: " + x);
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error.");
        } 
        finally {
            System.out.println("Finally block is always executed.");
        }

        System.out.println();


        // 7. throw keyword
        System.out.println("7. Throw Keyword");

        try {
            int age = 16;

            if (age < 18) {
                throw new ArithmeticException("Age must be 18 or above.");
            }

            System.out.println("Eligible to vote.");
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println();


        // 8. User-defined exception using Exception
        System.out.println("8. User-defined Exception");

        try {
            checkMarks(120);
        } 
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }


    // Method demonstrating exception throwing
    static void checkMarks(int marks) throws Exception {

        if (marks > 100 || marks < 0) {
            throw new Exception("Marks must be between 0 and 100.");
        }

        System.out.println("Valid marks: " + marks);
    }
}