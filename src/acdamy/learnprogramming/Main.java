package acdamy.learnprogramming;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String str1="sudip@gmail.com";
        String str2="1234Q567";
        System.out.println("Enter your Email :");
        Scanner scanner = new Scanner(System.in);
        String sct1=scanner.nextLine();

        System.out.println("Enter your password:");
        Scanner scanner2 = new Scanner(System.in);
        String sct2=scanner2.nextLine();


        Pattern pattern=Pattern.compile(str1);
        Matcher matcher1=pattern.matcher(sct1);

        Pattern pattern2=Pattern.compile(str2);
        Matcher matcher2=pattern2.matcher(sct2);



        if (matcher1.matches()&&matcher2.matches()){
            System.out.println("you are in the system and your Email : "+str1);
        }else{
            if(matcher1.matches()) {
                System.out.println("Wrong password.");
            }else {
                System.out.println("wrong Email address.");
                System.out.println("Please enter your correct email address.");

            }
        }
    }
}
