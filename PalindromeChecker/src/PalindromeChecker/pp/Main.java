package PalindromeChecker.pp;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number ");
    int n = scan.nextInt();
    Palindrome thepalindrome=new Palindrome();
    thepalindrome.isPalindrome(n);
}
}