package day3;

class A{
	String name="Inheritance Example";
	public void disp() {
		System.out.println(name);
	}
}
class B extends A{
	public void show() {
		System.out.println("Java");
	}
}
class C extends B{
	public void printing() {
		System.out.println("Inheritance Example in Java");
	}
}
public class InheritanceEx {

	public static void main(String[] args) {
		B b=new B();
		C c=new C();
		b.disp();
		b.show();
		c.disp();
		c.show();
		c.printing();
		

	}

}
