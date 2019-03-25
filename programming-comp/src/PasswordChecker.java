
public class PasswordChecker {
	private String password;

	public PasswordChecker(String password) {
		this.password = password;
	}

	public boolean isValid() {
		if (password.length() != 6) {
			return false;
		}

		// second condition
		boolean[] usedNum = new boolean[10];
		for (int i = 0; i < password.length(); i++) {
			int num = Character.getNumericValue(password.charAt(i));
			usedNum[num] = true;
		}
		int count = 0;
		for (int i = 0; i < 10; i++) {
			if (usedNum[i] == true) {
				count++;
			}
		}
		if (count < 3) {
			return false;
		}

		// third condition
		for (int i = 1; i < password.length() - 1; i++) {
			int nextNum = Character.getNumericValue(password.charAt(i + 1));
			int num = Character.getNumericValue(password.charAt(i));
			int prevNum = Character.getNumericValue(password.charAt(i - 1));
			if (num - prevNum == 1) {
				if (nextNum - num == 1) {
					return false;
				}
			} else if (prevNum - num == 1) {
				if (num - nextNum == 1) {
					return false;
				}
			}
		}

		// forth condition
		for (int i = 1; i < password.length() - 1; i++) {
			int nextNum = Character.getNumericValue(password.charAt(i + 1));
			int num = Character.getNumericValue(password.charAt(i));
			int prevNum = Character.getNumericValue(password.charAt(i - 1));
			if (num == prevNum && num == nextNum) {
				return false;
			}
		}
		return true;
	}
}
