
public class ForRemind2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if ((i % 2 == 0) && (i % 3 == 0)) {
                System.out.println(i + "는 2와 3의 배수입니다.");
            } else if ((i % 2 == 0) || (i % 3 == 0)) {
                System.out.println(i + "는 2 또는 3의 배수입니다.");
            } else {
                continue;
            }
        }
        System.out.println("End of Program");
    }
}