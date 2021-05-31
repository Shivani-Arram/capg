class SuperClass{
	int b=10;
}
class SubClass extends SuperClass{
	int b=20;
}

public class Mcq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClass obj=new SubClass();
		System.out.println(obj.b);	
	}

}
