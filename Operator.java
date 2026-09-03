package RevatureAssignment1;

public class Operator {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int c = a + b;
        System.out.println(c);

        int d = a - b;
        System.out.println(d);

        int e = a * b;
        System.out.println(e);

        double f = (double) a / b;
        System.out.println(f);

        boolean result = a > b;
        System.out.println(result);

        boolean logicalResult = a > b && b > 0;
        System.out.println(logicalResult);
    }
}