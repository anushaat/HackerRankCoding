
class Student{
	int count = 0;
	public void print(){
		System.out.println("In parent");
	}
}


class Junior extends Student{
	public void print(){
		System.out.println("In sub class");
	}
	
	public static void foo(){
		System.out.println("In Foo");
	}
}

public class BinarySerachTreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Junior();
		s1.print();
		//s1.foo();
		//s1.foo();
	}

}
