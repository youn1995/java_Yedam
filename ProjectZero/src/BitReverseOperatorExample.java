public class BitReverseOperatorExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = ~num1;
		int num3 = num2 + 1;

		// java2 conflict

		String returnValue1 = toBinaryString(num1);
		System.out.println(returnValue1);

		String returnValue2 = toBinaryString(num2);
		System.out.println(returnValue2);

		String returnValue3 = toBinaryString(num3);
		System.out.println(returnValue3);
	}

	public static String toBinaryString(int val) {
		String str = Integer.toBinaryString(val);
		while (str.length() < 32) {
			str = "0" + str;

		}
		return str;

	}
}