package multipleofTenChecker;

import java.util.Scanner;

public class Main {

public static void checkMultipleOfTen(int n){
if(n % 10 == 0) {
	System.out.println("The number is multiple of 10");
}
else {
	System.out.println("The number is not multiple of 10");
}

}

public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int numberToCheck =scan.nextInt();
    checkMultipleOfTen(numberToCheck);

}

}