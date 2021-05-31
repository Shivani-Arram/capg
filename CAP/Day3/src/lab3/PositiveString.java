package lab3;
import java.util.Arrays;
import java.util.Scanner;
public class PositiveString {
	static boolean positive(String s) {
		int n=s.length();
		char[] c= new char [n];
		for(int i=0;i<s.length();i++) {
			c[i]=s.charAt(i);
		}
		Arrays.sort(c);
		for(int i=0;i<n;i++) {
			if(c[i]!=s.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(positive(s)) {
			System.out.println("Positive String..");
		}else {
			System.out.println("Not a Positive String..");
		}

	}

}
