package RevatureAssignment1;

public class Calculator {

    public static void main(String[] args) {

        double num1 = 7;
        double num2 = 3;
        char operator = '+';

        String again = "y";

        while (again.equals("y")) {

            if (operator == '+') {
                System.out.println("Result: " + (num1 + num2));

            } else if (operator == '-') {
                System.out.println("Result: " + (num1 - num2));

            } else if (operator == '*') {
                System.out.println("Result: " + (num1 * num2));

            } else if (operator == '/') {

                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.println("Result: " + (num1 / num2));
                }

            }

            again = "n";
        }

        System.out.println("Thank you for using the calculator");
    }
}