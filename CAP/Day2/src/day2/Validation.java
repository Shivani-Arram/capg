package day2;
import java.util.Scanner;
import java.util.regex.*;;
public class Validation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String pwd=new String();
		pwd=sc.nextLine();
		String ref="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,15}$";
		Pattern p=Pattern.compile(ref);
		Matcher m = p.matcher(pwd);
		if(m.matches()) {
			System.out.println("Valid Password.");
		}else {
			System.out.println("Invalid Password.");
		}

	}

}
