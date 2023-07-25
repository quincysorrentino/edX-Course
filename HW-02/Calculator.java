import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String add = "add";
        final String subtract = "subtract";
        final String multiply = "multiply";
        final String divide = "divide";
        final String alphabetize = "alphabetize";

        System.out.println(
                "List of operations: " + add + " " + subtract + " " + multiply + " " + divide + " " + alphabetize);
        System.out.println("Enter operation: ");

        String operation = scanner.nextLine();

        operation = operation.toLowerCase();

        // Check if inputed operater is valid
        boolean isValidOperator = false;

        if (operation.equals(add) || operation.equals(subtract) || operation.equals(multiply)
                || operation.equals(divide) || operation.equals(alphabetize)) {
            isValidOperator = true;
        } else {
            System.out.println("Invalid input entered. Terminating...");
        }

        if (isValidOperator) {

            // Addition and subtraction process
            if (operation.equals(add) || operation.equals(subtract)) {
                System.out.println("Enter two integers: ");

                if (scanner.hasNextInt() == true) {

                    int addsubNum1 = scanner.nextInt();
                    int addsubNum2 = scanner.nextInt();

                    switch (operation) {
                        case add:
                            int sum = addsubNum1 + addsubNum2;
                            System.out.println("Answer: " + sum);
                            break;
                        case subtract:
                            int subtraction = addsubNum1 - addsubNum2;
                            System.out.println("Answer: " + subtraction);
                            break;
                    }

                }

                else {
                    System.out.println("Invalid input entered. Terminating...");
                }
            }

            // Multiplication and division process
            else if (operation.equals("multiply") || operation.equals("divide")) {
                System.out.println("Enter two doubles:");

                if (scanner.hasNextDouble()) {
                    double multidivNum1 = scanner.nextDouble();
                    double multidivNum2 = scanner.nextDouble();

                    if (multidivNum2 == 0 && operation.equals("divide")) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        if (operation.equals("multiply")) {
                            double product = multidivNum1 * multidivNum2;
                            System.out.printf("Answer: %.2f%n", product);
                        } else if (operation.equals("divide")) {
                            double quotient = multidivNum1 / multidivNum2;
                            System.out.printf("Answer: %.2f%n", quotient);
                        }
                    }
                } else {
                    System.out.println("Invalid input entered. Terminating...");

                }

            }

            // alphabatize process
            if (operation.equals(alphabetize)) {
                System.out.println("Enter two words");

                if (scanner.hasNext() == true) {
                    String word1 = scanner.next();
                    String word2 = scanner.next();

                    int compareValue = word1.compareTo(word2);

                    if (compareValue == 0) {
                        System.out.println("Both words are equal");

                    } else if (compareValue > 0) {
                        System.out.println(word1 + " comes after " + word2 + " alphabetically");
                    } else if (compareValue < 0) {
                        System.out.println(word1 + " comes before " + word2 + " alphabetically");

                    }
                }

                else {
                    System.out.println("Invalid input entered. Terminating...");
                }

            }

        }

    }
}
