/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int a = 6;
		int divisor = a - 1;
		int sum = 0;
		String AllDivisor = "";
		while (divisor > 0){
			if (a % divisor == 0) {
				sum = sum + divisor;
				AllDivisor = AllDivisor + divisor + "+";
			}
			divisor = divisor - 1;
		}
		if (sum == a){
			System.out.println(a + " is a perfect number since " + a + "=" + AllDivisor);
		}
		else{
			System.out.println(a + " is not a perfect number");
		}
	}
}
