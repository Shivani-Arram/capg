package day1;
import java.util.Scanner;
public class Powerof2 {
	public static boolean checkNumber(int n) {
		if(n%2 !=0) {
			return false;
		}
		else {
			while(n>1) {
				if(n%2!=0) {
					return false;
				}
				n = n/2;
			}
			if(n==1) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		if(checkNumber(n)) {
			System.out.println("The number is power of 2");
		}else {
			System.out.println("The given number is not power of 2");
		}
	}
}