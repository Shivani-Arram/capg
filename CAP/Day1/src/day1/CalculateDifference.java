package day1;
import java.util.Scanner;

public class CalculateDifference {
	public static int calculateDifference(int n) {
		int res;
		int r1 = 0;
		int r2 = 0;
		for(int i =1;i<=n;i++) {
			r1 +=(i*i);
			r2 += i;
		}
		res = r1 - (r2*r2);
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println(calculateDifference(n));
	}

}