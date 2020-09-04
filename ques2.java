import java.io.*;
import java.util.*;

class Count {
    public void counting_sort(int arr[], int n){
        int k=21;
        int temp[]=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=0;
        }
        for(int i=0;i<n;i++){
            temp[arr[i]]++;
        }
        for(int i=1;i<k;i++){
            temp[i]=temp[i]+temp[i-1];
        }
        int res[]=new int[n];
        for(int i=n-1;i>=0;i--){
            res[temp[arr[i]]-1]=arr[i];
            temp[arr[i]]--;
        }
        for(int i=0;i<n;i++){
            arr[i]=res[i];
        }
    }

}

public class ques2{

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=scan.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the elements to be sorted: ");
        for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }
        Count c=new Count();
        c.counting_sort(arr,n);
        System.out.println("After sorting: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
