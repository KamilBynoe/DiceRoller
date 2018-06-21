import java.util.Random;


public class DiceRoller {
	Random rng = new Random();
	String ledger;
	public static void main (String[] args) {
	}
	
	public int rollDie (int dieSize) {
		return rng.nextInt(dieSize);
	}
	
	public int rollDice(int diceCount, int dieSize) {
		int diceTotal = 0;
		for (int i = 0; i < diceCount; i++) {
			diceTotal += rollDie(dieSize);
		}
		return diceTotal;
	}
}
