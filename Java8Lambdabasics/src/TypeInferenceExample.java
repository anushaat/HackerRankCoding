
public class TypeInferenceExample {

	public static void main(String[] args) {
		StringLengthLambda str = s -> s.length();
		System.out.println(str.stringLength("Hello"));

	}

}

interface StringLengthLambda{
	int stringLength(String s);
}
