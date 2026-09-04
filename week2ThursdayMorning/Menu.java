package rev.week2ThursdayMorning;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        System.out.println("Welcome to my REPL App!");
        System.out.println(">help");
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        double num1 = input.nextDouble();
        System.out.println("enter second number");
        double num2 = input.nextDouble();
        System.out.println("enter operation: add, subtract, multiply, divide, random,reverse,quit");
        String str = input.next();
        switch (str) {
            case "add":
                double sum = num1 + num2;
                System.out.println(sum);
                break;
            case "subtract":
                double sum1 = num1 - num2;
                System.out.println(sum1);
                break;
            case "multiply":
                double sum2 = num1 * num2;
                System.out.println(sum2);
                break;
            case "divide":
                if(num2 == 0){
                    System.out.println("invalid number not divide by zero");
                }
                double sum3 = num1 / num2;
                System.out.println(sum3);
                break;
            case "random":
                double sum4 = Math.random();
                System.out.println(sum4);
                break;
            case "reverse":
                for (int i = str.length()-1; i>=0 ; i--) {
                    System.out.print(str.charAt(i));

                }
                break;
                case "quit":
                    System.out.println("goodbye");

        }

    }



}
