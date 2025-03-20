import java.io.*;
import java.util.Scanner;
import java.util.Arrays;


class Sort_Vowels {



    public static void ascendingVowels(){
        int j=0, count=0, k=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.nextLine();
        str = str.toLowerCase();
        char[] s1=str.toCharArray();
        
        char[] temp= new char[str.length()];
        
        for(j=0;j<str.length();j++){
            if(s1[j]=='a' || s1[j]=='e' || s1[j]=='i' || s1[j]=='o'  || s1[j]=='u'){
                
                temp[k]=s1[j];
                k=k + 1;
            }
          
        }
       
        char [] subArray = Arrays.copyOfRange(temp, 0, k );
        Arrays.sort(subArray);
       System.out.println(Arrays.toString(subArray));
 
    }


    public static void main(String[] args) {
        // vowels();
        // System.out.println();
        ascendingVowels();
    }
}