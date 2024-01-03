import java.util.Random;

/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main(String[] args) {
		int T = Integer.parseInt(args[0]);
		boolean girl = false;
		boolean boy = false;
		int count = 0;
		double totalchildrencount = 0.0;
		int f2 = 0;
		int f3 = 0;
		int f4 = 0;
		for (int i = 0; i < T; i++) {
			while ((girl == false) | (boy == false)) {
				double rnd = (double) Math.random();
				if (rnd < 0.5) {
					boy = true;
				} else {
					girl = true;
				}
				count++;
				totalchildrencount++;
			}
			if (count == 2) f2++;
			else if (count == 3) f3++;
			else f4++;
			count = 0;
			boy = false;
			girl = false;
		}
		int common = 0;
		if ((f2 >= f3) && (f2 >= f4)) common = f2;
		else if (f3 >= f4) common = f3;
		else common = f4;
		System.out.println("Average: " + (totalchildrencount / T) + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + f2);
		System.out.println("Number of families with 3 children: " + f3);
		System.out.println("Number of families with 4 or more children: " + f4);
		if ((f2 >= f3) && (f2 >= f4)) {
			System.out.println("The most common number of children is 2.");
		}
	}
}
