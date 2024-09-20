package com.basic.java;

public class Palin_LfRt_2Log {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Madedam";
		boolean b=Palindrome(str);
		if(b==true) {
			System.out.println("String is a Palindrome");
		}
		else{
			System.out.println("String is Not a Palindrome");
		}
	}
	
//1st way comparison 
	
/*	public static boolean Palindrome(String strs){
		String str1=strs;
		boolean palin = false;
		System.out.println(str1);
		int i=0; int j=str1.length()-1;
		while(i<j) {
//			System.out.println(str1.charAt(i));
//			System.out.println(str1.charAt(j));
			if(str1.charAt(i)==str1.charAt(j))
			{
				 palin=true;
			}
			else {
			 palin=false;
			 return palin;
			}
			i++;
			j--;
		}
		//		return palin;
	} */

	//2nd way comparison (Optimized)
	
	public static boolean Palindrome(String strs){
		boolean palin = true;
		System.out.println(strs);
		int i=0; int j=strs.length()-1;
		while(i<j) {
//			System.out.println(str1.charAt(i));
//			System.out.println(str1.charAt(j));
			if(strs.charAt(i)!=strs.charAt(j))
			{
				 palin=false;
			}
			i++;
			j--;
		}
		return palin;
	}
}
