package com.kodnest.javapatterns.level1;

public class pattern21 {
	 public static void main(String[] args) {	        
	        // Print upper half of the pattern
	        for (int i = 1; i <=5; i++) {
	            // Print spaces
	            for (int j = 1; j < i; j++) {
	                System.out.print(" ");
	            }
	            // Print stars
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	     // Print lower half of the pattern
	        for (int i =5; i >= 1; i--) {
	            // Print spaces
	            for (int j = 1; j < i; j++) {
	                System.out.print(" ");
	            }
	            // Print stars
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }

	        

}
