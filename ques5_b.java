import java.io.*;
import java.util.*;

class Solve
{
    public void intersect(int A[],int B[],int n,int m)
	{
        HashSet<Integer> st=new HashSet<Integer>();
        for(int i=0;i<m;i++)
		{
            if(B[i]>=0 && B[i]<11)
            st.add(B[i]);
        }
        System.out.println("Intersection of these arrays is: ");
        for(int i=0;i<n;i++)
		{
            if(st.contains(A[i])){
                System.out.print(A[i]+" ");
                st.remove(A[i]);
            }
        }

        System.out.println();
    }

    public void union(int A[],int B[],int n,int m)
	{
        HashSet<Integer> st=new HashSet<Integer>();
        System.out.println("Union of these arrays is: ");
        for(int i=0;i<n;i++)
		{
            if(A[i]>=0 && A[i]<11){
                st.add(A[i]);
            }
        }
        for(int i=0;i<m;i++)
		{
            if(B[i]>=0 && B[i]<11){
                st.add(B[i]);
            }
        }
        for(int i:st)
		{
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public void complement(int A[],int B[],int n,int m)
	{
        HashSet<Integer> st=new HashSet<Integer>();
        for(int i=0;i<n;i++)
		{
            if(A[i]>=0 && A[i]<11){
                st.add(A[i]);
            }
        }
        System.out.println("Complement of A:");
        for(int i=0;i<11;i++)
		{
            if(st.contains(i)==false)
			{
                System.out.print(i+" ");
            }
        }
        st.clear();

        for(int i=0;i<m;i++)
		{
            if(B[i]>=0 && B[i]<11){
                st.add(B[i]);
            }
        }
        System.out.println("\nComplement of B:");
        for(int i=0;i<11;i++)
		{
            if(st.contains(i)==false){
                System.out.print(i+" ");
            }
        }
    }
}

public class ques5_b
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
