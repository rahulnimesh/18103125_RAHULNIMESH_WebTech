import java.io.*;
import java.util.*;

class Srt {
    public boolean compare(String s1, String s2){
        int n=s1.length();
        int m=s2.length();
        int i;
        for(i=0;i<n && i<m;i++){
            if(s1.charAt(i)>s2.charAt(i)){
                return true;
            }
            else if(s1.charAt(i)<s2.charAt(i)){
                return false;
            }
        }
        if(s1.length()>s2.length()){
            return true;
        }
        else if(s1.length()<s2.length()){
            return false;
        }
        return false;
    }


    public void sorting(String arr[], int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(compare(arr[i],arr[j])){
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

}

public class ques3{

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n=scan.nextInt();
        String arr[]=new String[n];
        System.out.print("Enter the Strings to be sorted: ");
        for(int i=0;i<n;i++){
            arr[i]= scan.next();
        }
        Srt c=new Srt();
        c.sorting(arr,n);
        System.out.println("After sorting: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
