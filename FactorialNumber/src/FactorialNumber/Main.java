package FactorialNumber;
import java.util.Scanner;

public class Main {

    public static void calculateFactorial(int n) {
       int fact=1;
       for(int i=1;i<=n;i++) {
    	   fact=fact*1;
       }
       System.out.println(fact);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        calculateFactorial(n);
    }
}

