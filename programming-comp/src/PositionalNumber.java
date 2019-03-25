
public class PositionalNumber {
	private int a;
	private int b;

	public PositionalNumber(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public boolean isPositional() {
		if (this.a == this.b) {
			return true;
		}
		// convert the first number into character array
		// shift index and compare with the second number
		String numString = Integer.toString(a);
		for (int i = 1; i < numString.length(); i++) {
			String newNumber = numString.substring(i)
					+ numString.substring(0, i);
			if (Integer.valueOf(newNumber) == this.b) {
				return true;
			}
		}
		return false;
	}
}
