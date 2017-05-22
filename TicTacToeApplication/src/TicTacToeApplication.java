import java.util.Scanner;

public class TicTacToeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean doYouWantToPlay = true;
		
		while(doYouWantToPlay){
			System.out.println("Welcome a Tic Tac Toe! Are you Ready?\n"
					+ "But first pick the character you want to be and which character"
							+ "I will be in");
			System.out.println();
			System.out.println("Enter a single character that will represent you!");
			char playerToken = scan.next().charAt(0);
			System.out.println("Enter a single character that will represent your opponent!");
			char opponentToken = scan.next().charAt(0);
			
			TicTacToe game = new TicTacToe(playerToken, opponentToken);
			
			AI ai = new AI();
			
			System.out.println();
			System.out.println("Now we can start the game");
			TicTacToe.printIndexBoard();
			System.out.println();
			
			while(game.gameOver().equals("Not Over!")){
				if(game.currentMarker == game.userMarker){
					System.out.println("Its your turn!");
					int spot = scan.nextInt();
					while(!game.playTurn(spot)){
						System.out.println("Try again. " + spot + " is invalid! ");
						spot = scan.nextInt();
					}
					System.out.println("You picked " + spot + "!");
				}
				else{
					System.out.println("Its my turn!");
					int aiSpot = ai.pickSpot(game);
					game.playTurn(aiSpot);
					System.out.println("I picked " + aiSpot + "!");
				}
				System.out.println();
				game.printBoard();
			}
			System.out.println(game.gameOver());
			System.out.println();
			
			System.out.println("Do you want to play again? Y/N");
			
			char response = scan.next().charAt(0);
			doYouWantToPlay = (response == 'Y');
			System.out.println();
			System.out.println();
		}

	}

}
