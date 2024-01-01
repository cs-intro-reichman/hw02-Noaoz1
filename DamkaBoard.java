/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int damka = 4;
		String line = "* ";
		while (damka > 1) {
			System.out.println(line * damka);
		}
	}
}
