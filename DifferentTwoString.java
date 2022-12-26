package com.demo;
import java.util.Scanner;
public class DifferentTwoString {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String a = s.next();
		String b = s.next();
		int count =0;
		int count1 =0;
		for(int i=0;i<a.length();i++){
			for(int j=i;j<=i;j++){
				if(a.charAt(i)==b.charAt(j)){
					count +=1;
				}
				else{
					count1 +=1;
				}
			}
		}
		if(count1 ==1){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}
}

