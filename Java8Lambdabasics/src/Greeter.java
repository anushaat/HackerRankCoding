
public class Greeter {
	
	public void greet(Greeting greeting){
		greeting.perform();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter greeter = new Greeter();
		Greeting code = () -> System.out.print("Hey!");
		
		Greeting innerClassGreeting = new Greeting(){
			public void perform(){
				System.out.print("Hey InnerClass!");
			}
		};
		
		innerClassGreeting.perform();
	}

}
