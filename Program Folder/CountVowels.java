
import java.io.*;
import java.util.Scanner;

class CountVowels {

    public static void vowels(){
        int j=0, count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.nextLine();
        str = str.toLowerCase();
        char[] s1=str.toCharArray();
        
        for(j=0;j<str.length();j++){
            if(s1[j]=='a' || s1[j]=='e' || s1[j]=='i' || s1[j]=='o'  || s1[j]=='u'){
                count=count+1;
            }
        }
         System.out.print(count);
    }


    public static void main(String[] args) {
        // vowels();
        // System.out.println();
        vowels();
    }
}
// }