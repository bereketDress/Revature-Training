package rev.ass1;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number 1");
        double num1=sc.nextInt();
        System.out.println("enter a number 2");
        double num2=sc.nextInt();

        System.out.println("enter either (+,-,*,/): ");
        char ch = sc.next().charAt(0);
        double result = 0;
        switch (ch) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("invalid number");
                }
                result = num1 / num2;
                break;
        }
        System.out.println(result);

    }
}