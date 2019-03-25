import java.util.Scanner;

public class Project {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What task: ");
		int option = scan.nextInt();
		switch (option) {
		case 1:
			positionalNumbers();
			break;
		case 2:
			password();
			break;
		case 3:
			mean();
			break;
		case 4:
			base();
			break;
		}
	}

	public static void positionalNumbers() {
		while (true) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			if (a == -1 && b == -1) {
				break;
			}
			PositionalNumber numberChecker = new PositionalNumber(a, b);
			if (numberChecker.isPositional()) {
				System.out.println("They are positional");
			} else {
				System.out.println("They are not positional");
			}
		}
	}

	public static void password() {
		while (true) {
			String password = scan.next();
			if (password.equals("0")) {
				break;
			}
			PasswordChecker paaswordChecker = new PasswordChecker(password);
			if (paaswordChecker.isValid()) {
				System.out.println("Accepted");
			} else {
				System.out.println("Rejected");
			}
		}
	}

	public static void mean() {
		int[] numArr = new int[9999];
		Calculator calc = new Calculator();
		int i = 0;
		while (true) {
			int num = scan.nextInt();
			if (num == -1) {
				break;
			} else if (num == 0) {
				int mean = calc.getMean(numArr);
				calc.printValues(numArr, mean);
			}
			numArr[i] = num;
			i++;
		}
	}

	public static void base() {
		while (true) {
			String num1 = scan.next();
			if (num1.equals("-1")) {
				break;
			}
			scan.next();
			String num2 = scan.next();
			Calculator calc = new Calculator();
			System.out.println("result: " + calc.sum(num1, num2));
		}
	}
}
