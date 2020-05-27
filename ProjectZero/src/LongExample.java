
public class LongExample {
	public static void main(String[] args) {
		long num1 = 100;
		long num2 = 20L;
		long num3 = 1000000000000000L;
		
		int num4 = Integer.MAX_VALUE; //2147483647
		int num5 = 1;
		
		
		num4 = 2147483644;
		if (num4 <= Integer.MAX_VALUE - num5) {	
			int result = num4 + num5;
			System.out.println("result: " + result);
		} else {
			System.out.println("overflow maxvalue");
		}
		
		int num6, num7;
			num6 = 200000;
			num7 = 50;
		
		if (num6 <= Integer.MAX_VALUE / num7) {
			int result1 = num6 * num7;
			System.out.println("result: " + result1);
		} else {
			System.out.println("overflow maxvalue");
		}
		
	}
}	