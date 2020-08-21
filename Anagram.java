// JAVA program to check whether two strings 
// are anagrams of each other 
import java.util.*;
//import java.io.*; 
//import java.util.Arrays; 
//import java.util.Collections; 
class Anagram
{ 
	static boolean areAnagram(char[] str1,char[] str2) 
	{ 
		int n1 = str1.length; 
		int n2 = str2.length; 
		if (n1 != n2) 
			return false; 
		Arrays.sort(str1); 
		Arrays.sort(str2); 
		for (int i = 0; i < n1; i++) 
			if (str1[i] != str2[i]) 
				return false; 

		return true; 
	}
	public static void main(String args[]) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st word(string):");
		char[] str1=sc.next().toCharArray();
		System.out.println("Enter 2nd word(string):");
		char[] str2=sc.next().toCharArray();
		if (areAnagram(str1, str2)) 
			System.out.println("Strings are anagrams");
		else
			System.out.println("Not anagrams");
	} 
} 
