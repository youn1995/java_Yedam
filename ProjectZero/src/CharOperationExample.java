
public class CharOperationExample {
    public static void main(String[] args) {
        int v1 = 5;
        int v2 = 2;

        int result = v1 / v2; // 2
        double result1 = (double) v1 / v2; // 2.5
        System.out.println(result1);

        result = sum(10, 15);
        System.out.println("result: " + result);

        result = minus(v1, v2);
        System.out.println("result: " + result);

        double result2 = divide(v1, v2);
        System.out.println("result: " + result2);

    } // end of main()

    public static int sum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    } // end of sum()

    public static int minus(int num1, int num2) {
        int result = num1 - num2;
        return result;
    } // end of minus()

    public static double divide(int num1, int num2) {
        double result = (double) num1 / num2;
        return result;

    } // end of divide()

}