import java.io.*;
import java.util.*;

class Solve
{
    public void intersect(int A[],int B[],int n,int m)
	{
        System.out.println("Intersection of these arrays is: ");
        for(int i=0;i<n;i++){
            boolean fl=false;
            for(int k=0;k<i;k++)
			{
                if(A[i]==A[k])
				{
                    fl=true;
                    break;
                }
            }
            if(fl)
                continue;
            for(int j=0;j<m;j++)
			{
                if(A[i]==B[j] && A[i]>=0 && A[i]<11)
				{
                    System.out.print(A[i]+" ");
                    break;
                }
            }
        }
        System.out.println();
    }

    public void union(int A[],int B[],int n,int m){
        int temp[]=new int[n+m];
        int ind=0;
        for(int i=0;i<n;i++){
            temp[ind++]=A[i];
        }
        for(int i=0;i<m;i++){
            temp[ind++]=B[i];
        }
        int size=n+m;
        System.out.println("After union: ");
        for(int i=0;i<size;i++){
            boolean fg=false;
            for(int j=0;j<i;j++){
                if(temp[i]==temp[j]){
                    fg=true;
                    break;
                }

            }
            if(fg)
                continue;
            if(temp[i]>=0 && temp[i]<11){
                System.out.print(temp[i]+" ");
            }
        }
        System.out.println();
    }

    public void complement(int A[],int B[],int n,int m){
        System.out.println("Complement of A:");
        for(int i=0;i<11;i++){
            boolean fl=false;
            for(int j=0;j<n;j++){
                if(i==A[j]){
                    fl=true;
                    break;
                }
            }
            if(fl)
                continue;
            System.out.print(i+" ");
        }
        System.out.println("\nComplement of B:");
        for(int i=0;i<11;i++){
            boolean fl=false;
            for(int j=0;j<m;j++){
                if(i==B[j]){
                    fl=true;
                    break;
                }
            }
            if(fl)
                continue;
            System.out.print(i+" ");
        }
    }
}

public class ques5_a
{

    public static void main(String[] args) 
	{
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number of elements in A and B: ");
        int n= scan.nextInt();
        int m= scan.nextInt();
        int A[]=new int[n];
        int B[]=new int[m];
        System.out.println("Enter the elements of A: ");
        for(int i=0;i<n;i++)
		{
            A[i]= scan.nextInt();
        }
        System.out.println("Enter the elements of B: ");
        for(int i=0;i<m;i++)
		{
            B[i]= scan.nextInt();
        }
        Solve obj=new Solve();
        obj.intersect(A,B,n,m);
        obj.union(A,B,n,m);
        obj.complement(A,B,n,m);
    }
}
