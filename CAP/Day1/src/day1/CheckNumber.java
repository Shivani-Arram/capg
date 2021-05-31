package day1;

import java.util.Scanner;

public class CheckNumber {
	public static int checkNumber(int n) {
		int c =1;
		int l=1;
		int pr = n% 10;
		int r;
		n = n/10;
		while(n>0) {
			r = n%10;
			if(pr>= r) {
				c+=1;
			}
			else {
				return 0;
			}
			pr = n%10;
			n = n/10;
			l +=1;
		}
		if(c == l) {
			return 1;
		}else {
			return 0;
		}
		
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		if(checkNumber(n)==1) {
			System.out.println("It is an increasing number");
		}else {
			System.out.println("It is not an increasing number");
		}
	}

}
