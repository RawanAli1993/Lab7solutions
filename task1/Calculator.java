package ru.makhmutov.task1;
//
//import java.util.InputMismatchException; //for handling input mismatches (when a user enters the wrong type).
//import java.util.Locale; // for setting the locale of the scanner
//import java.util.Scanner; // for reading user input from the console.
//
//public class Calculator {
//
//    private static final int UPPER_BOUNDARY = 1000; //  shared among all instances of the class and can be accessed using the class name without creating an object.
//    private static final int LOWER_BOUNDARY = 0;   // All instances of Calculator share the same UPPER_BOUNDARY value
//
//    /**
//     * The entry point of the Calculator program.
//     * The program scans 2 positive integer values
//     * and performs one of chosen operations
//     *
//     * @param args Array with parameters of the program
//     */
//    public static void main(String[] args) {
//        seeOperations(); //  to display the available operations.
//        performOperation(); // to get user input and perform the chosen operation.
//    }
//
//    /**
//     * This method displays all operations
//     * and their id numbers
//     */
//    private static void seeOperations() {
//        System.out.println("Possible operations: ");
//        for (Operation operation : Operation.values()) { // This is a for-each loop, which iterates over each element in a collection or array
//            System.out.format("%d. %s%n", (operation.ordinal() + 1), operation.getOp()); // Declares a loop variable (operation) of type Operation. During each iteration, this variable holds the current enum value.
//        }
//        // values() is a built-in method in Java that returns an array of all constants declared in the enum.
//        // So, Operation.values() returns an array containing all the values of the Operation enum (ADD, SUBTRACT, MULTIPLY, DIVIDE).
//        // format and print a line for each operation
//        // operation.ordinal() This method returns the ordinal value (the position index) of the current enum constant, starting from 0.
//        // %s: A placeholder for a string. It will be replaced by operation.getOp()
//        // This method call retrieves the operation name associated with the current enum constant (e.g., "Addition" for ADD, "Subtraction" for SUBTRACT).
//        // The method getOp() is defined in the Operation enum to return the descriptive string associated with each enum value.
//    }
//
//
//
//    /**
//     * This method allows insertion of operation type,
//     * two integer values and performing the operation
//     */
//    private static void performOperation() {
//        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH)) {
//            Operation operation = scanOperation(scanner); // Calls scanOperation(scanner) to get the user’s chosen operation.
//            int value1;
//            int value2;
//            value1 = scanNumber(scanner, LOWER_BOUNDARY, UPPER_BOUNDARY, "first");
//            value2 = scanNumber(scanner, LOWER_BOUNDARY, UPPER_BOUNDARY, "second");
//            switch (operation) {
//                case ADD:
//                    System.out.println(value1 + value2);
//                    break;
//                case SUBTRACT:
//                    System.out.println(value1 - value2);
//                    break;
//                case MULTIPLY:
//                    System.out.println(value1 * value2);
//                    break;
//                case DIVIDE:
//                    if (value2 != 0) {
//                        System.out.println(value1 / value2);
//                        break;
//                    } else {
//                        System.out.println("Error: Division by 0");
//                        System.exit(-1);
//                    }
//                default:
//                    System.out.println("Wrong operation chosen!");
//            }
//        }
//    }
//
//    /**
//     * This method allows reading valid input integer values.
//     *
//     * @param scanner         The object of Scanner class needed
//     *                        for scanning the number
//     * @param lowerBoundary   The lower boundary for input value
//     * @param upperBoundary   The upper boundary for input value
//     * @return The obtained value received via scanning
//     */
//    private static int scanNumber(Scanner scanner, int lowerBoundary,
//                                     int upperBoundary, String type) {
//        int value = -1; // initially out of allowed boundaries
//        boolean validityFlag;
//        System.out.print("\nType the " + type + " value: ");
//        do {
//            try {
//                value = scanner.nextInt();
//            } catch (InputMismatchException e) {
//                System.out.print("\nUse only integer value, try one more time: ");
//                validityFlag = false;
//                scanner.next();
//                continue;
//            }
//            if (lowerBoundary == upperBoundary && value < lowerBoundary) {
//                System.out.format("%nPlease enter the number not lower than %d: ",
//                        lowerBoundary);
//                validityFlag = false;
//            } else if (lowerBoundary != upperBoundary &&
//                    (value < lowerBoundary || value > upperBoundary)) {
//                System.out.format("%nPlease enter the number in range [%d; %d]: ",
//                        lowerBoundary, upperBoundary);
//                validityFlag = false;
//            } else {
//                validityFlag = true;
//            }
//        } while (!validityFlag);
//        return value;
//    }
//
//    /**
//     * This method allows to scan the operation number
//     *
//     * @param scanner The object of Scanner class needed
//     *                for scanning the number
//     * @return The obtained value received via scanning
//     */
//    private static Operation scanOperation(Scanner scanner) {
//        double value = 0.5; // the initial value should not be integer to be a barrier for the program
//        boolean inserted = false;
//        System.out.print("Type the operation number: ");
//        do {
//            try {
//                value = scanner.nextDouble();
//            } catch (InputMismatchException e) {
//                System.out.print("\nDo not enter characters, try one more time: ");
//                scanner.next();
//                continue;
//            }
//            for (Operation operation : Operation.values()) {
//                if (value == (operation.ordinal() + 1)) {
//                    inserted = true;
//                    break;
//                }
//            }
//            if (!inserted) {
//                System.out.print("\nPlease insert applicable values: ");
//            }
//        } while (!inserted);
//        return Operation.values()[(int) (value - 1)];
//    }
//}
//import java.util.Scanner;
//import java.util.InputMismatchException;
//
//public class Calculator {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in, "UTF-8");
//        try {
//            int x = s.nextInt();
//            s.nextLine(); // Consume the leftover newline character
//            String op = s.nextLine();
//            int y = s.nextInt();
//
//            if (op.equals("+")) {
//                System.out.println(x + y);
//            } else if (op.equals("-")) {
//                System.out.println(x - y);
//            } else if (op.equals("*")) {
//                System.out.println(x * y);
//            } else if (op.equals("/")) {
//                System.out.println(x / y);
//            } else {
//                System.out.println("Invalid operator");
//            }
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter valid numbers and operator.");
//        }
//    }
//}

