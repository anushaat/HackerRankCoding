public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Arithmetic");
		Adder ad = new Adder();
		System.out.println(ad.add(10, 20));

	}

}

abstract class Arithmetic{
	abstract int add(int a, int b);
}

class Adder extends Arithmetic{
	int add(int a, int b){
		return a+b;
	}
}
