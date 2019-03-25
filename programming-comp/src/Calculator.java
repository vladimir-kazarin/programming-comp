
public class Calculator {

	public Calculator() {
	}

	public int getMean(int[] numArr) {
		int sum = 0;
		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i] == 0) {
				int mean = (int) sum / (i - 1);
				return mean;
			}
			sum += numArr[i];
		}
		return 0;
	}

	public void printValues(int[] numArr, int mean) {
		System.out.println("----------");
		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i] == 0) {
				break;
			}
			if (numArr[i] < mean) {
				if (numArr[i + 1] == 0) {
					System.out.println(numArr[i] + "     " + "*");
				} else {
					System.out.println(numArr[i] + "     " + numArr[i + 1]);
				}

				i++;
			} else if (numArr[i] >= mean) {
				if (numArr[i + 1] == 0) {
					System.out.println("*" + "     " + numArr[i]);
				} else {
					System.out.println(numArr[i + 1] + "     " + numArr[i]);
				}

				i++;
			}
		}
		System.out.println("----------");
	}

	public String sum(String num1, String num2) {
		// get base
		String[] arrStr1 = num1.split("_");
		String[] arrStr2 = num2.split("_");
		int base = Integer.parseInt(arrStr1[1]);

		int num1_dec = Integer.parseInt(
				Integer.toString(Integer.parseInt(arrStr1[0], base), 10));
		int num2_dec = Integer.parseInt(
				Integer.toString(Integer.parseInt(arrStr2[0], base), 10));
		return Integer.toString(num1_dec + num2_dec, base) + "_" + base;
	}
}
