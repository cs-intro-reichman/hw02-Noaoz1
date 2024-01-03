/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int damka = Integer.parseInt(args[0]);
		int count = 0;
		for (int i = damka; i != 0; i--) {
			System.out.println();
			if (count % 2 != 0) {
				System.out.print(" ");
			}
			for (int j = damka; j != 0; j--) {
				System.out.print("* ");
			}
			count ++;
		}
	}
}


