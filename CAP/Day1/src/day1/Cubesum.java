package day1;

public class Cubesum {

	public static void main(String[] args) {
		int n =123;
		int sum=0,rem;
		while(n!=0) {
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		System.out.println(sum);
	}

}
