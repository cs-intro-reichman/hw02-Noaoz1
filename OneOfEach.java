
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean girl = false;
		boolean boy = false;
		int count = 0;
		String children = "";
		while ((girl == false) || (boy == false)) {
			double rnd = (double)Math.random();
			if (rnd < 0.5) {
				boy = true;
				children = children + "b ";
			}
			else {
				girl = true;
				children = children + "g ";
			}
			count++;
		}
		System.out.println(children);
		System.out.println("You made it... and you now have " + count + " children");
	}
}
