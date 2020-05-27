
public class ForSumExample {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i = i + 5) {
            sum = sum + i;
        }
        System.out.println(sum);

        int sum2 = 0;
        for (int i = 0; i <= 100;) {
            sum2 = sum2 + i;
            i = i + 5;
        }
        System.out.println(sum2);

        int sum1 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                sum1 = sum1 + i;
            }
        }
        System.out.println(sum1);

    }
}