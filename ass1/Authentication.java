package rev.week2ThursdayMorning;

import java.util.Scanner;

public class Authentication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter password: ");
        String password=sc.nextLine();

        boolean upper =false;
        boolean lower=false;
        boolean number=false;
        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            if(Character.isUpperCase(ch)){
                upper=true;
            }
            if(Character.isLowerCase(ch)){
                lower=true;
            }
            if(Character.isDigit(ch)){
                number=true;
            }

        }
        if(password.length()>8 &&upper&&lower&&number){
            System.out.println("Password accepted");
        }
        else{
            System.out.println("Password not accepted");
        }
        if(password.length()<8){
            System.out.println("Password length should be greater than 8");
        }
        if(!upper){
            System.out.println("Password should be uppercase");
        }
        if(!lower){
            System.out.println("Password should be lowercase");
        }
        if(!number){
            System.out.println("Password should be number");
        }
        sc.close();

    }


}
