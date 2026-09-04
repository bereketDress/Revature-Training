package rev.week2ThursdayMorning;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.nextLine();
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int space = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                 vowels++;
            }
            else if (Character.isDigit(ch)) {
                 digits++;
            }
            else if (Character.isSpaceChar(ch)) {
                 space++;
            } else if (Character.isLetter(ch)){
               consonants++;

            }
            else{
                System.out.println("invalid input");
            }

        }
        System.out.println("word: "+word.length());
        System.out.println("vowels: " + vowels);
        System.out.println("consonants: " + consonants);
        System.out.println("digits: " + digits);
        System.out.println("space: " + space);

    }
}
