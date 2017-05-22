import java.util.Stack;

public class Parser {
	
	boolean checkParanthesisBalance(String s){
		Stack<Character> stack  = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '[' || c == '(' || c == '{' ) {

                stack.push(c);

            }else if(c == ']') {
                if(stack.isEmpty()) return false;
                if(stack.pop() != '[') return false;

            }else if(c == ')') {
                if(stack.isEmpty()) return false;
                if(stack.pop() != '(') return false;

            }else if(c == '}') {
                if(stack.isEmpty()) return false;
                if(stack.pop() != '{') return false;
            }

        }
        return stack.isEmpty();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parser p = new Parser();
		
		System.out.println(p.checkParanthesisBalance("}{ )("));
        System.out.println(p.checkParanthesisBalance("{{()}}"));
        System.out.println(p.checkParanthesisBalance("{)(a,b}"));

	}

}
