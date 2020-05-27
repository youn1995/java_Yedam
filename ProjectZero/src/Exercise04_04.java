
public class Exercise04_04 {
    public static void main(String[] args) {
        boolean res = true;
        while (res) {
            int i = (int) ((Math.random() * 6) + 1);
            int j = (int) ((Math.random() * 6) + 1);
            System.out.println("(" + i + ", " + j + ")");
            if (i + j == 5) {
                res = false;
            }
        }
    }
}