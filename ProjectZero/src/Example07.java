import java.util.Scanner;

public class Example07 {
    public static void main(String[] args) {
        boolean run = true;
        int balance = 0;

        Scanner scn = new Scanner(System.in);

        while(run) {
            System.out.println("---------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택 > ");
            int menuSelect = scn.nextInt();scn.nextLine(); //엔터를 처리하기위해 nextline을 붙여야함
            if(menuSelect == 1) {
                System.out.print("예금액 > ");
                balance += scn.nextInt(); 
            } else if(menuSelect == 2) {
                System.out.print("출금액 > ");
                balance -= scn.nextInt();
            } else if(menuSelect == 3) {
                System.out.println("잔고 > "+balance);
            } else if(menuSelect == 4){
                System.out.println("종료 선택");
                run = false;
            }
            
        } //end of while
        System.out.println("프로그램 종료");

    } // emd of main
} // emd of class