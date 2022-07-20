package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

public class ReverseNumber {
	
	
		public static void main(String[] args) {
			
			int num;
			int k=0;
			System.out.println("Enter Any Number ");
			Scanner sc= new Scanner (System.in);
		    num = sc.nextInt();
		
			while (num != 0) {
				int reminder = num%10;
				k = k*10+reminder;
				num = num/10;
			}
			
			System.out.println("The reverse Number of Given Number is "+ k);
			
			sc.close();

	        }
		}



