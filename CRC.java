package com.shubham;

import java.io.IOException;
import java.util.Scanner;

public class CRC {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Generator");
        String gen = sc.nextLine();
        System.out.print("enter the Data : ");
        String data = sc.nextLine();
        String code = data;
        while (code.length() < (data.length() + gen.length() - 1))
            code += "0";
        code = data + div(code, gen);
        System.out.println("codeWord = " + code);
        System.out.print("Enter the received codeword : ");
        String rec = sc.nextLine();
        if (Integer.parseInt(div(rec, gen)) == 0){
            System.out.println("The received code words contain no errors");
        }
        else {
            int errorBits= Integer.parseInt(div(rec, gen));
            String flag=""+errorBits;
            System.out.println("The received code words have errors given below");
            System.out.println("The error due to last this bit " + flag.length() +" and bits are code = " + errorBits );
        }
    }
    static String div(String num1, String num2){
        int p=num2.length();
        String result=num1.substring(0,p);
        String remainder = "";
        for(int i=0;i<num2.length();i++){
            if(result.charAt(i)==num2.charAt(i))
                remainder+="0";
            else
                remainder+="1";
        }
        while (p<num1.length()){
            if(remainder.charAt(0)=='0'){
                remainder=remainder.substring(1,remainder.length());
                remainder=remainder+String.valueOf(num1.charAt(p));
                p++;
            }
            result=remainder;
            remainder="";
            for(int i=0;i<num2.length();i++){
                if(result.charAt(i)==num2.charAt(i))
                    remainder+="0";
                else
                    remainder+="1";
            }
        }
        return remainder.substring(1,remainder.length());
    }
}
