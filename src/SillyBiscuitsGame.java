/* The player who takes the last biscuit wins
*/
import java.util.Scanner;

public class SillyBiscuitsGame {
	public static void main(String[] args) {

		//6 Biscuits at the start of the game
		final int BARREL_ONE = 6;

		//8 Biscuits at the start of the game
		final int BARREL_TWO = 8;

		//Initializing players turn, Player 1 starts the game
		int turn = 1;

		//Messages of the game
		final String BISCUITS_LEFT_BARREL_ONE = "Biscuits Left - Barrel 1: ";
		final String BISCUITS_LEFT_BARREL_TWO = "Biscuits Left - Barrel 2: ";
		final String PLAYER_TURN = "Player Turn: ";
		final String PLAYER_CHOICE = "Choose a barrel: barrel1 (one), barrel2 (two), "
				+ "or both (both), or skip turn (skip)? ";
		final String WIN_MESSAGE = "Winner is Player ";

		int gameWinner = 0;

		//declare below so not magic number
		int barrelOne = BARREL_ONE;
		int barrelTwo = BARREL_TWO;

		//Initializing Scanner for input
		Scanner in = new Scanner(System.in);

		//Loop runs until both barrels reach 0
		while (barrelOne != 0 || barrelTwo != 0) {
		
			System.out.println(BISCUITS_LEFT_BARREL_ONE + barrelOne);
			System.out.println(BISCUITS_LEFT_BARREL_TWO + barrelTwo);
			System.out.println(PLAYER_TURN + turn);
			System.out.print(PLAYER_CHOICE);
			String playerInput = in.next(); //Player input
		
			System.out.print("How many biscuits are you taking? ");
			int biscuitsInput = in.nextInt(); //Player input

				switch (playerInput) {
					case "one" ->  // if "one" subtract from Barrel 1
						barrelOne = barrelOne - biscuitsInput;
					case "two" ->  // if "two" subtract from Barrel 2
						barrelTwo = barrelTwo - biscuitsInput;
					case "both" -> {  // if "both" subtract from both Barrels
						barrelOne = barrelOne - biscuitsInput;
						barrelTwo = barrelTwo - biscuitsInput;
					}
				}

			if (turn == 1) {
				turn = 2;
				gameWinner = 1;
			} else {
				turn = 1;
				gameWinner = 2;
			}
		
		}
		
		// Output of finished game
		System.out.println(BISCUITS_LEFT_BARREL_ONE + barrelOne);
		System.out.println(BISCUITS_LEFT_BARREL_TWO + barrelTwo);
		System.out.println(WIN_MESSAGE + gameWinner);
		
	}
}