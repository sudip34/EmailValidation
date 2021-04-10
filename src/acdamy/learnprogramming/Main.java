package acdamy.learnprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String str1="sudip@gmail.com";
        String str3="sudip34@gmail.com";


        List<String>emailList=new ArrayList<>();
        emailList.add(str1);
        emailList.add(str3);

        System.out.println("Enter your Email :");
        Scanner scanner = new Scanner(System.in);
        String sct1=scanner.nextLine();

        boolean isExist=false;
        for (int i=0; i < emailList.size(); i++) {
            if (sct1.equals( emailList.get(i))) {
                isExist=true;
                break;
            }
        }
        if (isExist){
            System.out.println(sct1+" is found.");
        }else{
            System.out.println(sct1+" not found");
        }
        
    }
}
