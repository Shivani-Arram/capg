package day3;
class One{
	public void disp() {
		System.out.println("Java");
	}
}
class Two extends One{
	public void disp() {
		System.out.println("Runtime Polymorphism");
	}
}
public class PolymorphismEx {

	public static void main(String[] args) {
		Two t=new Two();
		t.disp();

	}

}
