package day1;

public class Fibonacci {

	public static void main(String[] args) {
		int a=1,b=1,n=7;
		int c=0;
		for(int i=3;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(c);

	}

}
