
public class EvenSumExample {
    public static void main(String[] args) {
        /*
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                continue; //, break는 반복문을 빠져나오는 목적으로 사용
            }
            sum = sum + i;
        }
        System.out.println(sum);
        */
        for(int i = 1; i <= 100; i++) {
            if((i % 2 == 0) || (i % 3 == 0)) { //조건합: 조건A || 조건B || OR이라는 의미 
                System.out.println("2 또는 3의 배수: " + i);
            }
        }
        for(int i = 1; i <= 100; i++) {
            if((i % 2 == 0) && (i % 3 == 0) && (i % 5 == 0)) { //조건A && 조건B && and라는 의미
                System.out.println("2, 3, 5의 배수: " + i);
            }
            if (!(i % 2 == 0)) {  // ! Not의 의미
                System.out.println("홀수값: " + i);
            }
        }


    }
}