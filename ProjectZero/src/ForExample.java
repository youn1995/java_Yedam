
public class ForExample {
    public static void main(String[] args) {
        int sum = 0;
        /*
        sum = sum + 1; // sum => 1
        sum = sum + 2; // sum => 3
        sum = sum + 3; // sum => 6
        sum = sum + 4; // sum => 10
        sum = sum + 5; // sum => 15
        

        for (int i=1; i<=5; i++){
            sum = sum + i;
            System.out.println(sum + ", " +i);
        }
        
        System.out.println("sum: " + sum);
        */
        int input_num = 3;
        for (int i=1; i<=9; i++) {
            System.out.println(input_num + " * " + i + " = " + (input_num * i));
        }

    }
}