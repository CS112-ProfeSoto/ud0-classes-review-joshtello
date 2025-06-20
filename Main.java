/**
 * Driver program that creates standard 52-card deck (as Card array)
 * and prints out each card in deck.
 *
 * @author ???
 * @version ???
 */

public class Main {

	/* ALGORITHM
	*
	1. Generate 52 card deck into Card array
	- ???
	2. Print deck (simple)
	- ???
	*
	*/
	public static void main(String[] args) {
		/*** RUNNING TESTER ***/
		//uncomment line below to run CardTester:
		CardTester.main(null);

		/*** DRIVER PROGRAM ***/
		//1. Generate 52 card deck into Card array
		Card cards = new Card();
		cards.getPrintCard();

		//2. Print deck
		cards.printCard();
	}
}