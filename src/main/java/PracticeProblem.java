public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(sum(1, 2));
		System.out.println(difference(3, 4));
		System.out.println(product(5,6));

	}

	public static int sum(int num, int num2) {
		int sumNum = num + num2;
		return sumNum;

	
	}

	public static int difference(int num3, int num4) {
		int diffNum = num3 - num4;
		return diffNum;


	}

	public static double product(double fracNum, double fracNum2) {
		double productNum = fracNum * fracNum2;
		return productNum;

	}

	public static String removeFirst(String word) {
		return word.substring(1,word.length());

	}

	public static int combinedLength(String word2, String word3) {
		int bothWords = word2.length() + word3.length();
		return bothWords;

	}

	public static boolean isEven(int num5) {
		return num5 % 2 == 0;

	}

	public static boolean isOdd(int num6) {
		return num6 % 2 != 0;
	}

	public static boolean isPositive(int num7) {
		return num7 > 0;

	}

	public static boolean isNegative(int num8) {
		return num8 < 0;

	}

}
