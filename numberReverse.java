package recurssion;

public class numberReverse {
    public int reverse(int number, int rev) {
        if (number == 0) {
            return rev;

        }
        return reverse(number/10,number%10+rev*10);
    }
    public String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        // every cycle when take off charAt(0), substring starts from index 1
        return reverseString(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        numberReverse r = new numberReverse();
        System.out.println(r.reverse(1345,0));
        System.out.println(r.reverseString("hello"));
    }
}
