package day3;
class Ctime{
	public int print(int a) {
		return a;
	}
	public int print(int a,int b) {
		return a+b;
	}
}
public class CtimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ctime obj=new Ctime();
		System.out.println(obj.print(4));
		System.out.println(obj.print(3,4));
	}

}
