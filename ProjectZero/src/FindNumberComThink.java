import java.util.*;

public class FindNumberComThink {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // 범위 정하기
        System.out.println("ENTER RANGE YOU WANT TO PLAY");
        System.out.print("INSERT (BETWEEN 1 AND 2,147,483,647) : ");
        
        int userSelRange = 0;
        while(true)
        {
            try {
                userSelRange = scn.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("오류발생");
                scn = new Scanner(System.in);
            }
            
        }
        
        System.out.println();

        int comThinkNum = (int) (Math.random() * userSelRange) + 1; // 유저가 정한 범위안에서 컴퓨터 수 정하기

        int attemptNumber = (int) baseLog(userSelRange, 2); // 제공할 기회 수 정하기
        System.out.println("CHOOSE LEVEL"); // 난이도 선택
        System.out.println("1: EASY, 2:NOMAL, 3:HARD");
        System.out.print("INSERT: ");
        int selectLevel = scn.nextInt();
        attemptNumber = chooseLevel(attemptNumber, userSelRange, selectLevel);

        int userSelectNum = 0;
        int minNum = 1;
        int maxNum = userSelRange;

        for (int i = 1; i <= attemptNumber; i++) {
            System.out.println();
            System.out.println(i + " ATTEMPT");
            System.out.print("INSERT: ");
            userSelectNum = scn.nextInt();
            System.out.println("-----------------------------------------");
            int talkBackNum = upDownTalkBack(userSelectNum, comThinkNum, userSelRange);
            System.out.println("-----------------------------------------");
            if (comThinkNum == userSelectNum) {
                break;
            }
            if (selectLevel == 1 || selectLevel == 2) { // 힌트제공
                if (talkBackNum == 2) {
                    minNum = userSelectNum;
                    System.out.println(minNum + " < FIND IN < " + maxNum);
                    System.out.println("-----------------------------------------");
                } else if (talkBackNum == 3) {
                    maxNum = userSelectNum;
                    System.out.println(minNum + " < FIND IN < " + maxNum);
                    System.out.println("-----------------------------------------");
                }
            } else if (selectLevel == 3) {

            }
        }

        if (comThinkNum != userSelectNum) { // 정답을 못 맞추면 출력
            System.out.println("YOU LOSE ANSER IS " + comThinkNum);
        }
    }

    public static int chooseLevel(int attemptNumber, int userSelRange, int selectLevel) {
        System.out.println("-----------------------------------------");
        if (selectLevel == 1) {
            System.out.println("YOU CAN GET ONE MORE CHANCE");
            attemptNumber = attemptNumber + 1;
        } else if (selectLevel == 2) {
            System.out.println("PLAY IN DEFALUT SETTING");
        } else if (selectLevel == 3) {
            System.out.println("HARD MODE DOSEN'T TELL RANGE HINT FOR YOU");
            if (userSelRange >= 4) {
                System.out.println("YOUR CHANE WILL BE ONE LESS THAN NOMAL");
                attemptNumber = attemptNumber - 1;
            } else {
                System.out.println("YOUR CHANCE WILL NOT BE CHAGE");
            }
        } else {

        }
        System.out.println("-----------------------------------------");
        System.out.println("YOU HAVE " + attemptNumber + " CHANCE");
        System.out.println();
        return attemptNumber;
    }

    public static int upDownTalkBack(int num, int comThinkNum, int userSelRange) {
        if (num > userSelRange || num < 1) {
            System.out.println("INSERT BETWEEN 1 AND " + userSelRange);
            return 0;
        } else if (comThinkNum == num) {
            System.out.println("YOU WIN");
            return 1;
        } else if (comThinkNum > num) {
            System.out.println("UP");
            return 2;
        } else if (comThinkNum < num) {
            System.out.println("DOWN");
            return 3;
        } else {
            System.out.println("INSERT CORRECT NUMBER IN CORRECT RANGE");
            return 4;
        }
    }

    public static double baseLog(double x, double base) {
        return Math.log(x) / Math.log(base);
    }

}
