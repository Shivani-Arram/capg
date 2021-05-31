package lab3;
import java.util.Scanner;
import java.util.*;
public class Ex_1 {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringTokenizer st=new StringTokenizer(s," ");
		while(st.hasMoreTokens()) {
			String temp=st.nextToken();
			int n=Integer.parseInt(temp);
			System.out.println(n);
			sum=sum+n;
		}
		System.out.println("Sum of the integers is: "+sum);

	}

}
