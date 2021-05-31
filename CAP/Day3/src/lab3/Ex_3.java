package lab3;
import java.util.Scanner;
public class Ex_3 {
	static boolean vowel(char c) {
		if(c!='A'&& c!='E'&& c!='O'&& c!='I'&& c!='U') {
			return false;
		}
		return true;
	}
	static String alter_string(char[] s) {
		for(int i=0; i<s.length;i++) {
			if(!vowel(s[i])) {
				if(s[i]=='Z') {
					s[i]='B';
				}
				s[i]= (char)(s[i]+1);
				if(vowel(s[i])) {
					s[i]=(char)(s[i]+1);
				}
			}
		}
		return String.valueOf(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(alter_string(s.toCharArray()));

	}

}
