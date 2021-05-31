package lab3;
import java.util.Scanner;
public class ModifyNumber {
    static int modifyNumber(int n) {
    	String s=String.valueOf(n);
    	StringBuffer sb=new StringBuffer();
    	for(int i=0;i<s.length()-1;i++) {
    		int x =Math.abs((int)s.charAt(i)- (int)s.charAt(i+1));
    		sb.append(x);
    	}
    	sb.append(s.charAt(s.length()-1));
    	String s1=sb.toString();
    	int a= Integer.valueOf(s1);
    	return a;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(modifyNumber(n));

	}

}
