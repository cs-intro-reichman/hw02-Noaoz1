import str.string;

/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args) {
		String a = (args[0]);
		String flip = "";
		int l = a.length();
		for (int i = (l-1) ; i == 0 ; i--){
			flip = flip + a.charAt(i);
		}
		char b;
		b =  flip.charAt((flip.length()-1)/2);
		System.out.println(flip);
		System.out.println("The middle character is" + b);
		}
	}