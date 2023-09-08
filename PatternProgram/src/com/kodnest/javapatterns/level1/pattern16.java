package com.kodnest.javapatterns.level1;

public class pattern16 {
	public static void main(String[] args) {     
        for (int i = 1; i <=5; i++) {
            // Print spaces
            for (int j = 1; j <=5; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

