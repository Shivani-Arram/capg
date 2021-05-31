package day3;
class Animal{
	public void sound() {
		System.out.println("Sounds");
	}
}
class Dog extends Animal{
	public void sound() {
		System.out.println("Bow Bow...");
	}
}
class Cat extends Animal{
	public void sound() {
		System.out.println("meow Meow...");
	}
}
public class DynamicBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		Animal d=new Dog();
		Animal c=new Cat();
		a.sound();
		d.sound();
		c.sound();
	}

}
