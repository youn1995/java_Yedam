
public class IfNestedExample {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1; // 1보다는 크지만 7보다는 작은수(int에 담았기에 소수자리를 버림) math.random() => 0<임의의 수 <1,

        if (num == 1) {
            System.out.println("Random Dice 1!");
        } else if (num == 2) {
            System.out.println("Random Dice 2!");
        } else if (num == 3) {
            System.out.println("Random Dice 3!");
        } else if (num == 4) {
            System.out.println("Random Dice 4!");
        } else if (num == 5) {
            System.out.println("Random Dice 5!");
        } else {
            System.out.println("Random Dice 6!");
        }
        System.out.println("End of Program");
    }
}