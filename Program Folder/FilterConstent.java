
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

class FilterConstent {
    
    public static void consonents(){
        int j=0, count=0, k=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.nextLine();
        str = str.toLowerCase();
        char[] s1=str.toCharArray();
        char[] temp= new char[str.length()];
        for(j=0;j<str.length();j++){
            if(s1[j]!='a' &&  s1[j]!='e' && s1[j]!='i' && s1[j]!='o'  && s1[j]!='u' && s1[j]!=' ' ){
                temp[k]=s1[j];
                k=k + 1;
            }
        }
        char[] temp_final = Arrays.copyOfRange(temp, 0,k);
       System.out.println(Arrays.toString(temp_final));
    }
    public static void main(String[] args) {
        consonents();
    }
}
