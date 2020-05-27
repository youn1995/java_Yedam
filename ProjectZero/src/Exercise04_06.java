
public class Exercise04_06 {
    public static void main(String[] args) {
        int num1 = 5;
        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}