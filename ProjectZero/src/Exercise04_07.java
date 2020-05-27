import java.util.Scanner;

public class Exercise04_07 {
    public static void main(String[] args) {
        boolean run = true;
        int balance = 0;

        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("---------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택> ");
            int inputSelect = scanner.nextInt();

            if (inputSelect == 1) {
                System.out.print("예금액> ");
                int inputValue = scanner.nextInt();
                balance += inputValue;
            } else if (inputSelect == 2) {
                System.out.print("출금액> ");
                int inputValue = scanner.nextInt();
                balance -= inputValue;
            } else if (inputSelect == 3) {
                System.out.print("잔고> ");
                System.out.println(balance);
            } else if (inputSelect == 4) {
                System.out.println("프로그램 종료");
                run = false;
            }
        }
    }
}