package lab2;
import java.util.Scanner;
import java.util.Arrays;
public class Stringsort {
	public static void sortStrings(String s)
	{
		char str[]=s.toCharArray();
		Arrays.sort(str);
		s=new String(str);
		int len=s.length();
		if(len%2==0) {
			len=len/2;
		}else {
			len=(len/2)+1;
		}
		System.out.println("Sorted String is: ");
		for(int i=0;i<s.length();i++) {
			if(i<len) {
				System.out.print(Character.toUpperCase(s.charAt(i)));
			}else {
				System.out.print(Character.toLowerCase(s.charAt(i)));
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to be sorted: ");
		String s=sc.nextLine();
		sortStrings(s);

	}

}
