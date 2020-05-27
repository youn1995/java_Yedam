
public class Exercise_pyramid {
    public static void main(String[] args) {
        printPyramid(5);
        printReversePyramid(5);

        printRhombus(8);
    }

    public static void printPyramid(int num) {
        for (int i = 1; i <= num; i++) {
            for (int k = num; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j < i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printReversePyramid(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = num; k >= i; k--) {
                if (k == i) {
                    System.out.print("*");
                } else {
                    System.out.print("**");
                }
            }
            System.out.println();
        }
    }

    public static void printRhombus(int num) {
        for (int i = 1; i <= num; i++) {
            for (int k = num; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j < i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= num-1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = num-1; k >= i; k--) {
                if (k == i) {
                    System.out.print("*");
                } else {
                    System.out.print("**");
                }
            }
            System.out.println();
        }
    }
}