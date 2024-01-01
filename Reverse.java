import str.string;

/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args) {
		String a = "abc";
		String flip = "";
		for (int i = (str.length(a)-1) ; i == 0 ; i--){
			flip = flip +  str.charAt(i);
		}
		char b;
		b =  str.charAt((str.length(flip))/2+1);
		System.out.println(flip);
		System.out.println("The middle character is" + b);
		}
	}
