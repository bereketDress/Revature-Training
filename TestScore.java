package RevatureAssignment2;

import java.util.Scanner;

import static java.lang.Long.MAX_VALUE;
import static java.lang.Long.MIN_VALUE;

public class TestScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 1;
        double total = 0;
        double average = 0;
        double highest = MIN_VALUE;
        double lowest = MAX_VALUE;

        while (n <= 5) {
            System.out.println("enter number " + n + ":");
            double a = input.nextDouble();
            total = total + a;
            average = total / 5;
            n++;
            if (a > highest) {
                highest = a;
            }
            if (a < lowest) {
                lowest = a;
            }

        }
        System.out.println("total is: " + total);
        System.out.println("average: " + average);
        System.out.println("highest: " + highest);
        System.out.println("lowest: " + lowest);
        if (average >= 90) {
            System.out.println("grade: " + 'A');
        } else if (average >= 75) {
            System.out.println("grade: " + 'B');
        } else if (average >= 60) {
            System.out.println("grade: " + 'C');

        } else if (average >= 50) {
            System.out.println("grade: " + 'D');
        } else if (average >= 40) {
            System.out.println("grade: " + 'F');
        }

    }
}