public class BooleanExample {
	public static void main(String[] args) {
		boolean isTrue = false; // or true
		isTrue = true;
		
		int num1, num2;
		num1 = 19;
		num2 = 29;
		
		isTrue = num1 > num2;// 10 == 10 
		
		if (isTrue) {
			System.out.println("num1 is lager than num2");
			
		} else {
			System.out.println("num2 is lager than num1");
		}
	}
}