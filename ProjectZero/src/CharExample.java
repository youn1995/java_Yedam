public class CharExample {
	public static void main(String[] args) {
		char c1 = 97;
		int int1;
		for (int i=0; i<100; i++) {
			
			int1 = c1++; // char >> int ++c1 c1++
			System.out.println("int1 : " + int1 + ", c1 : " + (char)(c1-1));
			
		}
	}
}	