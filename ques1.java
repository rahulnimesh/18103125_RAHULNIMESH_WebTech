import java.io.*;
import java.util.*;


public class ques1{

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1=scan.next();
        System.out.print("Enter the Second string: ");
        String s2=scan.next();
        int n=s1.length();
        int m=s2.length();
        int i;
        for(i=0;i<n && i<m;i++){
            if(s1.charAt(i)>s2.charAt(i)){
                System.out.println("First string is greater");
                return;
            }
            else if(s1.charAt(i)<s2.charAt(i)){
                System.out.println("Second string is greater");
                return;
            }
        }
        if(s1.length()>s2.length()){
            System.out.println("First string is greater");
            return;
        }
        else if(s1.length()<s2.length()){
            System.out.println("Second string is greater");
            return;
        }

        if(i==n){
            System.out.println("These are equal strings");
        }
    }
}
