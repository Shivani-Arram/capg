package lab3;
import java.util.Scanner;
class Mirror{
	public void mirror(String str) {
		System.out.print(str+"|"); 
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}
}
public class Ex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Mirror obj=new Mirror();
		obj.mirror(s);

	}

}
